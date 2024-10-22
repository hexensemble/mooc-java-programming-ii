
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();

            if (title.equals("")) {
                System.out.println("");
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            Book book = new Book(title, age);
            books.add(book);

            System.out.println("");
        }

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getTitle);

        Collections.sort(books, comparator);

        if (books.size() == 1) {
            System.out.println(books.size() + " book in total.\n");
        } else {
            System.out.println(books.size() + " books in total.\n");
        }

        System.out.println("Books:");
        books.stream().forEach(book -> System.out.println(book));
    }

}
