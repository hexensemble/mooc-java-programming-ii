
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description

        VehicleRegistry registry = new VehicleRegistry();

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        LicensePlate li4 = new LicensePlate("GB", "W F-666");
        LicensePlate li5 = new LicensePlate("GB", "S W-420");

        System.out.println(registry.add(li1, "Han Solo"));
        System.out.println(registry.add(li2, "Tony Soprano"));
        System.out.println(registry.add(li3, null));
        System.out.println(registry.add(li4, "Jimmy McNulty"));
        System.out.println(registry.add(li5, "Jimmy McNulty"));
        System.out.println(registry.add(li1, "Michael Knight"));
        System.out.println(registry.add(li3, "Ash Williams"));

        System.out.println("----");

        System.out.println(registry.get(li3));

        System.out.println("----");

        System.out.println(registry.remove(li3));
        System.out.println(registry.get(li3));

        System.out.println("----");

        registry.printLicensePlates();
        registry.printOwners();
    }

}
