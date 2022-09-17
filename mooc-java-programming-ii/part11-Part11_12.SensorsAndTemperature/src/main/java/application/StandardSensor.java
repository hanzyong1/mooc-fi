
package application;


public class StandardSensor implements Sensor{
    private int value;
    //private String status;
    
    public StandardSensor(int input) {
        this.value = input;
        //this.status = "On";
    }
    
    public boolean isOn() {
        return true;
    }
    
    public void setOn() {
        return;
    }
    
    public void setOff() {
        return;
    }
    
    public int read() {
        return this.value;
    }
}
