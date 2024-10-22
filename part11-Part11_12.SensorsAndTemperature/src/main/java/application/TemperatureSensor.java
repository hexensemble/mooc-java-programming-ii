package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private int state;

    public TemperatureSensor() {
        this.state = 0;
    }

    @Override
    public boolean isOn() {
        if (this.state == 0) {
            return false;
        }

        return true;
    }

    @Override
    public void setOn() {
        this.state = 1;
    }

    @Override
    public void setOff() {
        this.state = 0;
    }

    @Override
    public int read() throws IllegalStateException {
        if (!isOn()) {
            throw new IllegalStateException("Sensor is off!");
        }

        return new Random().nextInt(61) - 30;
    }

}
