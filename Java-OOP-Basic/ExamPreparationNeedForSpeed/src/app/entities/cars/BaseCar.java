package app.entities.cars;

import app.contracts.Car;

public abstract class BaseCar implements Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsePower;
    private int acceleration;
    private int suspension;
    private int durability;

    protected BaseCar(String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.setHorsePower(horsePower);
        this.acceleration = acceleration;
        this.setSuspension(suspension);
        this.durability = durability;
    }

    protected void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    protected void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        StringBuilder car = new StringBuilder();

        car.append(String.format("%s %s %d", this.brand, this.model, this.yearOfProduction))
                .append(System.lineSeparator())
                .append(String.format("%d HP, 100 m/h in %d s", this.horsePower, this.acceleration))
                .append(System.lineSeparator())
                .append(String.format("%d Suspension force, %d Durability", this.suspension, this.durability))
                .append(System.lineSeparator());


        return car.toString();
    }
}
