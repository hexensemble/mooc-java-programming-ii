package FlightControl.domain;

public class Airplane {

    private String airplaneId;
    private int capacity;

    public Airplane(String airplaneId, int capacity) {
        this.airplaneId = airplaneId;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return this.airplaneId
                + " ("
                + this.capacity
                + " capacity)";
    }

}
