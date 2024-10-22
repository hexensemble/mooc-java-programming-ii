package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        Button button = new Button("Button");
        Label label = new Label("Label");

        FlowPane components = new FlowPane();
        components.getChildren().add(button);
        components.getChildren().add(label);

        Scene scene = new Scene(components);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setTitle("Button and label");
        window.setScene(scene);
        window.show();
    }

}
