package chap1_6.practice.q1;

public class LibraryMember {
    public String memberId;
    private String name;
    private int borrowedBooks;

    // 기본 생성자: 파라미터가 없는 생성자
    // 클래스 안에 생성자가 하나도 없으면 기본 생성자가 자동으로 만들어짐

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        // this.borrowedBooks = 0; 자동으로 int는 0이 세팅되므로 할필요 없음
    }

    public void borrowBook(){

        if ( borrowedBooks < 5 )
         {
            borrowedBooks++;
            System.out.printf("%s님이 책 한권을 빌렸습니다. 현재 빌린 책의 수는: %d개\n",name,borrowedBooks);
        } else {
            System.out.printf("%s님은 이미 5권의 책을 빌리셨습니다 더이상 빌리실 수 없습니다\n",name);
        }
    }
    public void returnBook(){

        if ( borrowedBooks > 0 )
         {
            borrowedBooks--;
            System.out.printf("%s님이 책 한권을 반납했습니다. 현재 빌린 책의 수는: %d\n",name,borrowedBooks);
        } else {
            System.out.printf("%s님은 반납할 책이 없습니다\n",name);
        }

    }
        public void displayMemberInfo(){
            System.out.println("회원 id:"+memberId);
            System.out.println("회원이름:"+ name);
            System.out.println("현재 빌린 책의 수:"+ borrowedBooks);
        }
}
