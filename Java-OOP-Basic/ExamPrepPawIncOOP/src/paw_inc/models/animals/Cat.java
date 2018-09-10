package paw_inc.models.animals;

public class Cat extends Animal {
    private int intelligence;
    public Cat(String name, int age, boolean isCleansed, String adoptionCenter, int intelligence) {
        super(name, age, isCleansed, adoptionCenter);
        this.intelligence = intelligence;
    }
}
