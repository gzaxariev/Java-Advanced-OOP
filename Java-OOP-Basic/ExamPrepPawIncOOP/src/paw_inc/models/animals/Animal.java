package paw_inc.models.animals;

public abstract class Animal  {
    private String name;
    private int age;
    private boolean isCleansed;
    private String adoptionCenter;

    public Animal(String name, int age, boolean isCleansed, String adoptionCenter) {
        this.name = name;
        this.age = age;
        this.isCleansed = isCleansed;
        this.adoptionCenter = adoptionCenter;
    }

    public  boolean isCleansed(){
        return this.isCleansed;
    }

}
