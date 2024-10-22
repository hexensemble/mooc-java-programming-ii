
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            if (Integer.valueOf(input) < 0) {
                continue;
            }

            numbers.add(Integer.valueOf(input));
        }

        if (!numbers.isEmpty()) {
            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }

            double average = (double) sum / numbers.size();
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
