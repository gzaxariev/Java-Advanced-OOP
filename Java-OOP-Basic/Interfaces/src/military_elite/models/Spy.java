package military_elite.models;

import military_elite.abstraction.Soldier;
import military_elite.interfaces.Spy_Interface;

public class Spy extends Soldier implements Spy_Interface {

    private String codeNumber;

    public Spy(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.setCodeNumber(codeNumber);
    }

    public void setCodeNumber(String codeNumber) {
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d\n", super.getFirstName(), super.getLastName(), super.getId()));
        sb.append(String.format("CodeNumber: %s\n", this.getCodeNumber()));
        return sb.toString().trim();
    }
}