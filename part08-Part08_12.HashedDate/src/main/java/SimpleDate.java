
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SimpleDate)) {
            return false;
        }

        if (this == object) {
            return true;
        }

        SimpleDate compare = (SimpleDate) object;

        if (this.toString().equals(compare.toString())) {
            return true;
        }

        return false;
    }

    //@Override
    //public boolean equals(Object obj) {
    //    if (this == obj) {
    //        return true;
    //    }
    //    if (obj == null) {
    //        return false;
    //    }
    //    if (getClass() != obj.getClass()) {
    //        return false;
    //    }
    //    final SimpleDate other = (SimpleDate) obj;
    //    return true;
    //}

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

}
