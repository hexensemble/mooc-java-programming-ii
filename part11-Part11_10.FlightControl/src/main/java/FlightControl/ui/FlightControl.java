package FlightControl.ui;

import FlightControl.logic.Logic;
import java.util.Scanner;

public class FlightControl implements UI {

    private Scanner scanner;
    private Logic logic;

    public FlightControl(Scanner scanner, Logic logic) {
        this.scanner = scanner;
        this.logic = logic;
    }

    @Override
    public void start() {
        while (true) {
            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String option = this.scanner.nextLine();

            if (option.equals("x")) {
                break;
            }

            if (option.equals("1")) {
                this.logic.flightControlPrintAirplanes();
            }

            if (option.equals("2")) {
                this.logic.flightControlPrintFlights();
            }

            if (option.equals("3")) {
                this.logic.flightControlPrintAirPlaneDetails();
            }
        }
    }

}
