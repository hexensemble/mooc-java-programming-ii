package FlightControl.ui;

import FlightControl.logic.Logic;
import java.util.Scanner;

public class AssetControl implements UI {

    private Scanner scanner;
    private Logic logic;

    public AssetControl(Scanner scanner, Logic logic) {
        this.scanner = scanner;
        this.logic = logic;
    }

    @Override
    public void start() {
        while (true) {
            System.out.println("Airport Asset Control");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String option = this.scanner.nextLine();

            if (option.equals("x")) {
                break;
            }

            if (option.equals("1")) {
                this.logic.assetControlAddAirplane();
            }

            if (option.equals("2")) {
                this.logic.assetControlAddFlight();
            }
        }
    }

}
