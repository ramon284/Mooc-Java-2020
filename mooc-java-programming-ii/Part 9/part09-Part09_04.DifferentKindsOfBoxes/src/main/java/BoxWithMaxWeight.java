
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int max;
    private ArrayList<Item> list = new ArrayList();
    public BoxWithMaxWeight(int capacity){
        super();
        this.max = capacity;
        this.list = new ArrayList();
    }

    @Override
    public void add(Item item) {
        if(getTotalWeight() +item.getWeight() > max){
            return;
        }
        list.add(item);
        
    }
    public int getTotalWeight(){
        if(list.isEmpty()){
            return 0;
        }
        int z = 0;
        for(Item x:list){
            z += x.getWeight();
        }
        return z;
    }

    @Override
    public boolean isInBox(Item item) {
        return list.contains(item); //To change body of generated methods, choose Tools | Templates.
    }

}
