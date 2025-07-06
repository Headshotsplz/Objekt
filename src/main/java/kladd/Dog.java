
package kladd;

public class Dog {
    private String name;
    Person owner;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

}
