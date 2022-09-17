
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> averages;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.averages = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor: this.sensors) {
            if (sensor.isOn() == false) {
                return false;                
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor: this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor: this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException();
        } else {
            int total = 0;
            int count = this.sensors.size();
            for (Sensor sensor: this.sensors) {
                total += sensor.read();
            }
            int avg = total / count;
            this.averages.add(avg);
            return avg;
        }
    }
    
    public List<Integer> readings() {
        return this.averages;
    }
    
}
