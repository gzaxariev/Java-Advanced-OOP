package wild_farm.animals.implementations;

import wild_farm.animals.abstractions.Mammal;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, double animalWeight, int foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
    }

    @Override
    protected void makeSound() {

    }

    @Override
    protected void eat() {

    }
}
