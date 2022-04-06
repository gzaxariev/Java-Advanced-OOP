package campany_roster_two;

public class Employee {
    public static final String DEFAULT_EMAIL = "n/a";
    public static final int DEFAULT_AGE = -1;

    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;


    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = DEFAULT_EMAIL;
        this.age = DEFAULT_AGE;
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = DEFAULT_AGE;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = DEFAULT_EMAIL;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {

        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);

    }
}
