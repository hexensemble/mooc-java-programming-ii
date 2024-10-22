package ticTacToe;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class GameText {

    private Logic gameLogic;
    private Label text;

    public GameText(Logic gameLogic) {
        this.gameLogic = gameLogic;
        this.text = new Label("Turn: " + this.gameLogic.getPlayer());
        this.text.setFont(Font.font("Monospaced", 40));
    }

    public Parent getView() {
        return this.text;
    }

    public void update() {
        if (this.gameLogic.gameOver()) {
            this.text.setText("The end!");
        } else {
            this.text.setText("Turn: " + this.gameLogic.getPlayer());
        }
    }

    public void gameOver() {
        this.text.setText("Game Over!");
    }

}
