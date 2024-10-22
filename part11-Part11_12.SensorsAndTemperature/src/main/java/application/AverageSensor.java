package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void setOn() {
        this.sensors.stream()
                .forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream()
                .forEach(s -> s.setOff());
    }

    @Override
    public int read() throws IllegalStateException {
        if (!isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("Sensor is off!");
        }

        int sum = 0;
        for (Sensor s : this.sensors) {
            sum += s.read();
        }
        double average = (double) sum / this.sensors.size();
        this.readings.add((int) average);
        return (int) average;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return this.readings;
    }

}
