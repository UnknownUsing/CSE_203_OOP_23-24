import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class PriceCalc extends JFrame {
    private JPanel mainPanel;
    private JTextField guestNameField;
    private JCheckBox breakfast$20CheckBox;
    private JCheckBox golf$50CheckBox;
    private JCheckBox pool$15CheckBox;
    private JComboBox dayWeekChooser;
    private JButton calculateButton;
    private JTextPane resultDisplay;

    public PriceCalc() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Price Calculation");
        setLocationRelativeTo(null);
        pack();
        setSize(640,480);
        resultDisplay.setEditable(false);

        calculateButton.addActionListener(e -> {
            StyledDocument doc = resultDisplay.getStyledDocument();
            SimpleAttributeSet center = new SimpleAttributeSet();
            StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
            doc.setParagraphAttributes(0, doc.getLength(), center, false);
            double totalPrice = 200;
            String name = guestNameField.getText();
            if (breakfast$20CheckBox.isSelected()) {
                totalPrice = totalPrice + 20;
            }
            if (golf$50CheckBox.isSelected()) {
                totalPrice = totalPrice + 50;
            }
            if (pool$15CheckBox.isSelected()) {
                totalPrice = totalPrice + 15;
            }
            if (dayWeekChooser.getSelectedIndex() == 1) {
                totalPrice = totalPrice + (totalPrice * 0.3);
            }else if (dayWeekChooser.getSelectedIndex() == 0) {
                totalPrice = totalPrice - (totalPrice * 0.1);
            }
            resultDisplay.setText("Hello "+name+"! Your payment is $"+totalPrice+".");
        });
    }
}
