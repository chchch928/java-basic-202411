package chap1_2;

public class DataType {

    //  메인 메서드: 프로그램의 실행 기점 main 치고 enter
    public static void main(String[] args) {

        // ctrl + Alt + v 로 타입입력 해줌
        int i = 20;
        double pi = 3.14;
        char c = '가';
        String greeting = "하윙";
        boolean flag = true;

        // 정수 타입 (byte, short, int, long)
        // 1byte == 8bit (여덟자리의 이진수까지 저장 즉,-128,128부터는 byte 지정불가능)
        byte x1 = 127;
        // 1short == 16 bit (열여섯자리의 이진수까지 저장)
        short x2 = 32767;
        int x3 = 2147483647;

        //10; // 리터럴 : 변수에 저장되기 전 데이터

        // 정수 리터럴의 기본타입 int
        long x4 = 2147483648L;
        System.out.println(x4);

        //=======실수타입=======//
        float f1 = 3.14F; // 4byte
        double f2 = 3.14;  // 8byte
        System.out.println("f1=" +f1);
        System.out.println("f2="+f2);

        //======논리타입======//
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 10 < 5;
        boolean b4 = (10 + 3 == 13) && (9 * 1 == 8);

        //=====문자와 문자열 타입======//
        char c1 = 'A'; // 2byte
        char c2 = 66;  // B
        System.out.println("c2=" +c2);

        char[] cArr = {'h','e','l','l','o'};
        String str = new String(cArr);
        System.out.println("str=" +str);

        String str2 = "안녕하세요"; // 무조건 쌍따옴표로 문자표시
        System.out.println("str2="+str2);

        // 자바 17부터 지원 """를 사용하면 줄바꿈 사용가능
        String str3 = """
                        안녕
                        ㅇㄹㄴ
                      """;
        // 동적 타이핑 (자바 9)
        var z = 100; // 타입 추론
        var h = "dsfdf";

    }
}
