
public class Main {

    public static void main(String[] args) {
        Box bookBox = new Box(10);
        Box cdBox = new Box(10);

        bookBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        bookBox.add(new Book("Robert Martin", "Clean Code", 1));
        bookBox.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        System.out.println(bookBox);

        cdBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        cdBox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        cdBox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(cdBox);

        Box bigBox = new Box(50);
        bigBox.add(bookBox);
        bigBox.add(cdBox);

        System.out.println(bigBox);
    }

}
