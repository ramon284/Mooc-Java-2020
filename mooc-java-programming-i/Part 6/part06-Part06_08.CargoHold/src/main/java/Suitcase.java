
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itemList;
    private int totalWeight;
    
    public Suitcase(int weight){
        this.itemList = new ArrayList<>();
        this.totalWeight = weight;
    }
    
    public int totalWeight(){
        int z = 0;
        for(Item x: itemList){
            z += x.getWeight();
        }
        return z;
    }
    
    public Item heaviestItem(){
        if(itemList.isEmpty()){
            return null;
        }
        Item returnItem = new Item("placeholder", 0);
        for(Item x: itemList){
            if(returnItem.getWeight() < x.getWeight()){
                returnItem = x;
            }
        }
        return returnItem;
        
    }
    
    public void addItem(Item item){
        if(this.totalWeight() + item.getWeight() > totalWeight){
            return;
        }
        itemList.add(item);
    }
    
    public void printItems(){
        for(Item item : itemList){
            System.out.println(item.toString());
        }
    }

    public String toString(){
        if(itemList.isEmpty()){
            return "no items (0 kg)";
        }
        if(itemList.size() == 1){
            return "1 item (" + totalWeight()+" kg";
        }
        return itemList.size() + " items (" + totalWeight()+" kg)";
    }
}
