package jfx8;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Jfx8Test extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("Hi!");
        stage.setScene(new Scene(button, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}