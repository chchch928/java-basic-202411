package chap1_8.poly;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

/*
          Object
            |
            A
         /    \
        B      C   -> B 와 C 는 상속관계가 아님
        |      |
        D      E    ->C와 D는 상속관계가 아님 / A와E는 상속관계임
 */

public class Basic {

    public static void main(String[] args) {
        // 다형성 : 객체가 다양한 형태를 가지고 있는 성질
        //               다양한 타입을 사용할 수 있다.
        //               (부모의 타입)
        // 전제: 상속관계에서만 가능

        //type     constructor
           A x1 = new A(); // 지역변수
           A x2 = new B();
           A x3 = new C();
           A x4 = new D();
           Object x5 = new E();

    }

}
