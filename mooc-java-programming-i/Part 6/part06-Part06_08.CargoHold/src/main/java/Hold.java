
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcaseList;
    
    public Hold(int weight){
        this.maxWeight = weight;
        this.suitcaseList = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int suitcaseWeight = suitcase.totalWeight();
        if(suitcaseWeight + holdWeight() > maxWeight){
            return;
        }
        suitcaseList.add(suitcase);
    }
    
    public int holdWeight(){
        if(suitcaseList.isEmpty()){
            return 0;
        }
        int i = 0;
        for(Suitcase x: suitcaseList){
            i += x.totalWeight();
        }
        return i;
    }
    
    public void printItems(){
        if(suitcaseList.isEmpty()){
            return;
        }
        for(Suitcase x: suitcaseList){
            x.printItems();
            }
        }
    
    public String toString(){
        if(suitcaseList.isEmpty()){
            return "there are no suitcases";
        }
        return suitcaseList.size() + " suitcases (" + holdWeight() + " kg)"; 
    }
    
}
