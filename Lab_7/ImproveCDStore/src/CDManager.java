import java.io.Serializable;
import java.util.ArrayList;

public class CDManager implements Serializable {
    private ArrayList<CD> cdArrayList = new ArrayList<>();

    public CDManager() {
    }
    public ArrayList<CD> getCdArrayList() {
        return cdArrayList;
    }
    public boolean addCD(CD newCD){
        for (CD cd: cdArrayList) {
            if (newCD.getCdTitle().equals(cd.getCdTitle())){
                return false;
            }
        }
        cdArrayList.add(newCD);
        return true;
    }

    public CDTableModel getCDTableModel(){
        return new CDTableModel(cdArrayList);
    }
}
