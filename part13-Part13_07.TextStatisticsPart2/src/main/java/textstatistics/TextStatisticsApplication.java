package textstatistics;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        TextArea textArea = new TextArea("");

        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longestWord = new Label("The longest word is:");

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int numberOfLetters = newValue.length();
            letters.setText("Letters: " + numberOfLetters);

            String[] parts = newValue.split(" ");

            int numberOfWords = parts.length;
            words.setText("Words: " + numberOfWords);

            String longest = parts[0];
            for (int i = 0; i < parts.length; i++) {
                if (longest.length() < parts[i].length()) {
                    longest = parts[i];
                }
            }
            longestWord.setText("The longest word is: " + longest);
        });

        HBox textComponents = new HBox();
        textComponents.setSpacing(10);
        textComponents.getChildren().add(letters);
        textComponents.getChildren().add(words);
        textComponents.getChildren().add(longestWord);

        layout.setCenter(textArea);
        layout.setBottom(textComponents);

        Scene scene = new Scene(layout);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setTitle("Text statistics");
        window.setScene(scene);
        window.show();
    }

}
