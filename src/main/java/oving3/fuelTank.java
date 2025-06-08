package oving3;

public class fuelTank {
    private double capacity;
    private double level;

    public fuelTank(double capacity) {
        this.capacity = capacity;
    }

    public double getLevel() {
        return level;
    }

    public boolean isEmpty(){
        return level == 0;
    }
    public boolean isFull(){
        return level == capacity;
    }
    public boolean fill(double amount){
        if (amount < 0) {
            return false;
        }
        if (amount + level > capacity) {
            return false;
        }
        this.level += amount;
        return true;
    }

    public boolean consume(double amount){
        if (amount < 0) {
            return false;
        }
        if (amount > level) {
            return false;
        }
            
        level -= amount;
        return true;
    }
}
