package chap1_8.pratice.q4;

public class Electronics extends Product {
    private String model;
    private double basePrice;
    private double taxRate;

    public Electronics(String model, double basePrice, double taxRate) {
        this.model = model;
        this.basePrice = basePrice;
        this.taxRate = taxRate;
    }

}
