package oving3;

public class Termostat {
    private int temp;

    public Termostat() {
        this.temp = 20;
    }

    public Termostat(int initialTemperature) {
        this.temp = initialTemperature;
    }
    public int getTemp(){
        return temp;
    }
    public void setTemp(int temp){
        this.temp = temp;
    }
    public boolean isTooCold(){
        return temp < 18;
    }
    public boolean isTooHot(){
        return temp > 26;
    }
}
