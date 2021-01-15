public class Container {
    private int amount;
    private int limit;
    
    public Container(){
        this.amount = 0;
        this.limit = 100;
    }
    
    public int contains(){
        return this.amount;
    }
    public void add(int amount){
        if(amount <=0){
            return;
        }
        this.amount += amount;
        if(this.amount > 100){
            this.amount = 100;
        }
    }
    public void remove(int amount){
        if(amount <= 0){
            return;
        }
        this.amount -= amount;
        if(this.amount < 0){
            this.amount = 0;
        }
    }
    
    public void move(int number, Container two){
        if(number <= 0){
            return;
        }
        this.amount -= number;
        if(this.amount < 0){
            two.amount += this.amount + number;
        }else{
            two.amount += number;
        }
        if(two.amount > 100){
            two.amount = 100;
        }
    }
    
    @Override
    public String toString(){
        return this.amount+"/"+limit;
    }
}
