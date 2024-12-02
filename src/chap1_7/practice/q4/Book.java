package chap1_7.practice.q4;

public class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void read(){
        System.out.println("책을 읽습니다.");
    }
}
