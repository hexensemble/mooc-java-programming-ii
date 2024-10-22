
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiteracyComparison {

    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .sorted((a, b) -> a[5].compareTo(b[5]))
                    .forEach(line -> System.out.println(line[3].trim() + " (" + line[4].trim() + "), " + line[2].split(" ")[1] + ", " + line[5].trim()));
        } catch (IOException ex) {
            Logger.getLogger(LiteracyComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
