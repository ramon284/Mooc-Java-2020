public class Timer {
    private ClockHand second100;
    private ClockHand seconds;
    
    public Timer(){
        this.second100 = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    public void advance(){
        this.second100.advance();
        
        if (this.second100.value() == 0){
            this.seconds.advance();
            

        }
        
    }
    
    public String toString() {
        return seconds + ":" + second100;
    }
    
}
