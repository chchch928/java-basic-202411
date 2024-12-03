package chap1_8.pratice.q4;

public class Book extends Product{
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
    @Override
    public double calculatePrice() {
        return price;
    }
}
