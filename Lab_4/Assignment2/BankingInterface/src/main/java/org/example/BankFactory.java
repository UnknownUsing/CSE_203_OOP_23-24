package org.example;

public class BankFactory {
    public BankFactory() {
    }


    public static final Bank getBank(String bankType) {
        switch (bankType) {
            case "TPBANK":
                return new TPBANK();

            case "VIETCOMBANK":
                return new VIETCOMBANK();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }


}
