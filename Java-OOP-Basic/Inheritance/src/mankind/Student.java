package mankind;

public class Student extends Human {
    public static final String INVALID_FACULTY_NUMBER = "Invalid faculty number!";


   private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }



    public void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10){

            throw new IllegalArgumentException(INVALID_FACULTY_NUMBER);
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        StringBuilder student = new StringBuilder();
            student.append(super.toString()).append(System.lineSeparator())
                    .append("Faculty number: ").append(this.facultyNumber);
        return student.toString();
    }
}
