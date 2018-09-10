package app.entities.cars;

public class ShowCar extends BaseCar {

    private int stars;

    public ShowCar(String brand, String model, int yearOfProduction, int horsePower, int acceleration,
                   int suspension, int durability) {
        super(brand, model, yearOfProduction, horsePower, acceleration, suspension, durability);
        this.stars = 0;

    }

    @Override
    public String toString() {
        StringBuilder showCar = new StringBuilder(super.toString());
        showCar.append(String.format("%d *", this.stars));
        return showCar.toString();
    }
}
