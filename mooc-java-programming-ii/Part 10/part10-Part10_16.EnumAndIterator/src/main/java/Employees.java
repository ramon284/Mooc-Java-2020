
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> list;
    
    public Employees(){
        this.list = new ArrayList<>();
    }
   
    public void add(Person personToAdd){
        list.add(personToAdd);
    }    
    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream()
                .forEach(person -> list.add(person));
    }  
    public void print(){
        Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            System.out.println(nextPerson.toString());
        }
        
//        list.stream()
//                .forEach(person -> person.toString());
    }
    
    public void print(Education education){
        Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation() == education){
                //System.out.println("hallo??");
                System.out.println(nextPerson.toString());;
            }
        }
        
        
//        list.stream()
//                .filter(person -> person.getEducation() == education)
//                .forEach(person -> person.toString());
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = list.iterator();
        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
