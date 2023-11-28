/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : App.java
 *******************************************/

import java.util.ArrayList;
import java.util.Arrays;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        Weapon axe = new Weapon("axe",5 , "to slice anyone or anything within 10 feet", "cudgel");
        Weapon bo = new Weapon("bo", 3, "to bludgeon anyone or anything within 10 feet", "staff");
        Weapon grenade = new Weapon("grenade", 6, "destorys everything within 25 feet of explosion site", "explosive");
        Weapon sleepSpell = new Weapon("sleepSpell", 5, "puts named person to sleep, must be within 20 feet of initiator.", "spell");

        GridPane pane = new GridPane();

        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(15, 15, 15, 15));
        pane.setHgap(20);
        pane.setVgap(20);

        Button warriorBtn = new Button("Create Warrior");
        pane.add(warriorBtn, 1, 4);

        Button faerieBtn = new Button("Create Faerie");
        pane.add(faerieBtn, 1, 4);
        faerieBtn.setVisible(false);

        Button ogreBtn = new Button("Create Ogre");
        pane.add(ogreBtn, 1, 4);
        ogreBtn.setVisible(false);

        Button trollBtn = new Button("Create Troll");
        pane.add(trollBtn, 1, 4);
        trollBtn.setVisible(false);


        Button compareWarrBtn1 = new Button("Warrior vs Ogre");
        pane.add(compareWarrBtn1, 3, 6);

        Button compareWarrBtn2 = new Button("Warrior vs Troll");
        pane.add(compareWarrBtn2, 3, 7);

        Button compareFaerieBtn1 = new Button("Faerie vs Ogre");
        pane.add(compareFaerieBtn1, 3, 8);

        Button compareFaerieBtn2 = new Button("Faerie vs Troll");
        pane.add(compareFaerieBtn2, 3, 9);


        Label message = new Label();
        pane.add(message, 0, 5);
        message.setTextFill(Color.RED);

        Scene scene = new Scene(pane, 600, 600);


        // warrior handler
        warriorBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ArrayList<Weapon> weapons = new ArrayList<Weapon>(Arrays.asList(axe, bo, grenade));

                try {
                    Warrior warrior = new Warrior("Mightus", 5, "healthy", weapons, false);
                    // TODO: change the SOP line below to display the created instance on the FX stage
                    System.out.println(warrior.getName());
                    warriorBtn.setVisible(false);
                    faerieBtn.setVisible(true);
                } catch (HeroStrengthException e1) {
                    System.out.println(e1);
                }
            }
        });

        // faerie handler
        faerieBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ArrayList<Weapon> weapons = new ArrayList<Weapon>(Arrays.asList(sleepSpell));

                try {
                    Faerie faerie = new Faerie("Lilly", 5, "healthy", weapons, 2.5);
                    // TODO: change the SOP line below to display the created instance on the FX stage
                    System.out.println(faerie.getName());
                    faerieBtn.setVisible(false);
                    ogreBtn.setVisible(true);
                } catch (HeroStrengthException e1) {
                    System.out.println(e1);
                }
            }
        });

        stage.setTitle("My FX App");
        stage.setScene(scene);
        stage.show();
    }
}