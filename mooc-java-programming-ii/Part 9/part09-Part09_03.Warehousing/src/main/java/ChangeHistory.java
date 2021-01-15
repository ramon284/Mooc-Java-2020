
import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> list;
    
    public ChangeHistory(){
        this.list = new ArrayList<>();
    }
    
    public void add(double status){
        this.list.add(status);
    }
    public void clear(){
        this.list.clear();
    }
    public double maxValue(){
        if(list.isEmpty()){
            return 0.0;
        }
        double z = -999999999;
        for(double x:list){
            if(x > z){
                z = x;
            }
        }
        return z;
    }
    public double minValue(){
        if(list.isEmpty()){
            return 0;
        }
        double z = 99999999;
        for(double x:list){
            if(x < z){
                z=x;
            }
        }
        return z;
    }
    public double average(){
        if(list.isEmpty()){
            return 0;
        }
        double sum = 0;
        int count = 0;
        for(Double x:list){
            sum += x;
            count++;
        }
        return sum / count;
    }
    
    @Override
    public String toString(){
        return this.list.toString();
    }

}
