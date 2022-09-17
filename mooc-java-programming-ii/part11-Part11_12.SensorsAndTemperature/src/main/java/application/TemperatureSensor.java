
package application;

import java.util.Random;


public class TemperatureSensor implements Sensor{
    private String status;
    
    public TemperatureSensor() {
        this.status = "Off";
    }
    
    @Override
    public boolean isOn() {
        if (this.status.equals("Off")) {
            return false;
        } 
        return true;
    }

    @Override
    public void setOn() {
        this.status = "On";
    }

    @Override
    public void setOff() {
        this.status = "Off";
    }

    @Override
    public int read() {
        if (this.status.equals("Off")) {
            throw new IllegalStateException();
        } else {
            int temp = new Random().nextInt(61) - 30;
            return temp;
        }
    }
    
}
