public class PaymentCard {
    private double balance;
    
    public PaymentCard(double x){
        this.balance = x;
    }
    
    public void eatAffordably(){
        if(this.balance >= 2.60){
            this.balance -= 2.60;
        } else{
            return;
        }
    }
    
    public void eatHeartily(){
        if(this.balance >= 4.60){
            this.balance -= 4.60;
        } else{
            return;
        }
    }
    
    public void addMoney(double x){
        if(x < 0){
            return;
        }else{
            this.balance += x;
            if(this.balance > 150.0){
                this.balance = 150.0;
            }
        }
    }
    
    public String toString(){
        return "The card has a balance of " + balance + " euros";
    }
    
}
