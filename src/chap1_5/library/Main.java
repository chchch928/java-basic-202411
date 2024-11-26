package chap1_5.library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("마법사의 돌");
        System.out.println("book1= " + book1);

        Book Book2 = new Book("반지의 제왕","골룸",2012);
        System.out.println("Book2= " + Book2);
    }
}
