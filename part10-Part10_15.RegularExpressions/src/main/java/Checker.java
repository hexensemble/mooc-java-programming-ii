
public class Checker {

    public Checker() {

    }

    public boolean isDayOfWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("Correct form.");
            return true;
        }

        System.out.println("Incorrect form.");
        return false;
    }

    public boolean allVowels(String string) {
        if (string.matches("[a|e|i|o|u]*")) {
            System.out.println("The form is correct.");
            return true;
        }

        System.out.println("The form is incorrect.");
        return false;
    }

    public boolean timeOfDay(String string) {
        //Not covered in course, had to research online for this one.
        if (string.matches("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$")) {
            System.out.println("The form is correct.");
            return true;
        }

        System.out.println("The form is incorrect.");
        return false;
    }

}
