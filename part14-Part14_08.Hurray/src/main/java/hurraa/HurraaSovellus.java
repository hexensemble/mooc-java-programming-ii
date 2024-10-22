package hurraa;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //'javafx.scene.media.AudioClip' does not exist!
        //AudioClip sound = new AudioClip("file:Applause-Yannick_Lemieux.wav");

        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");
        nappi.setOnAction((event) -> {
            System.out.println("sound.play()");
        });
        pane.setCenter(nappi);

        Scene scene = new Scene(pane, 600, 400);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
