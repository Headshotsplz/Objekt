package oving7.train;

import java.util.ArrayList;
import java.util.List;

/**
 * The class {@code Train} represents a train that consists of one or more train cars.
 * 
 * @see TrainCar
 * @see CargoCar
 * @see PassengerCar
 */
public class Train {

    private TrainCar trainCar;
    private CargoCar cargoCar;
    private PassengerCar passengerCar;

    private List<TrainCar> trainCars = new ArrayList<>();
    /**
     * @param trainCar the train car to check for
     * @return {@code true} if the train contains the train car, {@code false} otherwise
     * 
     * @see TrainTest#testAddCarToTrain()
     */
    public boolean contains(TrainCar trainCar) {
        return trainCars.contains(trainCar);
    }

    /**
     * Adds a train car to the train.
     * 
     * @param trainCar the train car to add
     * @throws IllegalArgumentException if the train car is {@code null}
     * 
     * @see TrainTest#testAddCarToTrain()
     */
    public void addTrainCar(TrainCar trainCar) {
        if (this.trainCar == null) {
            throw new IllegalArgumentException("Traincar cannot be zero");
        }
        trainCars.add(trainCar);
    }

    /**
     * @return the sum of the total weight of all the train cars in the train. There is no need to
     *         take the weight of the locomotive into account
     * 
     * @see TrainTest#testTotalTrainWeight()
     */
    public int getTotalWeight() {
        return trainCar.getDeadWeight() + (getPassengerCount()*80) + getCargoWeight();
    }

    /**
     * @return similar to {@link PassengerCar#getPassengerCount()}, but for the entire train
     * 
     * @see TrainTest#testPassengerCount()
     */
    public int getPassengerCount() {
        return passengerCar.getPassengerCount();
    }

    /**
     * @return similar to {@link CargoCar#getCargoWeight()}, but for the entire train
     * 
     * @see TrainTest#testCargoWeight()
     */
    public int getCargoWeight() {
        // TODO: Implement this method
        return cargoCar.getCargoWeight();
    }

    /**
     * @return a string representation of the train. The string should consist of the
     *         {@link #toString()}s of all train cars in the train
     */
    @Override
    public String toString() {
        return null;
    }

    public static void main(String[] args) {
        // TODO: Write a main method to test the class
    }
}
