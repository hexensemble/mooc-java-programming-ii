package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        Logic gameLogic = new Logic();

        BorderPane layout = new BorderPane();

        GameText gameText = new GameText(gameLogic);
        GameGrid gameGrid = new GameGrid(gameLogic, gameText);

        layout.setTop(gameText.getView());
        layout.setCenter(gameGrid.getView());

        Scene scene = new Scene(layout, 300, 350);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setTitle("Tic-tac-toe");
        window.setScene(scene);
        window.show();
    }

}
