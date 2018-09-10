package military_elite.models;

import military_elite.interfaces.Repairs_Interface;

public class Repairs implements Repairs_Interface {

    private String partName;
    private int hoursWorked;

    public Repairs(String partName, int hoursWorked) {
        this.setPartName(partName);
        this.setHoursWorked(hoursWorked);
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    private void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return this.partName;
    }

    @Override
    public int getHoursWorked() {
        return this.hoursWorked;
    }
}