package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VocabularyPracticeApplication extends Application {

    private Dictionary dictionary;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage window) throws Exception {
        PracticeView practiceView = new PracticeView(this.dictionary);
        InputView inputView = new InputView(this.dictionary);

        BorderPane layout = new BorderPane();

        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        menu.getChildren().add(enterButton);
        menu.getChildren().add(practiceButton);

        enterButton.setOnAction((event) -> {
            layout.setCenter(inputView.getView());
        });
        practiceButton.setOnAction((event) -> {
            layout.setCenter(practiceView.getView());
        });

        layout.setTop(menu);
        layout.setCenter(inputView.getView());

        Scene scene = new Scene(layout, 400, 300);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setTitle("Vocabulary practice");
        window.setScene(scene);
        window.show();
    }
}
