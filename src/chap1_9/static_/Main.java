package chap1_9.static_;

public class Main {
    public static void main(String[] args) {

        Count.x = 10;
        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

        c1.m2();
        c2.m2();
        c3.m2();

        c1.y =10;
        c2.y++;

        System.out.println("c1.y = " + c1.y);
        System.out.println("c2.y = " + c2.y);

        c1.x = 99;
        c2.x -= 92;
        System.out.println("c1.x = " + c1.x);
        System.out.println("c2.x = " + c2.x);


    }
}
