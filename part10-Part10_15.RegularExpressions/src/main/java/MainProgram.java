
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Checker checker = new Checker();
        //checker.isDayOfWeek(input);
        //checker.allVowels(input);
        checker.timeOfDay(input);
    }

}
