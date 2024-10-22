
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container("first");
        Container second = new Container("second");

        while (true) {
            System.out.println("First: " + first.getLiquid() + "/100");
            System.out.println("Second: " + second.getLiquid() + "/100");
            System.out.print("> ");
            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (parts[0].equals("quit")) {
                break;
            }

            if (parts[0].equals("add")) {
                first.add(Integer.valueOf(parts[1]));
            }

            if (parts[0].equals("move")) {
                if (first.getLiquid() - Integer.valueOf(parts[1]) < 0) {
                    int sum = first.getLiquid() - Integer.valueOf(parts[1]) + Integer.valueOf(parts[1]);

                    first.remove(sum);
                    second.add(sum);
                } else {
                    first.remove(Integer.valueOf(parts[1]));
                    second.add(Integer.valueOf(parts[1]));
                }

            }

            if (parts[0].equals("remove")) {
                second.remove(Integer.valueOf(parts[1]));
            }
        }
    }

}
