package mankind;

public class Worker extends Human {

    private static final int WORKING_DAYS_PER_WEEK = 7;

    private static final String INVALID_WORKING_LAST_NAME = "Expected length more than 3 symbols!Argument: lastName";
    private static final String INVALID_WORKING_SALARY = "Expected value mismatch!Argument: weekSalary";
    private static final String INVALID_WORKING_HOURS = "Expected value mismatch!Argument: workHoursPerDay";

    private double weekSalary;
    private double workHoursPerDays;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDays) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDays(workHoursPerDays);
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length() <=3){
            throw new IllegalArgumentException(INVALID_WORKING_LAST_NAME);
        }
        super.setLastName(lastName);
    }

    private double getSalaryPerHours() {
        double salaryPerHour = this.weekSalary / (this.workHoursPerDays * WORKING_DAYS_PER_WEEK);
        return salaryPerHour;
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary <= 10){
            throw new IllegalArgumentException(INVALID_WORKING_SALARY);
        }
        this.weekSalary = weekSalary;
    }

    private void setWorkHoursPerDays(double workHoursPerDays) {
        if (workHoursPerDays < 1 || workHoursPerDays > 12){
            throw new IllegalArgumentException(INVALID_WORKING_HOURS);
        }
        this.workHoursPerDays = workHoursPerDays;
    }

    @Override
    public String toString() {

        StringBuilder worker = new StringBuilder();

        worker.append(super.toString()).append(System.lineSeparator())
                .append("Week Salary: ").append(String.format("%.2f", this.weekSalary)).append(System.lineSeparator())
                .append("Hours per day: ").append(String.format("%.2f", this.workHoursPerDays)).append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%.2f", this.getSalaryPerHours()));

        return worker.toString();
    }


}
