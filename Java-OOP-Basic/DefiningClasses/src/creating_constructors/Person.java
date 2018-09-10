package creating_constructors;

public class Person {

    private static final String DEFAULT_NAME = "No name";
    public static final int DEFAULT_AGE = 1;

    private String name;
    private int age;

    public Person() {
        this(DEFAULT_NAME, DEFAULT_AGE);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;

        this.age = age;
    }

    public Person(int age) {
        this(DEFAULT_NAME, age);
    }
}
