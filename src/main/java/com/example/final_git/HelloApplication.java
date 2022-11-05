package com.example.final_git;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        System.out.println("hello");
        System.out.println("whats upp");
        System.out.println("welcome");
        System.out.println("ljlkjlj");
        System.out.println("ljlkjlj");
        System.out.println("ljlkjlj");
        System.out.println("1 more");
        System.out.println("2 more");
        System.out.println("3 more");
        System.out.println("4 more");
        System.out.println("45more");
        //hello
    }
}