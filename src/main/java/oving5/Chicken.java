package oving5;

public class Chicken implements Animal, Comparable<Animal>{

    private final String name;
    private final int age;

    public Chicken(int age, String name) {
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
        return name + " klukk";
    }

    @Override
    public int compareTo(Animal o) {
        return this.getAge() - o.getAge();
    }

    
    
}
