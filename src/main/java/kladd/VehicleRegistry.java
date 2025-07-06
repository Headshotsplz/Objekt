package kladd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VehicleRegistry {

    private List<Vehicle> vehicles = new ArrayList<>();
    
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void printAll(){
        vehicles.stream().forEach(vehicle -> System.out.println(vehicle.toString()));
    }

    public List<Vehicle> getVehiclesHeavierThan(int limit){
        return vehicles.stream().filter(vehicle -> vehicle.getWeight() > limit).collect(Collectors.toList());
    }

    public boolean containsType(String type){
        return vehicles.stream().anyMatch(v -> v.getType().equals(type));
    }

    public List<Vehicle> getSortedByWeight(){
        List<Vehicle> vehicle2 = vehicles.stream()
                                         .sorted(Comparator.comparing(vehicle -> vehicle.getWeight()))
                                         .collect(Collectors.toList());
        return new ArrayList<>(vehicle2);
    }

    public Map<String, Long> countByType(){
        return vehicles.stream().collect(Collectors.groupingBy(Vehicle::getType, Collectors.counting()));
    }




}
