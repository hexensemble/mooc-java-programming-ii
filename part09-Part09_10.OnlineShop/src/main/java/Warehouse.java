
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.products = new HashMap();
        this.stock = new HashMap();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        for (String p : this.products.keySet()) {
            if (p.equals(product)) {
                return this.products.get(p);
            }
        }

        return -99;
    }

    public int stock(String product) {
        for (String p : this.stock.keySet()) {
            if (p.equals(product)) {
                return this.stock.get(p);
            }
        }

        return 0;
    }

    public boolean take(String product) {
        for (String p : this.stock.keySet()) {
            if (p.equals(product)) {
                int stock = this.stock.get(p);
                this.stock.remove(p);

                stock--;

                if (stock < 0) {
                    stock = 0;

                    this.stock.put(p, stock);
                    return false;
                }

                this.stock.put(p, stock);
                return true;
            }
        }

        return false;
    }
    
    public Set<String> products() {
        return this.products.keySet();
    }

}
