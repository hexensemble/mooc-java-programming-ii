
import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> contents;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.contents = new ArrayList<>();
    }

    public void add(Packable item) {
        if (weight() + item.weight() < this.maxCapacity) {
            this.contents.add(item);
        }
    }

    public double weight() {
        double totalWeight = 0;
        for (Packable p : this.contents) {
            totalWeight += p.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + this.contents.size() + " items, " + "total weight " + weight() + " kg";
    }

}
