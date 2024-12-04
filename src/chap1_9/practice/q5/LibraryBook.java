package chap1_9.practice.q5;

public class LibraryBook {

    private String title;
    private String author;
    private GENRE genre;

    public LibraryBook(String title, String author, GENRE genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public void getBookInfo(){
        System.out.println("책 제목: "+title);
        System.out.println("저자: "+author);
        System.out.println("장르: "+genre);

    }
}
