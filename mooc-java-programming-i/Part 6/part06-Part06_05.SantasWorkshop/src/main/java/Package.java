
import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package(){
        this.gifts = new ArrayList<Gift>();
    }
    
    public Package(Gift gift){
        this.gifts.add(gift);
    }
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    public int totalWeight(){
        int z = 0;
        for(Gift x: gifts){
            z += x.getWeight();
        }
        return z;
    }
}
