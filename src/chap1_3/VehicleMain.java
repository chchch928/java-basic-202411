package chap1_3;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle genesis = new Vehicle("제네시스");
        genesis.powerOn();
        genesis.powerOn();
        System.out.println("=================");

        Vehicle panamera = new Vehicle("파나메라");
        panamera.powerOff();
        panamera.accelerate();
        panamera.accelerate();
        panamera.accelerate();

        genesis.accelerate();

    }
}
