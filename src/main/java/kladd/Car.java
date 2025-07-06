package kladd;

public class Car extends Vehicle{

    public Car(int weight) {
        super(weight);
    }

    @Override
    public String getType() {
        return "Car";
    }
    
}
