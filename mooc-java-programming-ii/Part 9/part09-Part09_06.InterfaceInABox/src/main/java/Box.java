
import java.util.ArrayList;

public class Box implements Packable{
    private double max;
    private ArrayList<Packable> box;
    
    public Box(double x){
        this.box = new ArrayList<>();
        this.max = x;
    }
    
    public void add(Packable item){
        double itemWeight = item.weight();
        double currentWeight = weight();
        if(itemWeight +currentWeight <= max){
            box.add(item);
        }
    }
    
    public double weight(){
        if(box.isEmpty()){
            return 0;
        }
        double y = 0;
        for(Packable x:box){
            y += x.weight();
        }
        return y;
    }
    
    public String toString(){
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }

}
