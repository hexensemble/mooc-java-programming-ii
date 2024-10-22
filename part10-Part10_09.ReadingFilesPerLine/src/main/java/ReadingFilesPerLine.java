
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of file: ");
        String input = scanner.nextLine();

        List<String> fileContents = read(input);
        System.out.println(fileContents);
    }

    public static List<String> read(String file) {
        List<String> lines = new ArrayList<>();

        try {
            Files.lines(Paths.get(file)).forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lines;
    }

}
