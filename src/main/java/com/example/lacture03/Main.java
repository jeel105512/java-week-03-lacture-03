package com.example.lacture03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("war-game-view.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hand-view.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("guesing-card-game.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("Welcome to the Card War-Game!");
        stage.setTitle("Memory Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}