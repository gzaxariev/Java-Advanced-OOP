package raw_data;

public class Tires {

    private Integer age;
    private  Double pressure;

    public Tires(Double pressure, Integer age) {
        this.pressure = pressure;
        this.age = age;

    }

    public Double getPressure() {
        return this.pressure;
    }
}
