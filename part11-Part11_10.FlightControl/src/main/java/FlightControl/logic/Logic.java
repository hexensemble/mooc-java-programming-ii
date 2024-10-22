package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import java.util.Scanner;

public class Logic {

    private Scanner scanner;
    private Database database;

    public Logic(Scanner scanner) {
        this.scanner = scanner;
        this.database = new Database();
    }

    public void assetControlAddAirplane() {
        System.out.print("Give the airplane id: ");
        String airplaneId = this.scanner.nextLine();

        System.out.print("Give the airplane capacity: ");
        int capacity = Integer.valueOf(this.scanner.nextLine());

        if (!this.database.planeExists(airplaneId)) {
            Airplane airplane = new Airplane(airplaneId, capacity);
            this.database.addAirplane(airplaneId, airplane);
        }
    }

    public void assetControlAddFlight() {
        System.out.print("Give the airplane id: ");
        String airplaneId = this.scanner.nextLine();

        System.out.print("Give the departure airport id: ");
        String departureAirportId = this.scanner.nextLine();

        System.out.print("Give the target airport id: ");
        String destinationAirportId = this.scanner.nextLine();

        if (this.database.planeExists(airplaneId)) {
            Flight flight = new Flight(this.database.getAirplane(airplaneId), departureAirportId, destinationAirportId);
            this.database.addFlight(flight);
        }
    }

    public void flightControlPrintAirplanes() {
        this.database.printAirplanes();
    }

    public void flightControlPrintFlights() {
        this.database.printFlights();
    }

    public void flightControlPrintAirPlaneDetails() {
        System.out.print("Give the airplane id: ");
        String airplaneId = scanner.nextLine();

        if (this.database.planeExists(airplaneId)) {
            this.database.printAirplane(airplaneId);
        }
    }

}
