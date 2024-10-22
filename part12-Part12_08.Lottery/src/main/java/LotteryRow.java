
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            int number = random.nextInt(40) + 1;

            if (this.containsNumber(number)) {
                i--;
            } else {
                this.numbers.add(number);
            }
        }
    }

    public boolean containsNumber(int number) {
        for (int n : this.numbers) {
            if (n == number) {
                return true;
            }
        }

        return false;
    }
}
