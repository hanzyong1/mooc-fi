
public class Hideout<T> {
    private T value;
    
    public Hideout() {
        this.value = null;
    }
    
    public void putIntoHideout(T toHide) {
        this.value = toHide;

    }
    
    public T takeFromHideout() {
        if (this.value == null) {
            return null;
        } else {
            T temp = this.value;
            this.value = null;
            return temp;           
        }        
    }
    
    public boolean isInHideout() {
        if (this.value == null) {
            return false;
        } else {
            return true;
        }
    }
}
