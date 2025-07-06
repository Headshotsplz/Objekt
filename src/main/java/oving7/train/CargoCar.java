package oving7.train;

/**
 * One of two different types of train cars, both specialized versions for different purposes. A
 * {@code CargoCar} represents a cargo car that transports various things and stuff.
 * 
 * @see TrainCar
 * @see PassengerCar
 */
public class CargoCar extends TrainCar {

    // TODO: Add fields here

    private int deadWeight;
    private int cargoWeight;
    /**
     * Constructor for the cargo car.
     * 
     * @param deadWeight the weight of an empty cargo car
     * @param cargoWeight the weight of the cargo in the cargo car
     * @throws IllegalArgumentException if either deadWeight or cargoWeight is negative
     * 
     * @see CargoCarTest#testWeight()
     */
    public CargoCar(int deadWeight, int cargoWeight) {
        super(deadWeight);
        if (deadWeight < 0 || cargoWeight < 0) {
            throw new IllegalArgumentException("either deadWeight or cargoWeight cannot be negative");
        }
        this.cargoWeight = cargoWeight;
    }

    /**
     * @return the weight of the cargo in the cargo car
     * 
     * @see CargoCarTest#testWeight()
     */
    public int getCargoWeight() {
        return this.cargoWeight;
    }

    /**
     * @param cargoWeight the weight of the cargo in the cargo car
     * @throws IllegalArgumentException if cargoWeight is negative
     * 
     * @see CargoCarTest#testWeight()
     */
    public void setCargoWeight(int cargoWeight) {
        if (cargoWeight < 0) {
            throw new IllegalArgumentException("cargoWeight cannot be zero");
        }
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getTotalWeight() {
        return super.getDeadWeight() + cargoWeight;
    }

    

    @Override
    public String toString() {
        return "CargoCar [deadWeight=" + deadWeight + ", cargoWeight=" + cargoWeight + "]" + "TotalWeight: " + getCargoWeight();
    }

    public static void main(String[] args) {

    }
}
