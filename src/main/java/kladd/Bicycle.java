package kladd;

public class Bicycle extends Vehicle {

    public Bicycle(int weight) {
        super(weight);
    }

    @Override
    public String getType() {
        return "Bicycle";
    }
}
