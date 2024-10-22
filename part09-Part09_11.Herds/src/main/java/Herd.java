
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> members;

    public Herd() {
        this.members = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.members.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m : this.members) {
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String list = "";

        for (Movable m : this.members) {
            list += m.toString() + "\n";
        }

        return list;
    }

}
