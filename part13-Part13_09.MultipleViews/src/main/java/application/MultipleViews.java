package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout1 = new BorderPane();
        VBox layout2 = new VBox();
        GridPane layout3 = new GridPane();

        Button scene1Button = new Button("To the second view!");
        layout1.setTop(new Label("First view!"));
        layout1.setCenter(scene1Button);

        Button scene2Button = new Button("To the third view!");
        layout2.getChildren().add(scene2Button);
        layout2.getChildren().add(new Label("Second view!"));

        Button scene3Button = new Button("To the first view!");
        layout3.add(new Label("Third view!"), 0, 0);
        layout3.add(scene3Button, 1, 1);

        Scene scene1 = new Scene(layout1);
        Scene scene2 = new Scene(layout2);
        Scene scene3 = new Scene(layout3);
        scene1.getRoot().setStyle("-fx-font-family: 'serif'");
        scene2.getRoot().setStyle("-fx-font-family: 'serif'");
        scene3.getRoot().setStyle("-fx-font-family: 'serif'");

        scene1Button.setOnAction((event) -> {
            window.setScene(scene2);
        });
        scene2Button.setOnAction((event) -> {
            window.setScene(scene3);
        });
        scene3Button.setOnAction((event) -> {
            window.setScene(scene1);
        });

        window.setTitle("Multiple views");
        window.setScene(scene1);
        window.show();
    }

}
