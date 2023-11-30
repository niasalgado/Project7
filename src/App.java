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

    public void start(Stage stage) throws HeroStrengthException {
        ArrayList<Weapon> weapons = null;
    
        Weapon axe = new Weapon("axe",5 , "to slice anyone or anything within 10 feet", "cudgel");
        Weapon bo = new Weapon("bo", 3, "to bludgeon anyone or anything within 10 feet", "staff");
        Weapon grenade = new Weapon("grenade", 6, "destorys everything within 25 feet of explosion site", "explosive");
        Weapon sleepSpell = new Weapon("sleepSpell", 5, "puts named person to sleep, must be within 20 feet of initiator.", "spell");

        Warrior warrior = new Warrior("Mulan", 5, "healthy", weapons, false);
        Faerie faerie = new Faerie("Tinkerbell", 5, "healthy", weapons, 2.5);
        Ogre ogre = new Ogre("Shrek", "swamp", "low", 6, weapons, false);
        Troll troll = new Troll("Mike", "office", "low", 2, weapons, 3.0);
        
        GridPane pane = new GridPane();

        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(15, 15, 15, 15));
        pane.setHgap(20);
        pane.setVgap(20);

        // TODO: add area for the warrior/hero photos above the buttons

        // heroes and monsters buttons
        Button warriorBtn = new Button("Create Warrior");
        pane.add(warriorBtn, 3, 4);

        Button faerieBtn = new Button("Create Faerie");
        pane.add(faerieBtn, 3, 4);
        faerieBtn.setVisible(false);

        Button ogreBtn = new Button("Create Ogre");
        pane.add(ogreBtn, 3, 4);
        ogreBtn.setVisible(false);

        Button trollBtn = new Button("Create Troll");
        pane.add(trollBtn, 3, 4);
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

        // text fields for results outputs
        Label msg = new Label();
        pane.add(msg, 0, 11);

        Label msg2 = new Label();
        pane.add(msg2, 0, 12);

        Label msg3 = new Label();
        pane.add(msg3, 0, 13);

        Label msg4 = new Label();
        pane.add(msg4, 0, 14);

        Label msgA = new Label();
        pane.add(msgA, 2, 11);

        Label msgB = new Label();
        pane.add(msgB, 2, 12);

        Label msgC = new Label();
        pane.add(msgC, 2, 13);

        Label msgD = new Label();
        pane.add(msgD, 2, 14);


        Scene scene = new Scene(pane, 600, 600);

         // warrior handler
        warriorBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ArrayList<Weapon> weapons = new ArrayList<Weapon>(Arrays.asList(axe, bo, grenade));
                warrior.setWeapons(weapons);
                System.out.println(warrior.getName() + " " + warrior.getWeapons());
                msg.setText(warrior.getName() + " " + warrior.getWeapons());
                warriorBtn.setVisible(false);
                faerieBtn.setVisible(true);
            }
        });

        // faerie handler
        faerieBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ArrayList<Weapon> weapons = new ArrayList<Weapon>(Arrays.asList(sleepSpell));
                faerie.setWeapons(weapons);
                System.out.println(faerie.getName() + " " + faerie.getWeapons());
                msg2.setText(faerie.getName() + " " + faerie.getWeapons());
                faerieBtn.setVisible(false);
                ogreBtn.setVisible(true);
            }
        });

        // ogre handler
        ogreBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ArrayList<Weapon> weapons = new ArrayList<Weapon>(Arrays.asList(bo, grenade));
                ogre.setWeapons(weapons);
                System.out.println(ogre.getName() + " " + ogre.getWeapons());
                msg3.setText(ogre.getName() + " " + ogre.getWeapons());
                ogreBtn.setVisible(false);
                trollBtn.setVisible(true);
            }
        });

        // troll handler
        trollBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                ArrayList<Weapon> weapons = new ArrayList<Weapon>(Arrays.asList(axe, bo));
                troll.setWeapons(weapons);
                System.out.println(troll.getName() + " " + troll.getWeapons());
                msg4.setText(troll.getName() + " " + troll.getWeapons());
                trollBtn.setVisible(false);

                compareWarrBtn1.setVisible(true);
                compareWarrBtn2.setVisible(true);
                compareFaerieBtn1.setVisible(true);
                compareFaerieBtn2.setVisible(true);
            }
        });

        // compares warrior to ogre
        compareWarrBtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent e) {
                if (warrior.compareTo(ogre) == 1)
                msgA.setText("Warrior has more strength than ogre");
                else if (warrior.compareTo(ogre) == 0)
                msgA.setText("Both warrior and ogre are equal in strength");
                else 
                msgA.setText("Ogre is stronger than Warrior");
            }
        });

        // compares warrior to troll
        compareWarrBtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent e) {
               if (warrior.compareTo(troll) == 1)
                msgB.setText("Warrior has more strength than troll");
                else if (warrior.compareTo(ogre) == 0)
                msgB.setText("Both warrior and troll are equal in strength");
                else 
                msgB.setText("Troll is stronger than Warrior");
            }
        });

        // compares faerie to ogre
        compareFaerieBtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent e) {
               if (faerie.compareTo(ogre) == 1)
                msgC.setText("Faerie has more strength than ogre");
                else if (faerie.compareTo(ogre) == 0)
                msgC.setText("Both Faerie and ogre are equal in strength");
                else 
                msgC.setText("Ogre is stronger than Faerie");
            }
        });

        // compares faerie to troll
        compareFaerieBtn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent e) {
               if (faerie.compareTo(troll) == 1)
                msgD.setText("Faerie has more strength than troll");
                else if (faerie.compareTo(troll) == 0)
                msgD.setText("Both Faerie and ogre are equal in strength");
                else 
                msgD.setText("troll is stronger than Faerie");
            }
        });

        stage.setTitle("My FX App");
        stage.setScene(scene);
        stage.show();
    }
}