
package kladd;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Dog> dogs;

    public Person(String name) {
        this.name = name;
        this.dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        if (dogs.contains(dog)) {
            throw new IllegalArgumentException("already own dog");
            
        }
        dogs.add(dog);
    }

    public void removeDog(Dog dog) {
        if (! dogs.contains(dog)) {
            throw new IllegalArgumentException("dog already removed");
        }
        dogs.remove(dog);
    }

    public List<Dog> getDogs() {
        return new ArrayList<>(dogs); // returnerer kopi for sikkerhet
    }
}
