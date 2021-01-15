
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
        if (cents < 0){
            euros = euros--;
            cents = 100 + cents;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){ 
        int x = this.euros + addition.euros;
        int y = this.cents + addition.cents;
        Money newMoney = new Money(x,y);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros == compared.euros){
            if(this.cents < compared.cents){
                return true;
            }
        }        
        return(this.euros < compared.euros);
    }
    
    public Money minus(Money decreaser){
        //int x = this.euros - decreaser.euros;
        int y = this.cents - decreaser.cents;
        if(y < 0){
            int x = this.euros - decreaser.euros - 1;
            y = 100 + y;
        } else{
            int x = this.euros - decreaser.euros;
        }
        
        
        if (x <0){
            Money newMoney = new Money(0,0);
            return newMoney;
        }
        Money newMoney = new Money(x,y);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
