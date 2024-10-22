
import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit, new ArrayList<>());
        this.facility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.facility.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (this.facility.get(storageUnit).contains(item)) {
            this.facility.get(storageUnit).remove(item);
        }
        if (this.facility.get(storageUnit).isEmpty()) {
            this.facility.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.facility.keySet()) {
            if (!this.facility.get(unit).isEmpty()) {
                units.add(unit);
            }
        }
        return units;
    }

}
