package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database {

    private HashMap<String, Airplane> airplanes;
    private List<Flight> flights;

    public Database() {
        this.airplanes = new HashMap<>();
        this.flights = new ArrayList<>();
    }

    public void addAirplane(String airplaneId, Airplane airplane) {
        this.airplanes.put(airplaneId, airplane);
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public boolean planeExists(String airplaneId) {
        if (this.airplanes.keySet().contains(airplaneId)) {
            return true;
        }

        return false;
    }

    public Airplane getAirplane(String airplaneId) {
        return this.airplanes.get(airplaneId);
    }

    public void printAirplanes() {
        for (Airplane a : this.airplanes.values()) {
            System.out.println(a);
        }
    }

    public void printFlights() {
        for (Flight f : this.flights) {
            System.out.println(f);
        }
        System.out.println("");
    }

    public void printAirplane(String airplaneId) {
        System.out.println(this.airplanes.get(airplaneId));
        System.out.println("");
    }

}
