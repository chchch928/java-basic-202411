package chap1_9.static_;

public class Main {
    public static void main(String[] args) {

        Count.x = 10;
        // 정적 메서드
        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

        // 인스턴스 메서드
        c1.m2();
        c2.m2();
        c3.m2();

        c1.y =10;
        c2.y++;
        c3.y=-9999;

        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);
        System.out.println("c3.y = " +c3.y);

        // static은 어차피 같은 값이 되므로 클래스이름.필드명
        Count.x = 99;
        Count.x -= 92;
        Count.x = 50000;

        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);
        System.out.println("c3.x = " + c3.x);


    }
}
