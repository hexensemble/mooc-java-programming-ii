package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        Button button = new Button("Button");
        TextField text = new TextField();

        FlowPane components = new FlowPane();
        components.getChildren().add(button);
        components.getChildren().add(text);

        Scene scene = new Scene(components);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setScene(scene);
        window.setTitle("Button and TextField");
        window.show();
    }

}
