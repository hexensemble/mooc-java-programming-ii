
public class Book {

    private String title;
    private int age;

    public Book(String title, int age) {
        this.title = title;
        this.age = age;
    }

    public String getTitle() {
        return this.title;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.title + " (recommended for " + this.age + " year-olds or older)";
    }
}
