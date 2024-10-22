
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            list.add(input);
        }
        
        list.stream().forEach(value -> System.out.println(value));
    }
}
