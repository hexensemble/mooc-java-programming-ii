
public class Hideout<T> {

    private T t;

    public Hideout() {

    }

    public void putIntoHideout(T toHide) {
        this.t = toHide;
    }

    public T takeFromHideout() {
        if (this.t == null) {
            return null;
        }

        T helper = this.t;
        this.t = null;
        return helper;
    }

    public boolean isInHideout() {
        if (this.t == null) {
            return false;
        }

        return true;
    }

}
