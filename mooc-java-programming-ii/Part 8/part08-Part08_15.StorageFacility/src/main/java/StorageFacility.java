
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> hash = new HashMap();
    
    public StorageFacility(){
        this.hash = new HashMap();
    }
    
    
    public void add(String unit, String item){
        this.hash.putIfAbsent(unit, new ArrayList<>()); 
        ArrayList<String> temp = this.hash.get(unit);
        temp.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        for(String name:hash.keySet()){
            if(name.equals(storageUnit)){
                return hash.get(storageUnit);
            }
        }    
        return new ArrayList<>();
    }
    public void remove(String storageUnit, String item){
        for(String name: hash.keySet()){
            if(name.equals(storageUnit)){
                if(hash.get(name).contains(item)){
                    hash.get(name).remove(item);
                }
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> names = new ArrayList<>();
        for(String name :hash.keySet()){
            if(hash.get(name).isEmpty()){
                continue;
            }
            names.add(name);
        }
        return names;
    }

    
}
