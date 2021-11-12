package sample;

import javafx.animation.ScaleTransition;
import javafx.animation.Transition;
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

        Duration translateDuration = Duration.millis(1000L);
        TranslateTransition translateTransition = new TranslateTransition(translateDuration, button);
        translateTransition.setByX(200);
        translateTransition.setByY(100);

        Duration scaleDuration = Duration.millis(1500L);
        ScaleTransition scaleTransition = new ScaleTransition(scaleDuration, button);
        scaleTransition.setByX(1.5);
        scaleTransition.setByY(1.5);

        button.setOnMouseEntered(event -> {
            translateTransition.play();
            scaleTransition.play();
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
