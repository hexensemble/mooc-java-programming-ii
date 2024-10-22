
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Pair<String, Integer> pair = new Pair<>("one", 1);
        System.out.println(pair.getKey() + " -> " + pair.getValue());

    }

}
