public class Container {

    private int amount;
    
    public Container(){
        this.amount = 0;
    }
    
    public int contains(){
        return this.amount;
    }
    
    public void add(int amount){
        if(amount < 0){
            return;
        }
        if(this.amount + amount > 100){
            this.amount = 100;
            return;
        }
        this.amount += amount;
    }
    
    public void remove(int amount){
        if(amount < 0){
            return;
        }
        if(this.amount - amount < 0){
            this.amount = 0;
            return;
        }
        this.amount -= amount;
    }
    
    public void move(Container second, int amount){
        if(amount <0){
            return;
        }
        int x = this.amount;
        this.remove(amount); 
        if(amount > x){
            second.add(x);
        }else{
            second.add(amount);
        }
        if(second.amount > 100){
            second.amount = 100;
        }
    }
    
    @Override
    public String toString(){
        return this.amount + "/100";
    }
}
