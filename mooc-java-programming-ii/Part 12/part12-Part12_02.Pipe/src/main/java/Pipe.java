
import java.util.ArrayList;


public class Pipe<T>{
    private ArrayList<T> pipe;
    
    public Pipe(){
        this.pipe = new ArrayList<>();
    }
    public void putIntoPipe(T value){
        this.pipe.add(0, value);
    }
    public T takeFromPipe(){
        if(pipe.isEmpty()){
            return null;
        }
        T temp = this.pipe.get(pipe.size()-1);
        this.pipe.remove(pipe.size()-1);
        return temp;
    }
    
    public boolean isInPipe(){
        if(pipe.isEmpty()){
            return false;
        }
        return true;
    }
}
