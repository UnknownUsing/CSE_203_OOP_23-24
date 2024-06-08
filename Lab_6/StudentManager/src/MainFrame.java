import javax.swing.*;

public class MainFrame extends JFrame {
    private StudentManager studentManager = new StudentManager();
    private JPanel mainPanel;
    private JButton checkTotalStudentButton;
    private JButton addNewStudentButton;
    private JTable table1;
    private JButton refreshButton;
    private StudentTableModel studentTableModel;


    public MainFrame() {
        setTitle("Student Management");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setVisible(true);
        pack();

        studentTableModel = studentManager.getStudentTableModel();
        table1.setModel(studentTableModel);

        checkTotalStudentButton.addActionListener(e -> JOptionPane.showMessageDialog(MainFrame.this,
                "Total Students: " + studentManager.getStudents().size(),
                "Total Students", JOptionPane.INFORMATION_MESSAGE));

        addNewStudentButton.addActionListener(e -> {
            StudentDialog studentDialog = new StudentDialog(MainFrame.this, studentManager);
        });

        refreshButton.addActionListener(e -> refresh());


    }

    public void refresh(){
        studentTableModel.fireTableDataChanged();
    }


}
