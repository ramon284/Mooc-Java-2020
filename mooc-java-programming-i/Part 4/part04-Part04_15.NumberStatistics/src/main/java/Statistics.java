
public class Statistics {
    private int count;
    private int sum;

    
    public Statistics(){
        int numberCount;
    }
    
    public void addNumber(int number){
        this.count += 1;
        this.sum += number;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    

    
    public double average(){
        if(count != 0){
            return 1.0* this.sum / this.count ;
        }else{
            return 0;
        }
    }
    
}
