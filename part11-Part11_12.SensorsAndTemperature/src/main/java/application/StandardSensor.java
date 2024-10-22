package application;

public class StandardSensor implements Sensor {

    private int number;

    public StandardSensor(int number) {
        this.number = number;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        //No effect
    }

    @Override
    public void setOff() {
        //No effect
    }

    @Override
    public int read() throws IllegalStateException {
        return this.number;
    }

}
