package ch1_2;

public class SwitchExample {
    public static void main(String[] args) {

        int a = 10;
        double b = 5.5;

        String season = "여름";
        String spring = "봄";
        // switch 들어가는 변수의 타입은 정수형 또는 문자형 (double 불가능)
        switch (season) {
            // case 변수 지정 불가능, 정수 혹은 리터럴만 가능
            //case spring: -> 불가능
            case "봄":
                System.out.println("봄에는 산책을 합시다.");
                break;
            case "여름":
                System.out.println("여름에는 수영을 합시다");
                break;
            case "가을":
            case "겨울":
            default:
        }
    } // end main
} // end class
