package dictionary;

public class Main {

    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();

        // use the dictionary
        dictionary.save();
    }
}
