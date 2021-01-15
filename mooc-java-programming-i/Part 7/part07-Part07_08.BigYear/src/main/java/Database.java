
import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birdList;
    
    public Database(){
        this.birdList = new ArrayList<>();
    }
    
    public void add(String one, String two){
        Bird x = new Bird(one, two);
        this.birdList.add(x);
    }
    
    public void one(String birdName){
        for(Bird bird:birdList){
            if(bird.getName().equals(birdName)){
                System.out.println(bird.toString());
            }
        }
        System.out.println("Not a bird!");
    }
    public void all(){
        for(Bird bird:birdList){
            System.out.println(bird.toString());
        }
    }
    public void observation(String name){
        for(Bird bird: birdList){
            if(bird.getName().equals(name)){
                bird.observations();
            }
        }  
    }

    public boolean exists(String name){
        for(Bird bird: birdList){
            if(bird.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    
    

}
