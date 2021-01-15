
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart(){
        this.cart = new HashMap<String, Item>();
    }
    public void add(String product, int price){
        if(!(cart.isEmpty())){
            for(String name:cart.keySet()){
               if(name.equals(product)){
                   cart.get(product).increaseQuantity();
                  // System.out.println(cart);
                   return;
               }
            }
        }
        cart.put(product, new Item(product, 1, price));
    }
    
    public int price(){
        int x = 0;
        for(Item item: cart.values()){
           x += item.price();
        }
        return x;
    }
    
    public void print(){
        for(Item item: cart.values()){
            System.out.println(item);
        }
    }
}
