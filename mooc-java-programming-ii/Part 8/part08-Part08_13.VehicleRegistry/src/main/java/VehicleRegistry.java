
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> hash = new HashMap();
    
    public VehicleRegistry(){
        this.hash = new HashMap();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        for(LicensePlate plate: hash.keySet()){
            if(licensePlate.equals(plate)){
                return false;
            }
        }
        hash.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        return hash.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate){
        for(LicensePlate plate : hash.keySet()){
            if(plate.equals(licensePlate)){
                hash.remove(plate);
                return true;
            }
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate plate: hash.keySet()){
            System.out.println(plate); //????
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownerList = new ArrayList();
        for(String owner: hash.values()){
            if(!(ownerList.contains(owner))){
                System.out.println(owner);
                ownerList.add(owner);
            }
        }
    }
}
