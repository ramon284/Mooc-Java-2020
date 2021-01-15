
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> map = new HashMap();
    
    public Abbreviations(){
        map = new HashMap();
    }
    
    
    public void addAbbreviation(String abbreviation, String explanation){
        map.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if(map.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        if(map.containsKey(abbreviation)){
            return map.get(abbreviation);
        }
        return null;
    }
}
