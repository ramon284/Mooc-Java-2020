
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        if(jokes.contains(joke)){
            return;
        }
        jokes.add(joke);
    }
    
    public String drawJoke(){
        if(jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        return jokes.get(rand.nextInt(jokes.size()));
    }
    
    public void printJokes(){
        if(jokes.isEmpty()){
            return;
        }
        for(String x:jokes){
            System.out.println(x);
        }
    }
}
