
import java.util.List;

public class Statistics {

    private List<Integer> numbers;

    public void add(int number) {
        this.numbers.add(number);
    }

    public double average() {
        return this.numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }
}