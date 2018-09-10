package raw_data;

import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tires> tiresList;

    public Car(String model, Engine engine, Cargo cargo, List<Tires> tiresList) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tiresList = tiresList;
    }


    public String getModel() {
        return this.model;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public List<Tires> getTiresList() {
        return this.tiresList;
    }

    @Override
    public String toString() {
        return this.getModel();
    }
}
