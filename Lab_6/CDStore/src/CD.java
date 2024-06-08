public class CD {
    private String cdID;
    private String cdCollection;
    private String cdType;
    private String cdTitle;
    private double cdPrice;
    private int cdYearOfRelease;

    public CD(String cdID, String cdCollection, String cdType, String cdTitle, double cdPrice, int cdYearOfRelease) {
        this.cdID = cdID;
        this.cdCollection = cdCollection;
        this.cdType = cdType;
        this.cdTitle = cdTitle;
        this.cdPrice = cdPrice;
        this.cdYearOfRelease = cdYearOfRelease;
    }

    public String getCdID() {
        return cdID;
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

    public int getCdYearOfRelease() {
        return cdYearOfRelease;
    }
}
