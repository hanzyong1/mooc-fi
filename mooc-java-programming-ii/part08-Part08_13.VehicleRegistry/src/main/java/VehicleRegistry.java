import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.registry.containsKey(licensePlate)) {
            this.registry.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
        
    }
    
    public String get(LicensePlate licensePlate) {
        if (!this.registry.containsKey(licensePlate)) {
            return null;
        } else {
            return this.registry.get(licensePlate);
        }
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (!this.registry.containsKey(licensePlate)) {
            return false;
        } else {
            this.registry.remove(licensePlate);
            return true;
        }
    }
    
    public void printLicensePlates() {
        for (LicensePlate i: this.registry.keySet()) {
            System.out.println(i);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String i: this.registry.values()) {
            if (!owners.contains(i)) {
                owners.add(i);
                System.out.println(i);
            }           
        }
    }
}
