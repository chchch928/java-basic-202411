package chap1_6;

public class Main {
    public static void main(String[] args) {

        MyCar mycar = new MyCar();

        mycar.pressStartButton();

        mycar.setMode("N");
        System.out.println("현재 모드:"+ mycar.getMode());

    }
}
