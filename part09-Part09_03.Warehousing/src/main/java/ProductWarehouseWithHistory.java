
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        if (super.getBalance() - amount < 0) {
            this.history.add(0);
        } else {
            this.history.add(super.getBalance() - amount);
        }

        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\n"
                + "History: " + this.history() + "\n"
                + "Largest amount of product: " + this.history.maxValue() + "\n"
                + "Smallest amount of product: " + this.history.minValue() + "\n"
                + "Average: " + this.history.average());
    }

}
