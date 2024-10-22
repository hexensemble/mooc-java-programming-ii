
public class Container {

    private int liquid;
    private final int MAX = 100;

    public Container() {

    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.liquid + amount > this.MAX) {
                this.liquid = this.MAX;
            } else {
                this.liquid += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.liquid - amount < 0) {
                this.liquid = 0;
            } else {
                this.liquid -= amount;
            }
        }
    }

    @Override
    public String toString() {
        return this.liquid + "/" + this.MAX;
    }

}
