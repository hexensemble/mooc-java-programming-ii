
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof LicensePlate)) {
            return false;
        }

        if (this == object) {
            return true;
        }

        LicensePlate compare = (LicensePlate) object;

        if (this.country.equals(compare.country) && this.liNumber.equals(compare.liNumber)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.liNumber.hashCode();
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
