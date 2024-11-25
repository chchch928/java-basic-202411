package chap1_2;

public class Casting {
    public static void main(String[] args) {

        // 타입 캐스팅
        // 타입이 다르면 연산 불가능

        // 묵시적 형 변환 : 작은 데이터를 큰 데이터에 대입하면 자동변환
        byte a = 100; // 1byte
        int b = a;   // 4 byte
        System.out.println("b="+b);

        // 큰 데이터를 작은 공간에 넣을 때는 명시적으로 변환을 해야함

        // 0: 양수, 1: 음수
        // 0 0000000 00000000 00000011 11101000 = 1000
        int c = 1000; // 4byte
        // 1 1101000 뒤에 8자리만 들고옴
        // 1의 보수 : 비트를 반전
        // 1101000 -> 0010111
        // 2의 보수: 1을 더함
        // 0010111
        //+      1
        // 0011000 ->24
        byte d = (byte)c;  // 1byte
        System.out.println("d="+d); // d= -24

        // 결론 : 큰 데이터를 작은 공간에 대입하면 데이터 손실 가능성이 있음

        int k = 50; // 4byte :정수
        double j = k;  // 8byte : 실수
        System.out.println("j="+j); // j = 50.0

        double m = 5.567;
        int n = (int)m;
        System.out.println("n="+n); // n=5(소수점 버려짐)

        // 묵시적 형변환 -> upcasting (promotion)
        // 명시적 형변환 -> downcasting

        // 타입이 다른 연산의 경우 비트가 큰 쪽에 맞춰서 자동 캐스팅
        int v =100;
        double z = 6.6;
        double result = v + z;

        char result2 = (char) ('A' + v);
        System.out.println("result2=" + result2);

        int h =5;
        double result3 = 27 / (double)5;
        System.out.println("result3="+result3);

        // int 보다 작은 데이터의 연산은 모두 강제로 int 로 변환됨
        byte b1 = 100;
        byte b2 = 20;
        int b3 = b1 * b2;

        // char + char == int
        int i = 'A' + 'B';

    }
}
