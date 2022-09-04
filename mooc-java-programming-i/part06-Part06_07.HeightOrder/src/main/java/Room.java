import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortest = this.persons.get(0);
        for (Person person: this.persons) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {      
        Person shortest = this.shortest();
        this.persons.remove(this.shortest());
        return shortest;
    }
}
