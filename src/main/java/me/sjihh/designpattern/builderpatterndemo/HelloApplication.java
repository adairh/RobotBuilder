package me.sjihh.designpattern.builderpatterndemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static HelloApplication application;
    private SpriteAnimationController spriteAnimationController;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        application = this;
        spriteAnimationController = fxmlLoader.getController();

        //spriteAnimationController.changeImage();

        stage.setResizable(false);
        stage.setTitle("Build your robot!");
        stage.setScene(scene);
        stage.show();
    }

    public SpriteAnimationController getSpriteAnimationController() {
        return spriteAnimationController;
    }

    public static HelloApplication getApplication() {
        return application;
    }

    public static void main(String[] args) {
        launch(args);
    }
}