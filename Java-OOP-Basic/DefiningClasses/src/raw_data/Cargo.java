package raw_data;

public class Cargo {

    private Integer weight;
    private String type;

    public Cargo(Integer weight, String type) {
        this.weight = weight;
        this.type = type;

    }

    public String getType() {
        return this.type;
    }
}
