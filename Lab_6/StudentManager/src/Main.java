import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Ensure the program exits when the frame closes
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create and display the main application window
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
        });
    }
}