package entities;

public class CurrencyConverter {

    public static final double totalReal(double dollar, double quantity) {
        return ((dollar * 6 / 100) * quantity) + dollar * quantity ;
    }

}
