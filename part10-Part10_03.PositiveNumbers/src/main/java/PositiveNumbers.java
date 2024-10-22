
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'end' to stop):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            numbers.add(Integer.valueOf(input));
        }

        System.out.println(positive(numbers));
    }

    public static List<Integer> positive(List<Integer> list) {
        return list.stream().filter(value -> value > 0).collect(Collectors.toCollection(ArrayList::new));
    }

}
