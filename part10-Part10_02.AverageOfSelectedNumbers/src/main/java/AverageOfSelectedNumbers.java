
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers, type 'end' to stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            int number = Integer.valueOf(input);

            if (number >= 0) {
                positiveNumbers.add(number);
            } else {
                negativeNumbers.add(number);
            }
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();

        if (input.equals("p")) {
            if (!positiveNumbers.isEmpty()) {
                double average = positiveNumbers.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .average()
                        .getAsDouble();
                System.out.println("Average of the positive numbers: " + average);
            } else {
                System.out.println("Average of the positive numbers: 0");
            }
        }

        if (input.equals("n")) {
            if (!negativeNumbers.isEmpty()) {
                double average = negativeNumbers.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .average()
                        .getAsDouble();
                System.out.println("Average of the negative numbers: " + average);
            } else {
                System.out.println("Average of the negative numbers: 0");
            }
        }
    }

}
