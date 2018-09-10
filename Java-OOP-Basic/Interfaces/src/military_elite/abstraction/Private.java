package military_elite.abstraction;

import military_elite.interfaces.Private_Interface;

public class Private extends Soldier implements Private_Interface {

    private Double salary;

    public Private(int id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("  Name: %s %s Id: %d Salary: %.2f\n", super.getFirstName(), super.getLastName(),
                super.getId(), this.getSalary()));
        return sb.toString();
    }

}