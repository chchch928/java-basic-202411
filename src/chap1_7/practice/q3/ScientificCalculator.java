package chap1_7.practice.q3;

public class ScientificCalculator extends Calculator {

    double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    @Override
    int add(int a, int b){
        System.out.println("과학 계산기로 더하기 연산을 수행합니다");
        return a + b;
    }

}
