
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public SimpleDate clone(){
        SimpleDate x = new SimpleDate(this.day, this.month, this.year);
        return x;
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate x = this.clone();
        x.advance(days);
        return x;
    }
    
    public void advance(){
        if(day < 30){
            day++;
            return;
        }
        
        if(day == 30){
            if(month < 12){
                day = 1;
                month++;
                return;
            } 
            year++;
            month = 1;
            day = 1;
        }
    }
    
    public void advance(int howManyDays){
        if(howManyDays < 0){
            return;
        }
        while(howManyDays > 0){
            this.advance();
            howManyDays--;
        }
    }
    
    

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
