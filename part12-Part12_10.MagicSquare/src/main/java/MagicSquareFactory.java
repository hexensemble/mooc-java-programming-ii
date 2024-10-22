
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        int totalSquares = size * size;
        int x = square.getWidth() / 2;
        int y = 0;
        int value = 1;
        int nextX = 0;
        int nextY = 0;

        square.placeValue(x, y, value);
        value++;
        totalSquares--;

        while (totalSquares > 0) {
            nextX = x + 1;
            nextY = y - 1;
            if (nextX > square.getWidth() - 1) {
                nextX = 0;
            }
            if (nextY < 0) {
                nextY = square.getHeight() - 1;
            }

            if (square.readValue(nextX, nextY) == 0) {
                square.placeValue(nextX, nextY, value);

                x = nextX;
                y = nextY;
                value++;
            } else {
                nextX = x;
                nextY = y + 1;
                square.placeValue(nextX, nextY, value);

                x = nextX;
                y = nextY;
                value++;
            }

            totalSquares--;
        }

        return square;
    }

}
