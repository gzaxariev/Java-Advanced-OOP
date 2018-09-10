package paw_inc.models.animals;

public class Dog extends Animal {

    private int commands;

    public Dog(String name, int age, boolean isCleansed, String adoptionCenter, int commands) {
        super(name, age, isCleansed, adoptionCenter);
        this.commands = commands;
    }
}
