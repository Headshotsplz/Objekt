package oving5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import oving5.Animal;

public class Farm implements Iterable<Animal> {
    
    private List<Animal> animals = new ArrayList<>();
    
    @Override
    public Iterator<Animal> iterator() {
        return this.animals.iterator();

    }
}
    public void addAnimals(Animal animal) {
        if (animals.contains(animal)) {
            throw new IllegalArgumentException("animal already on farm");

        }
        animals.add(animal);
    }

    public List<Animal> getAnimal() {
        return new ArrayList<>(animals);

    }

