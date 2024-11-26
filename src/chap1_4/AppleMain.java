package chap1_4;

import chap1_4.juice.*;

public class AppleMain {
    public static void main(String[] args) {
        Apple apple1 = new Apple(); // import 문을 활용해야 보다 간단하게 표현가능 (다른패키지에 있는 경우)

        chap1_4.cake.Apple apple2 = new chap1_4.cake.Apple();

        /*
        패키지 이름 관례
        1. 전부 소문자로 작성
        2. 변수, 메서드 이름처럼 관례를 지킬 것
        3. 띄어쓰기가 있는 경우 -> 패키지를 쪼갬
         ex) my phone number -> my.phone.number
        4. 왠만하면 java 라는 단어를 쓰지 말것
         -> 라이브러리랑 헷갈림
        */
    }
}
