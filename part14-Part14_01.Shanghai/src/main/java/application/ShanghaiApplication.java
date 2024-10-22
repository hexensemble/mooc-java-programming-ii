package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 10);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        XYChart.Series helsinki = new XYChart.Series<>();
        helsinki.setName("Helsinki");
        helsinki.getData().add(new XYChart.Data<>(2007, 73));
        helsinki.getData().add(new XYChart.Data<>(2008, 68));
        helsinki.getData().add(new XYChart.Data<>(2009, 72));
        helsinki.getData().add(new XYChart.Data<>(2010, 72));
        helsinki.getData().add(new XYChart.Data<>(2011, 74));
        helsinki.getData().add(new XYChart.Data<>(2012, 73));
        helsinki.getData().add(new XYChart.Data<>(2013, 76));
        helsinki.getData().add(new XYChart.Data<>(2014, 73));
        helsinki.getData().add(new XYChart.Data<>(2015, 67));
        helsinki.getData().add(new XYChart.Data<>(2016, 56));
        helsinki.getData().add(new XYChart.Data<>(2017, 56));

        lineChart.getData().add(helsinki);

        Scene scene = new Scene(lineChart, 640, 480);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setTitle("Shanghai");
        window.setScene(scene);
        window.show();
    }

}
