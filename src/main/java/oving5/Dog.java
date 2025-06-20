package oving5;

public class Dog implements Animal, Comparable<Animal> {
    
    private final String name;
    private final int age;

     public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;

    }

    @Override
    public String getSound() {
        return name + "Woff!";
    }

    @Override
    public int compareTo(Animal o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    
    
}
