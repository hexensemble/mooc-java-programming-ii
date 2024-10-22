
public class Container {

    private String name;
    private int liquid;
    private final int MAX = 100;

    public Container(String name) {
        this.name = name;
        this.liquid = 0;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.liquid + amount > MAX) {
                this.liquid = MAX;
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

    public int getLiquid() {
        return this.liquid;
    }

}
