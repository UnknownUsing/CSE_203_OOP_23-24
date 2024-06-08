import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class StudentDialog extends JDialog {
    private JPanel contentPane;
    private JTextField studentID;
    private JTextField last;
    private JTextField middle;
    private JTextField first;
    private JTextField yearOfBirth;
    private JRadioButton female;
    private JRadioButton male;
    private JComboBox educationLevel;
    private JButton cancelButton;
    private JButton saveButton;
    private JButton clearButton;
    private StudentManager studentManager;

    public StudentDialog(Frame parent, StudentManager studentManager) {
        super(parent,"New Student");
        this.studentManager = studentManager;
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Dialog");
        setVisible(true);
        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(parent);

        saveButton.addActionListener(this::saveStudent);

        clearButton.addActionListener(e -> clearForm());

        cancelButton.addActionListener(e -> setVisible(false));
    }


    public void saveStudent(ActionEvent e){
        Student newStudent = getStudent();
        if (studentManager.addStudent(newStudent)) {
            studentManager.addStudent(newStudent);
            JOptionPane.showMessageDialog(this, "Student added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error: Student ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Student getStudent() {
        String studentIDI = studentID.getText();
        String lastNameI = last.getText();
        String middleI = middle.getText();
        String firstNameI = first.getText();
        int yearOfBirthI = Integer.parseInt(yearOfBirth.getText());
        String genderI = male.isSelected() ? "male" : "female";
        String educationLevelI = (String) educationLevel.getSelectedItem();

        return new Student(studentIDI, lastNameI, middleI, firstNameI, yearOfBirthI, genderI, educationLevelI);
    }

    private void clearForm() {
        studentID.setText("");
        last.setText("");
        middle.setText("");
        first.setText("");
        yearOfBirth.setText("");
        male.setSelected(true);
        educationLevel.setSelectedIndex(0);
    }
}
