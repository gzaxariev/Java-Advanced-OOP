package demo.animals;

import demo.foods.Food;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public String makeSound() {
        return "ROAAR!!!";
    }

    @Override
    public void eatFood(Food food) {
        if (!"meat".equalsIgnoreCase(food.getClass().getSimpleName())) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eatFood(food);
    }
}