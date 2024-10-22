package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveableDictionary {

    private HashMap<String, String> words;
    private String file;

    public SaveableDictionary() {
        this.words = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.words = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        File file = new File(this.file);
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");

                add(parts[0], parts[1]);
            }

            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);

            for (Map.Entry<String, String> entry : this.words.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }

            writer.close();

            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveableDictionary.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public void add(String word, String translation) {
        Boolean wordExists = false;
        for (Map.Entry<String, String> entry : this.words.entrySet()) {
            if (entry.getKey().equals(word) || entry.getValue().equals(translation)) {
                wordExists = true;
                break;
            }
        }

        if (wordExists == false) {
            this.words.put(word, translation);
        }
    }

    public void delete(String word) {
        Iterator<Map.Entry<String, String>> iterator = this.words.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            if (entry.getKey().equals(word)) {
                iterator.remove();
            }
            if (entry.getValue().equals(word)) {
                iterator.remove();
            }
        }
    }

    public String translate(String word) {
        for (Map.Entry<String, String> entry : this.words.entrySet()) {
            if (entry.getKey().equals(word)) {
                return entry.getValue();
            }
            if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
        }

        return null;
    }

}
