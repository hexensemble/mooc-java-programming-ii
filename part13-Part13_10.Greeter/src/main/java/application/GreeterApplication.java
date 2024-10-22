package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        GridPane layout1 = new GridPane();
        GridPane layout2 = new GridPane();

        Label prompt = new Label("Enter your name and start.");
        TextField box = new TextField();
        Button button = new Button("Start");
        Label name = new Label("");

        layout1.add(prompt, 0, 0);
        layout1.add(box, 0, 1);
        layout1.add(button, 0, 2);
        layout1.setPrefSize(300, 180);
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));

        layout2.add(name, 0, 0);
        layout2.setPrefSize(300, 180);
        layout2.setAlignment(Pos.CENTER);

        Scene scene1 = new Scene(layout1);
        scene1.getRoot().setStyle("-fx-font-family: 'serif'");
        Scene scene2 = new Scene(layout2);
        scene2.getRoot().setStyle("-fx-font-family: 'serif'");

        button.setOnAction((event) -> {
            name.setText("Welcome " + box.getText() + "!");

            window.setScene(scene2);
        });

        window.setTitle("Greeter");
        window.setScene(scene1);
        window.show();
    }
}
