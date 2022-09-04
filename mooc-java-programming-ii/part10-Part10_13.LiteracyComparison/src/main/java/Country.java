
public class Country {
    private String gender;
    private String country;
    private int year;
    private double percent;
    
    public Country(String gender, String country, int year, double percent) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percent = percent;
    }
    
    public String getGender() {
        this.trimGender();
        return this.gender;
    }
    
    public void trimGender() {
        this.gender = this.gender.trim();
        String parts[] = this.gender.split(" ");   
        this.gender = parts[0];
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public double getPercent() {
        return this.percent;
    }
    
    public String toString() {
        return this.country + " (" + this.year + "), " + this.getGender() + ", " + this.percent;
    }
}
