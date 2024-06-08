import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NewCDDIalog extends JDialog {
    private JPanel contentPane;
    private JTextField cdTitle;
    private JTextField cdCollection;
    private JTextField cdType;
    private JTextField price;
    private JButton OKButton;
    private JButton clearButton;
    private JButton cancelButton;
    private JButton buttonOK;
    private CDManager cdManager;

    public NewCDDIalog(Frame parent, CDManager cdManager) {
        super(parent,"New CD", false);
        setContentPane(contentPane);
        setVisible(true);
        pack();
        setLocationRelativeTo(parent);
        this.cdManager = cdManager;

        OKButton.addActionListener(this::saveCD);
        clearButton.addActionListener(e -> clearCD());
        cancelButton.addActionListener(e -> dispose());

    }

    public void saveCD(ActionEvent e){
        String cdTitle = this.cdTitle.getText();
        String cdCollection = this.cdCollection.getText();
        String cdType = this.cdType.getText();
        int cdPrice = Integer.parseInt(price.getText());

        CD newCD = new CD(cdTitle,cdCollection,cdType,cdPrice);

        if (cdManager.addCD(newCD)){
            JOptionPane.showMessageDialog(this, "CD Added Succesfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void clearCD(){
        cdTitle.setText("");
        cdCollection.setText("");
        cdType.setText("");
        price.setText("");
    }
}
