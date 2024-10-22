package FlightControl;

import FlightControl.logic.Logic;
import FlightControl.ui.AssetControl;
import FlightControl.ui.FlightControl;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic(scanner);

        AssetControl assetControl = new AssetControl(scanner, logic);
        assetControl.start();
        FlightControl flightControl = new FlightControl(scanner, logic);
        flightControl.start();
    }
}
