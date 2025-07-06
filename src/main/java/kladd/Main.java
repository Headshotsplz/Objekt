package kladd;

public class Main {
    
    public static void main(String[] args) {
        Vehicle car = new Car(1200);
        Vehicle train = new Train(10000, 12);

        VehiclePrinter.printInfo(car);
        VehiclePrinter.printInfo(train);

    }
}
