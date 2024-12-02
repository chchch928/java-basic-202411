package chap1_7.protected_.pac2;

import chap1_7.protected_.pac1.A;

// protected: 다른 패키지의 접근을 차단, 단 상속관계에 있다면 부분적으로 허용

public class D  extends A {

    D(){
        super(123); // 부모의 생성자를 호출
        this.f1 = 10;  // protected
        // this.f2 = 10; // default이므로 오류 발생
    }


}
