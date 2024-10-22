package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explanationButton = new Button("Explanation");

        HBox menu = new HBox();
        menu.getChildren().add(jokeButton);
        menu.getChildren().add(answerButton);
        menu.getChildren().add(explanationButton);
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Label jokeText = new Label("What do you call a bear with no teeth?");
        Label answerText = new Label("A gummy bear.");
        Label explanationText = new Label("Cuz that bear all gum and no tooth!");

        StackPane jokeView = new StackPane();
        jokeView.setPrefSize(300, 180);
        jokeView.getChildren().add(jokeText);
        jokeView.setAlignment(Pos.CENTER);

        StackPane answerView = new StackPane();
        answerView.setPrefSize(300, 180);
        answerView.getChildren().add(answerText);
        answerView.setAlignment(Pos.CENTER);

        StackPane explanationView = new StackPane();
        explanationView.setPrefSize(300, 180);
        explanationView.getChildren().add(explanationText);
        explanationView.setAlignment(Pos.CENTER);

        layout.setTop(menu);
        layout.setCenter(jokeView);

        jokeButton.setOnAction((event) -> {
            layout.setCenter(jokeView);
        });

        answerButton.setOnAction((event) -> {
            layout.setCenter(answerView);
        });

        explanationButton.setOnAction((event) -> {
            layout.setCenter(explanationView);
        });

        Scene scene = new Scene(layout);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setTitle("Joke");
        window.setScene(scene);
        window.show();
    }
}
