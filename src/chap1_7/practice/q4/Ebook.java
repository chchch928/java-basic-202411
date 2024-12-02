package chap1_7.practice.q4;

public class Ebook extends Book {
    public double fileSize;

    Ebook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    @Override
    public void read(){
        System.out.println("전자책을 읽습니다.");

    }
    public double displayFileSize() {
        return fileSize;
    }
}
