
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (!this.history.isEmpty()) {
            double largest = this.history.get(0);

            for (int i = 0; i < this.history.size(); i++) {
                if (largest < this.history.get(i)) {
                    largest = this.history.get(i);
                }
            }

            return largest;
        }

        return 0;
    }

    public double minValue() {
        if (!this.history.isEmpty()) {
            double smallest = this.history.get(0);

            for (int i = 0; i < this.history.size(); i++) {
                if (smallest > this.history.get(i)) {
                    smallest = this.history.get(i);
                }
            }

            return smallest;
        }

        return 0;
    }

    public double average() {
        if (!this.history.isEmpty()) {
            double sum = 0;

            for (Double amount : this.history) {
                sum += amount;
            }

            return sum / this.history.size();
        }

        return 0;
    }

    @Override
    public String toString() {
        return this.history.toString();
    }

}
