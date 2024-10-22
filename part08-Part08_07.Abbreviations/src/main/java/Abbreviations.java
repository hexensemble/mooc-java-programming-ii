
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizedString(abbreviation);
        explanation = sanitizedString(explanation);

        this.abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviations.containsKey(abbreviation)) {
            return true;
        }

        return false;
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation);
    }

    private String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        string = string.trim();

        return string;
    }

}
