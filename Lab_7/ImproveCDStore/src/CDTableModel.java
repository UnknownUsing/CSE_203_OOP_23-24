import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class CDTableModel extends AbstractTableModel {
    private final String[] colName = {"Title","Collection","Type","Price"};
    private ArrayList<CD> cdArrayList;
    public CDTableModel(ArrayList<CD> cdArrayList) {
        this.cdArrayList = cdArrayList;
    }
    @Override
    public int getRowCount() {
        return cdArrayList.size();
    }

    @Override
    public int getColumnCount() {
        return colName.length;
    }

    @Override
    public String getColumnName(int col){
        return colName[col];
    }


    public void removeRow(int rowIndex){
        if (this.cdArrayList.remove(this.cdArrayList.get(rowIndex))){
            fireTableRowsDeleted(rowIndex,rowIndex);
        }
    }


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CD cd = cdArrayList.get(rowIndex);
        switch (columnIndex) {
            case 0 -> {
                return cd.getCdTitle();
            }
            case 1 -> {
                return cd.getCdCollection();
            }
            case 2 -> {
                return cd.getCdType();
            }
            case 3 -> {
                return cd.getCdPrice();
            }
            default -> {
                return null;
            }
        }
    }


}
