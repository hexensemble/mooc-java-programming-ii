package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        TextField textField = new TextField("");
        Button button = new Button("Update");
        Label label = new Label("");
        
        button.setOnAction((event) -> {
            label.setText(textField.getText());
        });

        VBox components = new VBox();
        components.getChildren().add(textField);
        components.getChildren().add(button);
        components.getChildren().add(label);

        Scene scene = new Scene(components);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setTitle("Notifier");
        window.setScene(scene);
        window.show();
    }

}
