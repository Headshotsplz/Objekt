package oving3;

public class Timer {
    private int sec;
    private boolean running;

    public Timer(int sec) {
        if (sec < 0) {
            throw new IllegalArgumentException("");
        }
        this.sec = sec;
    }
    public void start(){
        running = true;
    }
    public void stop(){
        running = false;
    }
    public void tick(){
        if (running == true && sec > 0) {
            sec--;
        }
    }
    public int getTime(){
        return this.sec;
    }
    public boolean isRunning(){
        return running;
    }
    public boolean isFinished(){
        return sec == 0;
    }
    public String toString(){
        return "Time left " + sec + "s " + running;
    }
    


}
