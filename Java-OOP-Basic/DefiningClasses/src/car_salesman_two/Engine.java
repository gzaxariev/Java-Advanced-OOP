package car_salesman_two;

public class Engine {

    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        StringBuilder engine = new StringBuilder();

        engine.append(String.format("%s:", this.model))
                .append(System.lineSeparator())
                .append(String.format("Power: %s", this.power))
                .append(System.lineSeparator())
                .append(String.format("Displacement: %s", this.displacement == 0 ? "n/a" : this.displacement))
                .append(System.lineSeparator());
        if (this.efficiency == null){
            engine.append("Efficiency: n/a");
        }else {
            engine.append(String.format("Efficiency: %s", this.efficiency));
        }

        return engine.toString();
    }
}
