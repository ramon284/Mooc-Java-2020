
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personList;
    
    public Room(){
        this.personList = new ArrayList<>();
    }
    public Room(Person person){
        personList.add(person);
    }
    
    public void add(Person person){
        personList.add(person);
    }
    
    public boolean isEmpty(){
        return personList.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return personList;
    }
    
    public Person take(){
        if(this.isEmpty() == true){
            return null;
        }
        Person removed = this.shortest();
        int index = personList.indexOf(removed);
        personList.remove(removed);
        return removed;
        
    }
    
    public Person shortest(){
        if(this.isEmpty() == true){
            return null;
        }
        
        Person shortest = new Person("placeholder", 999999);
        for(Person person: personList){
            if(person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }
    
}
