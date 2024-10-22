package title;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class UserTitle extends Application {

    @Override
    public void start(Stage window) throws Exception {
        Parameters params = getParameters();
        String title = params.getNamed().get("title");

        window.setTitle(title);
        window.show();
    }

}
