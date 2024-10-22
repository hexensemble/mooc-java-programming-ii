package ticTacToe;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class GameGrid {

    private Logic gameLogic;
    private GameText gameText;
    private Boolean button1Enabled;
    private Boolean button2Enabled;
    private Boolean button3Enabled;
    private Boolean button4Enabled;
    private Boolean button5Enabled;
    private Boolean button6Enabled;
    private Boolean button7Enabled;
    private Boolean button8Enabled;
    private Boolean button9Enabled;

    public GameGrid(Logic gameLogic, GameText gameText) {
        this.gameLogic = gameLogic;
        this.gameText = gameText;
        this.button1Enabled = true;
        this.button2Enabled = true;
        this.button3Enabled = true;
        this.button4Enabled = true;
        this.button5Enabled = true;
        this.button6Enabled = true;
        this.button7Enabled = true;
        this.button8Enabled = true;
        this.button9Enabled = true;
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Button button1 = new Button(" ");
        Button button2 = new Button(" ");
        Button button3 = new Button(" ");
        Button button4 = new Button(" ");
        Button button5 = new Button(" ");
        Button button6 = new Button(" ");
        Button button7 = new Button(" ");
        Button button8 = new Button(" ");
        Button button9 = new Button(" ");

        button1.setFont(Font.font("Monospaced", 40));
        button2.setFont(Font.font("Monospaced", 40));
        button3.setFont(Font.font("Monospaced", 40));
        button4.setFont(Font.font("Monospaced", 40));
        button5.setFont(Font.font("Monospaced", 40));
        button6.setFont(Font.font("Monospaced", 40));
        button7.setFont(Font.font("Monospaced", 40));
        button8.setFont(Font.font("Monospaced", 40));
        button9.setFont(Font.font("Monospaced", 40));

        layout.add(button1, 0, 0);
        layout.add(button2, 1, 0);
        layout.add(button3, 2, 0);
        layout.add(button4, 0, 1);
        layout.add(button5, 1, 1);
        layout.add(button6, 2, 1);
        layout.add(button7, 0, 2);
        layout.add(button8, 1, 2);
        layout.add(button9, 2, 2);
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        button1.setOnAction((event) -> {
            if (this.button1Enabled) {
                button1.setText(this.gameLogic.getPlayer());
                this.gameLogic.update(0, 0);
                this.gameText.update();
                this.button1Enabled = false;
            }
        });
        button2.setOnAction((event) -> {
            if (this.button2Enabled) {
                button2.setText(this.gameLogic.getPlayer());
                this.gameLogic.update(0, 1);
                this.gameText.update();
                this.button2Enabled = false;
            }
        });
        button3.setOnAction((event) -> {
            if (this.button3Enabled) {
                button3.setText(this.gameLogic.getPlayer());
                this.gameLogic.update(0, 2);
                this.gameText.update();
                this.button3Enabled = false;
            }
        });
        button4.setOnAction((event) -> {
            if (this.button4Enabled) {
                button4.setText(this.gameLogic.getPlayer());
                this.gameLogic.update(1, 0);
                this.gameText.update();
                this.button4Enabled = false;
            }
        });
        button5.setOnAction((event) -> {
            if (this.button5Enabled) {
                button5.setText(this.gameLogic.getPlayer());
                this.gameLogic.update(1, 1);
                this.gameText.update();
                this.button5Enabled = false;
            }
        });
        button6.setOnAction((event) -> {
            if (this.button6Enabled) {
                button6.setText(this.gameLogic.getPlayer());
                this.gameLogic.update(1, 2);
                this.gameText.update();
                this.button6Enabled = false;
            }
        });
        button7.setOnAction((event) -> {
            if (this.button7Enabled) {
                button7.setText(this.gameLogic.getPlayer());
                this.gameLogic.update(2, 0);
                this.gameText.update();
                this.button7Enabled = false;
            }
        });
        button8.setOnAction((event) -> {
            if (this.button8Enabled) {
                button8.setText(this.gameLogic.getPlayer());
                this.gameLogic.update(2, 1);
                this.gameText.update();
                this.button8Enabled = false;
            }
        });
        button9.setOnAction((event) -> {
            if (this.button9Enabled) {
                button9.setText(this.gameLogic.getPlayer());
                this.gameLogic.update(2, 2);
                this.gameText.update();
                this.button9Enabled = false;
            }
        });

        return layout;
    }

}
