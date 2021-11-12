package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Click");
        Group group = new Group(button);
        Scene scene = new Scene(group, 600, 600);

        Duration duration = Duration.millis(1000);
        TranslateTransition transition = new TranslateTransition(duration, button);
        transition.setByX(200);
        transition.setByY(100);
        transition.setAutoReverse(true);
        transition.setCycleCount(2);
        transition.play();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
