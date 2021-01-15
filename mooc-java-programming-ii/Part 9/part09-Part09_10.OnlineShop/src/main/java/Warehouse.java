import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Warehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    public Warehouse(){
        this.prices = new HashMap<String,Integer>();
        this.stock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        if(prices.isEmpty()){
            return -99;
        }
        for(String name:prices.keySet()){
            if(name.equals(product)){
                return prices.get(name);
            }
        }return -99;
    }
    
    public int stock(String product){
        if(prices.isEmpty()){
            return 0;
        }
        for(String name:stock.keySet()){
            if(name.equals(product)){
                return stock.get(name);
            }
        }return 0;
    }
    
    public boolean take(String product){
        int x = stock(product);
        if(x <=0){
            return false;
        }else{
            for(String name:stock.keySet()){
                if(name.equals(product)){
                    stock.put(name, x-1);
                    return true;
                }
            }
        }
        return false;
    }
    
    public Set<String> products(){
        
        Set<String> x = new HashSet<>();
        for(String name:prices.keySet()){
            x.add(name);
        }
        return x;
    }

}
