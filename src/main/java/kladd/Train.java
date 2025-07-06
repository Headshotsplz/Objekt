package kladd;

public class Train extends Vehicle {

    private int numberOfWagons;

    public Train(int weight, int numberOfWagons) {
        super(weight);
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String getType() {
        return "Train";
    }
}
