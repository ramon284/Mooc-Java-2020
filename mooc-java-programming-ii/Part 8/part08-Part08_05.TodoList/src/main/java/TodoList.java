
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todo;
    
    public TodoList(){
        this.todo = new ArrayList<>();
    }
    
    public void add(String task){
        todo.add(task);
    }
    public void print(){
        int i = 1;
        for(String x:todo){
            System.out.println(i+": "+x);
            i++;
        }
    }
    public void remove(int number){
        todo.remove(number-1);
    }

}
