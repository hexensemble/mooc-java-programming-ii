package application;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 5);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        Map<String, Map<Integer, Double>> partyYearAndVote = new HashMap<>();

        File file = new File("partiesdata.tsv");
        Scanner scanner = new Scanner(file);

        String header = scanner.nextLine();
        String[] headerParts = header.split("\t");
        int[] years = new int[headerParts.length];
        for (int i = 1; i < years.length; i++) {
            years[i] = Integer.valueOf(headerParts[i]);
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] lineParts = line.split("\t");
            String party = lineParts[0];
            Map<Integer, Double> yearAndVote = new HashMap<>();
            for (int i = 1; i < lineParts.length; i++) {
                if (!lineParts[i].equals("-")) {
                    yearAndVote.put(years[i], Double.valueOf(lineParts[i]));
                }
            }
            partyYearAndVote.put(party, yearAndVote);
        }

        partyYearAndVote.keySet().stream()
                .forEach(party -> {
                    XYChart.Series data = new XYChart.Series<>();
                    data.setName(party);

                    partyYearAndVote.get(party).entrySet().stream()
                            .forEach(pair -> {
                                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
                            });

                    lineChart.getData().add(data);
                });

        Scene scene = new Scene(lineChart);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setTitle("Finnish parties");
        window.setScene(scene);
        window.show();
    }

}
