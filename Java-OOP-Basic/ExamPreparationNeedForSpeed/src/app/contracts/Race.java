package app.contracts;

public interface Race {
    void addParticipant(Car car);

    boolean hasCar(Car car);
}
