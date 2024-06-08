import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableRowSorter;
import java.io.*;

public class CDStore extends JFrame implements Serializable{
    private JButton newCDButton;
    private JButton backupButton;
    private JButton restoreButton;
    private JButton refreshButton;
    private JButton deleteButton;
    private JTable cdTable;
    private JComboBox cdType;
    private JTextField searchBox;
    private JButton searchButton;
    private JPanel mainPanel;
    private CDManager cdManager = new CDManager();
    private CDTableModel cdTableModel;
    private TableRowSorter<CDTableModel> rowSorter;
    private int size;

public CDStore() {
    setContentPane(mainPanel);
    pack();
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    cdTableModel = cdManager.getCDTableModel();
    cdTable.setModel(cdTableModel);
    rowSorter = new TableRowSorter<>(cdTableModel);


    newCDButton.addActionListener(e -> {
        NewCDDIalog newCDDIalog = new NewCDDIalog(CDStore.this, cdManager);
    });

    refreshButton.addActionListener(e -> refreshTable());

    deleteButton.addActionListener(e -> {
        int rowIndex = cdTable.convertRowIndexToModel(cdTable.getSelectedRow());
        cdTableModel.removeRow(rowIndex);
    });


    backupButton.addActionListener(e -> {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("eiu","eiu");
        fileChooser.setFileFilter(fileFilter);
        ObjectOutputStream outputStream = null;

        int x = fileChooser.showDialog(CDStore.this,"Choose file");
        if (x == JFileChooser.APPROVE_OPTION){
            File f = fileChooser.getSelectedFile();
            try {
                outputStream = new ObjectOutputStream(new FileOutputStream(f));
                outputStream.writeInt(cdManager.getCdArrayList().size());
                for (CD cd : cdManager.getCdArrayList()) {
                    outputStream.writeObject(cd);
                }
                size = cdManager.getCdArrayList().size();
                outputStream.flush();
                outputStream.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    });


    restoreButton.addActionListener(e -> {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("eiu","eiu");
        fileChooser.setFileFilter(fileFilter);
        ObjectInputStream inputStream;

        int x = fileChooser.showDialog(CDStore.this,"Choose file");
        if (x == JFileChooser.APPROVE_OPTION){
            File f = fileChooser.getSelectedFile();
            try {
               inputStream = new ObjectInputStream(new FileInputStream(f));
               inputStream.readInt();
               while (true){
                   try{
                       cdManager.getCdArrayList().add((CD) inputStream.readObject());
                   }
                   catch (EOFException eof){
                       break;
                   }
               }
               refreshTable();
               inputStream.close();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    });

    }

    public void refreshTable(){
        cdTableModel.fireTableDataChanged();
    }
}
