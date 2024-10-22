package FlightControl.domain;

public class Flight {

    private Airplane airplane;
    private String departureAirportId;
    private String destinationAirportId;

    public Flight(Airplane airplane, String departureAirportId, String destinationAirportId) {
        this.airplane = airplane;
        this.departureAirportId = departureAirportId;
        this.destinationAirportId = destinationAirportId;
    }

    @Override
    public String toString() {
        return this.airplane
                + " ("
                + this.departureAirportId
                + "-"
                + this.destinationAirportId
                + ")";
    }

}
