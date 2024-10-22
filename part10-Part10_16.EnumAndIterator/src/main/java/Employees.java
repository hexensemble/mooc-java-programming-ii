
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {

    List<Person> persons;

    public Employees() {
        this.persons = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(person -> this.persons.add(person));
    }

    public void print() {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();

            if (next.getEducation() == education) {
                System.out.println(next);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();

            if (next.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
