package textstatistics;

import javafx.application.Application;
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

        HBox textComponents = new HBox();
        textComponents.setSpacing(10);
        textComponents.getChildren().add(new Label("Letters: 0"));
        textComponents.getChildren().add(new Label("Words: 0"));
        textComponents.getChildren().add(new Label("The longest word is:"));

        layout.setCenter(new TextArea(""));
        layout.setBottom(textComponents);

        Scene scene = new Scene(layout);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setTitle("Text statistics");
        window.setScene(scene);
        window.show();
    }

}
