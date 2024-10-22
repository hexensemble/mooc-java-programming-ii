
import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    
    private List<T> list;
    
    public Pipe() {
        this.list = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.list.add(0, value);
    }
    
    public T takeFromPipe() {
        if (this.list.isEmpty()) {
            return null;
        }
        
        T helper = this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return helper;
    }
    
    public boolean isInPipe() {
        if (this.list.isEmpty()) {
            return false;
        }
        
        return true;
    }
    
}
