
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest(){
        if(elements.isEmpty()){
            return null;
        }
        int x = 0;
        String returnString = "";
        for(String z : elements){
            if(z.length() > x){
                x = z.length();
                returnString = z;
            }
        }
        return returnString;
    }

}
