
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public boolean equals (Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Person)){
            return false;
        }
        
        Person compared2 = (Person) compared;
        
        if(this.name.equals(compared2.name) &&
                this.height == compared2.height &&
                this.weight == compared2.weight &&
                this.birthday.equals(compared2.birthday)){
            return true;
        }
        
        
        
        return false;
    }

    // implement an equals method here for checking the equality of objects
}
