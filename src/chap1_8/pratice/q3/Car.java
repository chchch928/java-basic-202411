package chap1_8.pratice.q3;

public class Car extends Vehicle {

    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println(make +" "+  model +"의 엔진에 시동을 겁니다.");
    }

}
