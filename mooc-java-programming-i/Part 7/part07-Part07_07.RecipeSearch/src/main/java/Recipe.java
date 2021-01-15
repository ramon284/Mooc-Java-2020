
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int minutes;
    private ArrayList<String> ingredientList;
    
    public Recipe(String name, int minutes){
        this.name = name;
        this.minutes = minutes;
        this.ingredientList = new ArrayList();
    }
    
    public void addIng(String ingredient){
        ingredientList.add(ingredient);
    }
    
    public String getName(){
        return this.name;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public boolean checkIngredients(String ingredient){
        for(String x:ingredientList){
            if(x.equals(ingredient)){
                return true;
            }
        }
        return false;
    }

    
    public String toString(){
        return this.name +", cooking time: " + minutes;
    }
    
    
}
