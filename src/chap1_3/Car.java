package chap1_3;

public class Car {

    // 속성 정의
    int speed;

    // 기능
    void accelerate(int increment) {
        speed += increment;
    }
    void brake(int decrement) {
        speed -= decrement;
    }
    void displaySpeed(){
        System.out.println(speed);
    }
    Car(int currentSpeed) {
        speed = currentSpeed;
    }

}
