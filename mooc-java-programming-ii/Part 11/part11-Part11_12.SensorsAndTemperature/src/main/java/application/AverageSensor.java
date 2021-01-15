package application;

import java.util.ArrayList;
import java.util.List;


public class AverageSensor implements Sensor{
    private ArrayList<Sensor> list;
    private ArrayList<Integer> all;
    
    
    public AverageSensor() {
        this.list  = new ArrayList<>();
        this.all = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for(Sensor x:list){
            if(x.isOn() == false){
                return false;
            }
        }
        return true;
    }
    
    public void addSensor(Sensor toAdd){
        list.add(toAdd);
    }

    @Override
    public void setOn() {
        for(Sensor x:list){
            x.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor x:list){
            x.setOff();
        }    
    }
    
    public List<Integer> readings(){
        return this.all;
    }


    @Override
    public int read() {
        if(this.isOn() == false){
            throw new IllegalStateException();
        }
        
        double average = list.stream()
                .mapToInt(sensor -> sensor.read())
                .average()
                .getAsDouble();
        all.add((int) average);
        return (int) average;
    }

}
