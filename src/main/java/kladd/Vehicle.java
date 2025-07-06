package kladd;

public abstract class Vehicle {
   protected int weight;

    public Vehicle(int weight) {
    this.weight = weight;
}

    public int getWeight() {
        return weight;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Vehicle [getWeight()=" + getWeight() + ", getType()=" + getType() + "]";
    }

    

}
