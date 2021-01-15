package application;

import java.util.Random;


public class TemperatureSensor implements Sensor{
    private boolean activated;
    //private int temperature;
    public TemperatureSensor(){
        this.activated = false;
    }
    

    @Override
    public boolean isOn() {
        return this.activated;
    }

    @Override
    public void setOn() {
        activated = true;
    }

    @Override
    public void setOff() {
        activated = false;
    }

    @Override
    public int read() {
        if(this.activated == false){
            throw new IllegalStateException();
        }
        return (new Random().nextInt(61) - 30 );
    }

}
