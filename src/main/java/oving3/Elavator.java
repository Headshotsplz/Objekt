package oving3;

public class Elavator {
    private int currentFloor;
    private boolean doorOpen;

    public Elavator() {
        this.currentFloor = 0;
        this.doorOpen = false;
    }

    public int getCurrentFloor(){
        return this.currentFloor;

    }


    public boolean isDoorOpen(){
        return this.doorOpen;
    }


    public void openDoor(){
        if (doorOpen == true) {
            
        }
        this.doorOpen = true;
    }


    public void closeDoor(){
        if (doorOpen == false) {
            
        }
        this.doorOpen = false;

    }


    public boolean goTo(int floor){
        if (floor > 9 || floor < 0) {
            return false;
        }
        if (this.doorOpen = true) {
            return false;
        }
        this.currentFloor = floor;
        return true;
    }

    public String toString(){
        return "Etasje " + currentFloor + doorOpen;

    }



}
