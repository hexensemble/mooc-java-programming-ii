
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sums = new ArrayList<>();

        for (int row = 0; row < this.square.length; row++) {
            int sum = 0;
            for (int col = 0; col < this.square[row].length; col++) {
                sum += this.square[row][col];
            }
            sums.add(sum);
        }

        return sums;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sums = new ArrayList<>();

        int column = 0;
        while (column < this.square.length) {
            int sum = 0;
            for (int row = 0; row < this.square.length; row++) {
                sum += this.square[row][column];
            }
            sums.add(sum);
            column++;
        }

        return sums;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sums = new ArrayList<>();

        int size = this.square.length;
        int x = 0;
        int y = 0;
        int sumTopLeftToBottomRight = 0;

        while (size > 0) {
            sumTopLeftToBottomRight += this.square[y][x];
            x++;
            y++;

            size--;
        }

        size = this.square.length;
        x = this.square.length - 1;
        y = 0;
        int sumTopRightToBottomLeft = 0;

        while (size > 0) {
            sumTopRightToBottomLeft += this.square[y][x];
            x--;
            y++;

            size--;
        }

        sums.add(sumTopLeftToBottomRight);
        sums.add(sumTopRightToBottomLeft);

        return sums;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
