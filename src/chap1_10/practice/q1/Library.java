package chap1_10.practice.q1;

public class Library {

    public void printBookInfo(Book book) {
        book.displayInfo();
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book ebook = new Ebook("자바의 정석", "남궁성", 5.5);
        Book printedBook = new PrintedBook("Clean Code", "Robert C. Martin", 464);

        library.printBookInfo(ebook);        // Ebook 정보 출력
        library.printBookInfo(printedBook);  // PrintedBook 정보 출력

    }
}
