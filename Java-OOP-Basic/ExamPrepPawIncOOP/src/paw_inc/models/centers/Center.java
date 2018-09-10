package paw_inc.models.centers;

import paw_inc.models.animals.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Center {
    private String name;
    List<Animal> animals;

    public Center(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }
    public void register(Animal animal){
        this.animals.add(animal);
    }
    public void registerAll(List<Animal> animals){
        this.animals.addAll(animals);
    }

    public List<Animal> getAnimals() {
        return Collections.unmodifiableList(this.animals);
    }
    public void removeAnimals(List<Animal> animals){
        this.animals.removeAll(animals);
    }
}
