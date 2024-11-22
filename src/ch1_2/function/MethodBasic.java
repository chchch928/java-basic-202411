package ch1_2.function;

public class MethodBasic {

    // 두개의 정수를 전달받아 그 합을 반환하는 함수
    // 자바스크립트에서 function 자리에 return 의 타입을 적어야함
    static int add(int n1, int n2) {
        return n1 + n2;
    }
    // 두 개의 정수를 전달받아 그 곱을 콘솔에 출력하는 함수
    // return 이 없는 경우 void
    static void printMultiply(int n1, int n2){
        if ( n1 < 0) return;
        System.out.printf("%d x %d = %d \n", n1,n2,n1*n2);

    }
    // n개의 정수를 전달받아 그 총합을 반환하는 함수
    static  int addAll(int...numbers){
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }
    // 2개의 정수를 전달받아 그 사칙연산의 4가지 결과를 리턴
    // ctrl Alt n을 하면 addResult의 결과 값이 new int 안으로 들어감
    // ctrl Alt d를 하면 원래의 자리로 되돌아감
    static int[] operate (int n1, int n2){
        int addResult = n1 + n2;
        int subResult = n1 - n2;
        int mulResult = n1 * n2;
        return new int[] {addResult, subResult, mulResult,n1/n2};

    }


    // 자바에서는 함수를 메서드라고 부릅니다.
    // 정의 위치는 반드시 클래스 내부, 다른 메서드 외부여야함
    public static void main(String[] args) {
        int r1 = add(30, 50);
        System.out.println("r1="+ r1); // r1 = 80

        printMultiply(5,4); // 5 x 4 = 20

        printMultiply(add(2,3),add(6,8)); //5 x 14 = 70

//        int [] arr = {10,20,30};
//        int r2 = addAll(arr);

        // 위의 과정을 생략하려면 new int[] 를 선언해야함
        int r2 = addAll(new int[] {10,20,30});
        System.out.println("r2="+ r2);

        int r3 =addAll(10,20,30,50);
        System.out.println("r3="+ r3);

        int[] operateResults = operate(20, 5);
        System.out.println("덧셈결과: " + operateResults[0]);

        int r4 = operate(60, 20)[2];
        System.out.println("r4 = " + r4);

    }
}
