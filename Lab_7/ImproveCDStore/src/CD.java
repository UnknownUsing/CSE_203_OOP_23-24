import java.io.Serializable;

public class CD implements Serializable {
    private String cdTitle;
    private String cdCollection;
    private String cdType;
    private double cdPrice;
    public CD(String cdTitle, String cdCollection, String cdType, double cdPrice) {
        this.cdTitle = cdTitle;
        this.cdCollection = cdCollection;
        this.cdType = cdType;
        this.cdPrice = cdPrice;
    }

    public String getCdCollection() {
        return cdCollection;
    }

    public String getCdType() {
        return cdType;
    }

    public String getCdTitle() {
        return cdTitle;
    }

    public double getCdPrice() {
        return cdPrice;
    }
}
