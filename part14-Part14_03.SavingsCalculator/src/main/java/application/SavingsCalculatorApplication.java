package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
        //Chart
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart chart = new LineChart(xAxis, yAxis);
        chart.setTitle("Savings calculator");

        XYChart.Series savings = new XYChart.Series<>();
        savings.setName("Savings");
        XYChart.Series savingsWithInterest = new XYChart.Series<>();
        savingsWithInterest.setName("Savings with Interest");

        chart.getData().add(savings);
        chart.getData().add(savingsWithInterest);

        //Sliders    
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20, 20, 20, 20));

        BorderPane top = new BorderPane();
        BorderPane bottom = new BorderPane();

        Label topLabelLeft = new Label("Monthly savings");
        Label bottomLabelLeft = new Label("Yearly interest rate");

        Slider topSlider = new Slider(25, 250, 25);
        topSlider.setShowTickMarks(true);
        topSlider.setShowTickLabels(true);
        topSlider.setSnapToTicks(true);
        topSlider.setBlockIncrement(500);
        Slider bottomSlider = new Slider(0, 10, 0);
        bottomSlider.setShowTickMarks(true);
        bottomSlider.setShowTickLabels(true);
        bottomSlider.setMinorTickCount(10);

        Label topLabelRight = new Label();
        Label bottomLabelRight = new Label();

        topSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            topLabelRight.setText("" + newValue.intValue());
            updateSavings(topSlider.getValue(), bottomSlider.getValue(), savings, savingsWithInterest);
        });
        bottomSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            bottomLabelRight.setText("" + newValue.intValue());
            updateSavings(topSlider.getValue(), bottomSlider.getValue(), savings, savingsWithInterest);
        });

        top.setLeft(topLabelLeft);
        top.setCenter(topSlider);
        top.setRight(topLabelRight);

        bottom.setLeft(bottomLabelLeft);
        bottom.setCenter(bottomSlider);
        bottom.setRight(bottomLabelRight);

        vBox.getChildren().add(top);
        vBox.getChildren().add(bottom);

        //Main layout
        BorderPane layout = new BorderPane();
        layout.setTop(vBox);
        layout.setCenter(chart);

        Scene scene = new Scene(layout, 640, 480);
        scene.getRoot().setStyle("-fx-font-family: 'serif'");

        window.setTitle("Savings calculator");
        window.setScene(scene);
        window.show();
    }

    private void updateSavings(double savings, double interest, XYChart.Series savingsSeries, XYChart.Series savingsWithInterestSeries) {
        savingsSeries.getData().clear();
        savingsWithInterestSeries.getData().clear();

        savingsSeries.getData().add(new XYChart.Data(0, 0));
        savingsWithInterestSeries.getData().add(new XYChart.Data(0, 0));

        double savs = 0.0;
        double intrs = 0.0;

        for (int i = 0; i < 30; i++) {
            savingsSeries.getData().add(new XYChart.Data(i, savs));
            savingsWithInterestSeries.getData().add(new XYChart.Data(i, intrs));

            savs += savings * 12;
            intrs = (intrs + savings * 12) * (1.0 + interest / 100.0);
        }
    }
;

}
