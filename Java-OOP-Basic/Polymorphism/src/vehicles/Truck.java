package vehicles;

public class Truck extends Vehicles {
    public static final double SUMMER_MODE_PERMANENT_ON = 1.6;

    public Truck(double fuelQuantity, double fuelConsumationPerKm) {
        super(fuelQuantity, fuelConsumationPerKm);
    }

    @Override
    public void setFuelConsumationPerKm(double fuelConsumationPerKm) {
        super.setFuelConsumationPerKm(fuelConsumationPerKm + SUMMER_MODE_PERMANENT_ON);
    }

    @Override
    public void refuel(double fuelQuantity) {
        double realFuelQuantity = fuelQuantity * 0.95;
        super.refuel(realFuelQuantity);
    }
}
