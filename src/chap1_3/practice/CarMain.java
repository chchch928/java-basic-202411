package chap1_3.practice;

public class CarMain {
    public static void main(String[] args) {
        Car Santafe = new Car(100);
        Santafe.accelerate(20);
        Santafe.accelerate(20);
        Santafe.brake(20);
        Santafe.displaySpeed();
    }
}
