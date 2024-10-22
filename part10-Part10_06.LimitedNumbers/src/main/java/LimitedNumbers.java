
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers (negative number to stop):");
        
        while (true) {
            String input = scanner.nextLine();
            int number = Integer.valueOf(input);
            
            if (number < 0) {
                break;
            }
            
            numbers.add(number);
        }
        
        ArrayList<Integer> results = numbers.stream()
                .filter(n -> n >= 1 && n <= 5)
                .collect(Collectors.toCollection(ArrayList::new));
        
        results.forEach(n -> System.out.println(n));
    }
}
