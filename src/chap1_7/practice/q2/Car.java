package chap1_7.practice.q2;

public class Car {
    public String make;
    public String model;
    public int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println(make + " " + model + "이(가) 시동을 겁니다.");
    }
}
