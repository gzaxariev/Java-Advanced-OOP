package military_elite.abstraction;

import military_elite.interfaces.SpecialisedSoldier_Interface;

public abstract class SpecialisedSolder extends Private implements SpecialisedSoldier_Interface {

    private String corps;

    public SpecialisedSolder(int id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    public void setCorps(String corps) {
        if (!corps.equals("Airforces") && !corps.equals("Marines")) {
            throw new IllegalArgumentException("Wrong corps type!");
        }
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Corps: %s\n", this.corps);
    }
}