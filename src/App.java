/******************************************
 *  Author : Nia Salgado   
 *  Created On : Wed Nov 22 2023
 *  File : App.java
 *******************************************/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
	Pane pane = new Pane();

        Scene scene = new Scene(pane, 300, 300);

        stage.setTitle("My FX App");
        stage.setScene(scene);
        stage.show();
    }
}