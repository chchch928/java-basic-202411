package chap1_7.protected_.pac1;


// 같은 패키지에 있으므로 default,protected 다 호출 가능
public class B {


    void test(){
       A a = new A();
       a.f1 = 10;
       a.f2 = 20;

       a.m1(); a.m2();

       new A(111); new A("dsgsf");
    }
}
