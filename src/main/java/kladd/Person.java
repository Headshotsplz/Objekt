package kladd;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int setAge(int newAge){
        if (newAge < 0) {
            throw new IllegalArgumentException("Cannot have negative age");
        }
        return newAge;
    }

    public static void main(String[] args) {
        Person p = new Person("Markus", 26);

        System.out.println(p.getName());
        p.setAge(-5);
    }
}
