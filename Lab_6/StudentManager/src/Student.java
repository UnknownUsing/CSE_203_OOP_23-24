public class Student {
    private String studentID;
    private String lastName;
    private String middleName;
    private String firstName;
    private int yearOfBirth;
    private String gender;
    private String schoolStage;

    public Student(String studentID, String lastName, String middleName, String firstName, int yearOfBirth, String gender, String schoolStage) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.schoolStage = schoolStage;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getSchoolStage() {
        return schoolStage;
    }
}
