import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel {
    private final String[] columnNames = {"Student ID", "Last Name", "Middle Name", "First Name", "Year of Birth", "Gender", "School Stage"};
    private ArrayList<Student> students;

    public StudentTableModel(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = students.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> student.getStudentID();
            case 1 -> student.getLastName();
            case 2 -> student.getMiddleName();
            case 3 -> student.getFirstName();
            case 4 -> student.getYearOfBirth();
            case 5 -> student.getGender();
            case 6 -> student.getSchoolStage();
            default -> null;
        };
    }
}