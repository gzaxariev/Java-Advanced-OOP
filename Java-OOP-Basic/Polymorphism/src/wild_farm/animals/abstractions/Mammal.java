package wild_farm.animals.abstractions;

public abstract class Mammal extends Animal {
    private String livingRegion;
    public Mammal(String animalName, String animalType, double animalWeight, int foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
    }

    public final String getLivingRegion() {
        return this.livingRegion;
    }
}
