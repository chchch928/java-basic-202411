package chap1_10.practice.q1;

public class PrintedBook extends Book {

    private int pageCount;

    public PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }



    @Override
    public void displayInfo() {
        System.out.println("===== 종이책 정보 =====");
        System.out.println("책 제목: "+title);
        System.out.println("저자: "+author);
        System.out.println("페이지 수: "+pageCount);

    }
}
