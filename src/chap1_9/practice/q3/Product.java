package chap1_9.practice.q3;

public class Product {

    private String productName;
    private double price;
    private static final double DISCOUNT_RATE = 0.1;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
    public void getProductInfo(){
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
    }
    public void getDiscountedPrice(){
        this.price *= DISCOUNT_RATE;

    }
}
