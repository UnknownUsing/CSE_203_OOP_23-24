import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class CDInputFrame extends JFrame {
    private JTextField id;
    private JTextField title;
    private JComboBox collectionCombo;
    private JRadioButton VCDRadioButton;
    private JRadioButton CDRadioButton;
    private JTextField price;
    private JTextField year;
    private JButton addButton;
    private JButton clearButton;
    private JButton showAllButton;
    private JPanel mainPanel;
    private CDManager cdManager;

    public CDInputFrame() {
        cdManager = new CDManager();
        setTitle("CD Input");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        addButton.addActionListener(e -> {
           String cdID = id.getText();
           boolean flag = true;
           if(cdID.isEmpty()) {
               JOptionPane.showMessageDialog(null, "Please enter CD ID", "Error", JOptionPane.ERROR_MESSAGE);
               flag = false;
           }
           String cdTitle = title.getText();
           if(cdTitle.isEmpty()) {
               JOptionPane.showMessageDialog(null, "Please enter CD Title", "Error", JOptionPane.ERROR_MESSAGE);
               flag = false;
           }
           String cdCollection = collectionCombo.getSelectedItem().toString();
           String cdType = VCDRadioButton.isSelected() ? "VCD" : "CD";
           double cdPrice = 0;
           int yearOfRelease = 0;
           try {
               cdPrice = Double.parseDouble(price.getText());
           }catch (NumberFormatException ime) {
               JOptionPane.showMessageDialog(null, "Please enter a valid price", "Error", JOptionPane.ERROR_MESSAGE);
               flag = false;
           }
            try {
                yearOfRelease = Integer.parseInt(year.getText());
            }catch (NumberFormatException ime) {
                JOptionPane.showMessageDialog(null, "Please enter a valid year", "Error", JOptionPane.ERROR_MESSAGE);
                flag = false;
            }
            CD cd = new CD(cdID,cdTitle,cdCollection,cdType,cdPrice,yearOfRelease);
            if (flag){
                cdManager.getCdArr().add(cd);
                clearContent();
                JOptionPane.showMessageDialog(null, "CD Added", "CD Added", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        clearButton.addActionListener(e -> clearContent());
    }

    public void clearContent(){
        id.setText("");
        title.setText("");
        collectionCombo.setSelectedIndex(0);
        price.setText("");
        year.setText("");
    }
}
