package ticTacToe;

public class Logic {

    //0 = Nothing
    //X = 1
    //O = 10
    private int player;
    private int[][] buttons;

    public Logic() {
        this.player = 1;
        this.buttons = new int[][]{
            {0, 0, 0,},
            {0, 0, 0,},
            {0, 0, 0}
        };
    }

    public String getPlayer() {
        if (this.player == 1) {
            return "X";
        }

        if (this.player == 10) {
            return "O";
        }

        return " ";
    }

    public void update(int y, int x) {
        this.buttons[y][x] = this.player;
        changePlayer();
    }

    private void changePlayer() {
        if (this.player == 1) {
            this.player = 10;
        } else if (this.player == 10) {
            this.player = 1;
        }
    }

    public boolean gameOver() {
        if (checkRows()) {
            return true;
        }
        if (checkCols()) {
            return true;
        }
        if (checkDiags()) {
            return true;
        }

        return false;
    }

    private boolean checkRows() {
        for (int row = 0; row < 3; row++) {
            int sum = 0;
            for (int col = 0; col < 3; col++) {
                sum += this.buttons[row][col];
            }
            if (sum == 3 || sum == 30) {
                return true;
            }
        }

        return false;
    }

    private boolean checkCols() {
        int column = 0;
        while (column < 3) {
            int sum = 0;
            for (int row = 0; row < 3; row++) {
                sum += this.buttons[row][column];
            }

            if (sum == 3 || sum == 30) {
                return true;
            }

            column++;
        }

        return false;
    }

    private boolean checkDiags() {
        int column = 0;
        int y = 0;
        int x = 0;
        int sum = 0;
        while (column < 3) {
            sum += this.buttons[y][x];
            column++;
            y++;
            x++;
        }
        if (sum == 3 || sum == 30) {
            return true;
        }

        column = 0;
        y = 2;
        x = 0;
        sum = 0;
        while (column < 3) {
            sum += this.buttons[y][x];
            column++;
            y--;
            x++;
        }
        if (sum == 3 || sum == 30) {
            return true;
        }

        return false;
    }
}
