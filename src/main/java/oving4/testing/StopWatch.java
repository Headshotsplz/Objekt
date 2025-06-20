package oving4.testing;

public class StopWatch {

    private boolean start = false;
    private boolean stop = true;

    private int totTicks;
    private int time;
    private int lapTime;
    private int lastLapTime;

    public boolean isStarted(){
        return start == true;
    }

    public boolean isStopped(){
        if (time != 0) {
            return true;
        }
        return false;
    }

    public int getTotTicks() {
        return totTicks;
    }

    public int getTime() {
        return time;
    }

    public int getLapTime() {
        return lapTime;
    }

    public int getLastLapTime() {
        return lastLapTime;
    }

    
    public void tick(int ticks){
        totTicks += ticks;
        if (start && !stop) {
            time += ticks;
            lapTime += ticks;
        }

    }
   public void start(){
    if(! start){
        start = true;
        stop = false;
        time = 0;
        lapTime = 0;
    }

    }
    public void lap(){

    }
    public void stop(){
        if (! stop) {
            stop = true;
            start = false;            
        }

    }



    
}
