package ch1_2;

public class VarScope {
    public static void main(String[] args) {
        // 자바는 변수가 선언된 중괄호(블록)에서 생성되고
        // 블록이 끝나는 부분에서 소멸한다.
        int x1 = 10;
        if (true){
            int x2 =20;
        } // 출력 안됨 밖으로 나오지 못함
        int x2 = 50; // 출력
        System.out.println("x1="+ x1);
        System.out.println("x2="+ x2);

    }
}
