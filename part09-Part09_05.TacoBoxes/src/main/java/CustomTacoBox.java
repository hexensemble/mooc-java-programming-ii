
public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox(int initialTacos) {
        this.tacos = initialTacos;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (this.tacos - 1 < 0) {
            this.tacos = 0;
        } else {
            this.tacos--;
        }
    }

}
