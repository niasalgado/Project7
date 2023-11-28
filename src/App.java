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
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Weapon axe = new Weapon("axe",5 , "to slice anyone or anything within 10 feet", "cudgel");
    Weapon bo = new Weapon("bo", 3, "to bludgeon anyone or anything within 10 feet", "staff");
    Weapon grenade = new Weapon("grenade", 6, "destorys everything within 25 feet of explosion site", "explosive");
    Weapon sleepSpell = new Weapon("sleepSpell", 5, "puts named person to sleep, must be within 20 feet of initiator.", "spell");

    public void start(Stage stage) {
        GridPane pane = new GridPane();

        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(15, 15, 15, 15));
        pane.setHgap(20);
        pane.setVgap(20);

        // TODO: add area for the warrior/hero photos above the buttons
        // heroes and monsters buttons
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


        // compare buttons
        Button compareWarrBtn1 = new Button("Warrior vs Ogre");
        pane.add(compareWarrBtn1, 3, 6);
        compareWarrBtn1.setVisible(false);

        Button compareWarrBtn2 = new Button("Warrior vs Troll");
        pane.add(compareWarrBtn2, 3, 7);
        compareWarrBtn2.setVisible(false);

        Button compareFaerieBtn1 = new Button("Faerie vs Ogre");
        pane.add(compareFaerieBtn1, 3, 8);
        compareFaerieBtn1.setVisible(false);

        Button compareFaerieBtn2 = new Button("Faerie vs Troll");
        pane.add(compareFaerieBtn2, 3, 9);
        compareFaerieBtn2.setVisible(false);


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
                    Warrior warrior = new Warrior("Mulan", 5, "healthy", weapons, false);
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
                    Faerie faerie = new Faerie("Tinkerbell", 5, "healthy", weapons, 2.5);
                    // TODO: change the SOP line below to display the created instance on the FX stage
                    System.out.println(faerie.getName());
                    faerieBtn.setVisible(false);
                    ogreBtn.setVisible(true);
                } catch (HeroStrengthException e1) {
                    System.out.println(e1);
                }
            }
        });

        // ogre handler
        ogreBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ArrayList<Weapon> weapons = new ArrayList<Weapon>(Arrays.asList(bo, grenade));
                Ogre ogre = new Ogre("Shrek", "swamp", "low", 6, weapons, false);
                // TODO: change the SOP line below to display the created instance on the FX stage
                System.out.println(ogre.getName());
                ogreBtn.setVisible(false);
                trollBtn.setVisible(true);
            }
        });

        // troll handler
        trollBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ArrayList<Weapon> weapons = new ArrayList<Weapon>(Arrays.asList(bo, grenade));
                Troll troll = new Troll("Mike", "office", "low", 2, weapons, 3.0);
                // TODO: change the SOP line below to display the created instance on the FX stage
                System.out.println(troll.getName());
                trollBtn.setVisible(false);

                compareWarrBtn1.setVisible(true);
                compareWarrBtn2.setVisible(true);
                compareFaerieBtn1.setVisible(true);
                compareFaerieBtn2.setVisible(true);

                compares();
            }
        });

        stage.setTitle("My FX App");
        stage.setScene(scene);
        stage.show();
    }

    // TODO: compares heros vs monster depending on what button the user clicks
     public void compares() {
        System.out.println("comapres");
    }
}