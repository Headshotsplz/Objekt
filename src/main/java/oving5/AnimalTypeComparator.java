package oving5;

import java.util.Comparator;

public class AnimalTypeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        if (animal1 instanceof Dog) {
            if(animal2 instanceof Dog){
                return 0;
            }
            return -1;

            
        }
        return 1;

    }
    
}
