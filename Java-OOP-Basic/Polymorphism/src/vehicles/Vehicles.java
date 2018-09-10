package vehicles;

public abstract class Vehicles {
    private double fuelQuantity;
    private double fuelConsumationPerKm;

    protected Vehicles(double fuelQuantity, double fuelConsumationPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumationPerKm(fuelConsumationPerKm);
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumationPerKm(double fuelConsumationPerKm) {
        this.fuelConsumationPerKm = fuelConsumationPerKm;
    }

    public boolean drive (double distance){
        double neededFuel = distance * this.fuelConsumationPerKm;

        if (neededFuel > this.fuelQuantity){
            return false;
        }
        this.fuelQuantity -= neededFuel;
        return true;
    }

    public void refuel (double fuelQuantity){
        this.fuelQuantity += fuelQuantity;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
