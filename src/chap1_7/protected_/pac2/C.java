package chap1_7.protected_.pac2;

import chap1_7.protected_.pac1.A;

public class C {

    void test(){
        A a = new A();
//        a.f1 = 10; protected 접근 불가
//        a.f2 = 20; default 접근 불가

//        a.m1(); protected 접근불가
//        a.m2(); default 접근불가

//        new A(11111);  protected 접근불가
//        new A("dsfsadf"); default 접근불가


    }
}
