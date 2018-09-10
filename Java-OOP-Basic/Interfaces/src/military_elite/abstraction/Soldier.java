package military_elite.abstraction;

import military_elite.interfaces.Soldier_Interface;

public abstract class Soldier implements Soldier_Interface {

    private int Id;
    private String firstName;
    private String lastName;

    public Soldier(int id, String firstName, String lastName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private void setId(int id) {
        this.Id = id;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getId() {
        return this.Id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d ",
                this.getFirstName(),
                this.getLastName(),
                this.getId());
    }
}