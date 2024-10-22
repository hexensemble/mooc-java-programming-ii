
import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (owner == null) {
            this.registry.put(licensePlate, null);
            return true;
        }

        if (this.registry.containsKey(licensePlate)) {
            String currentOwner = this.registry.get(licensePlate);

            if (currentOwner == null) {
                this.registry.remove(licensePlate);
                this.registry.put(licensePlate, owner);
                return true;
            }

            return false;
        }

        this.registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            return this.registry.get(licensePlate);
        }

        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.registry.containsKey(licensePlate)) {
            this.registry.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate l : this.registry.keySet()) {
            System.out.println(l);
        }
    }

    public void printOwners() {
        ArrayList<String> printedOwners = new ArrayList<>();

        for (LicensePlate l : this.registry.keySet()) {
            if (!printedOwners.contains(this.registry.get(l))) {
                printedOwners.add(this.registry.get(l));
            }
        }

        for (String o : printedOwners) {
            System.out.println(o);
        }
    }

}
