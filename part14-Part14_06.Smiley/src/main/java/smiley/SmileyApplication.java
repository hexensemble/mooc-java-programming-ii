package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        layout.setStyle("-fx-background-color: white;");

        Canvas canvas = new Canvas(640, 480);
        GraphicsContext painter = canvas.getGraphicsContext2D();
        painter.setFill(Color.BLACK);

        double leftEyeX = 200;
        double leftEyeY = 100;
        double rightEyeX = 400;
        double rightEyeY = 100;

        double smile1X = 150;
        double smile1Y = 250;
        double smile2X = 200;
        double smile2Y = 300;
        double smile3X = 250;
        double smile3Y = 300;
        double smile4X = 300;
        double smile4Y = 300;
        double smile5X = 350;
        double smile5Y = 300;
        double smile6X = 400;
        double smile6Y = 300;
        double smile7X = 450;
        double smile7Y = 250;

        painter.fillRect(leftEyeX, leftEyeY, 50, 50);
        painter.fillRect(rightEyeX, leftEyeY, 50, 50);
        painter.fillRect(smile1X, smile1Y, 50, 50);
        painter.fillRect(smile2X, smile2Y, 50, 50);
        painter.fillRect(smile3X, smile3Y, 50, 50);
        painter.fillRect(smile4X, smile4Y, 50, 50);
        painter.fillRect(smile5X, smile5Y, 50, 50);
        painter.fillRect(smile6X, smile6Y, 50, 50);
        painter.fillRect(smile7X, smile7Y, 50, 50);

        layout.setCenter(canvas);

        Scene scene = new Scene(layout);

        window.setTitle("Smiley");
        window.setScene(scene);
        window.show();
    }

}
