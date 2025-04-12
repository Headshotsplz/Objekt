package oving2;

public class Vehicle {

    private char vehicleType;
    private char fuelType;
    private String registrationNumber;

    public Vehicle(char vehicleType, char fuelType, String registrationNumber) {
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
    }

    public static void main(String[] args) {
        Vehicle bil = new Vehicle('M','E',"EL1234");
        
        System.out.println(bil.toString());
    }

    @Override
    public String toString() {
        return "Vehicle [vechicleType=" + vehicleType + ", fuelType=" + fuelType + ", registrationNumber="
                + registrationNumber + "]";
    }

    public char getVehicleType() {
        if (vehicleType != 'M' || vehicleType != 'C') {
            throw new IllegalArgumentException("Invalig vehicle type");
        }
        return vehicleType;
    }

    // public boolean checkFuelType(){
    //     if ((fuelType != 'H' && fuelType != 'E' && fuelType != 'D' && fuelType != 'G')) {
    //         throw new IllegalArgumentException("Invalig fuel type");
    //     }

    //     if (fuelType == 'H' && vehicleType == 'M') {
    //         throw new IllegalArgumentException("Bare biler kan gå på hydrogen");
    //     }
    //     return true;
    // }

    public char getFuelType() {
        return fuelType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;

    }

    public void setRegistrationNumber(String registrationNumber) {

        String prefix = registrationNumber.substring(0, 2);
        String suffix = registrationNumber.substring(3, registrationNumber.length() - 1);

        if (vehicleType == 'M') {
            if (registrationNumber.length() != 6) {
                throw new IllegalArgumentException("RegnNr på sykkel må være 6 karakterer");
            }
        }

        if (vehicleType == 'C') {
            if (registrationNumber.length() != 7) {
                throw new IllegalArgumentException("RegnNr på bil må være 7 karakterer");
            }
        }

        if (!prefix.equals(prefix.toUpperCase())) {
            throw new IllegalArgumentException("RegNR må ha store bokstaver");
        }

        if (fuelType == 'E') {
            if (    !prefix.equals("EK")
                ||  !prefix.equals("EL")) {
                throw new IllegalArgumentException("Må starte med EK eller EL");
            }
        }

        if (fuelType == 'H') {
            if (!prefix.equals("HY")) {
                throw new IllegalArgumentException("Hydrogenbiler må starte med HY");
            }
        }

        if (fuelType == 'D' || fuelType == 'G') {
            if (prefix.equals("EK")
                    || prefix.equals("EL")
                    || prefix.equals("HY")
                    || prefix.contains("ÆØÅ")) {
                throw new IllegalArgumentException("Disel biler kan ikke starte med EK, EL eller HY, samt ÆØÅ");
            }
        }
        this.registrationNumber = prefix + suffix;
    }
}
