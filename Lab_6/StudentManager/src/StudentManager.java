import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        for(Student s : students) {
            if (student.getStudentID().equals(s.getStudentID())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student getStudentByID(String studentID) {
        for(Student s : students) {
            if (s.getStudentID().equals(studentID)) {
                return s;
            }
        }
        return null;
    }

    public StudentTableModel getStudentTableModel() {
        return new StudentTableModel(students);
    }
}
