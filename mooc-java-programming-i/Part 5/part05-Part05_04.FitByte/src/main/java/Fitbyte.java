public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int rhr){
        this.age = age;
        this.restingHeartRate = rhr;
    }
    
    public double maxRate(){
        return 206.3 - (0.711 * age);
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return ((maxRate() - restingHeartRate) * (percentageOfMaximum) + restingHeartRate);
    }
    

    
}
