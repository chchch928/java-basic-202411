package chap1_3;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputName = sc.nextLine();
        String myName = "홍길동";

        System.out.println("inputName = " + inputName);
        System.out.println("myName = " + myName);


//        if (inputName == myName) {
//            System.out.println("두 이름이 같습니다.");
//        } else {
//            System.out.println("두 이름이 다릅니다.");
//        }
        // 홍길동이라고 입력해도 두 이름이 다르다고 출력된다 ==은 주소값을 비교하기 때문

        if (inputName.equals(myName)) {
            System.out.println("두 이름이 같습니다.");
        } else {
            System.out.println("두 이름이 다릅니다.");
        }
        // equals 는 두 이름의 글자수가 같은지 확인한 후 같으면 for 문을 돌려서 각각의 글자가 일치한지 확인

        // a =["홍","길","동"]
        // b =["홍","길","동"]


    }
}
