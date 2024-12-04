package chap1_10.practice.q1;

public class Ebook extends Book {

    public double filesize;

    public Ebook(String title, String author, double filesize) {
        super(title, author);
        this.filesize = filesize;

    }

    @Override
    public void displayInfo() {
        System.out.println("==== EBook 정보 ====");
        System.out.println("제목: " +title);
        System.out.println("작가: " +author);
        System.out.println("파일크기: " +filesize);

    }
}
