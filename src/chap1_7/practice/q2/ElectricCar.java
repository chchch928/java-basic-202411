package chap1_7.practice.q2;



public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String make, String model ,int year ,int batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;

    }
    @Override
    public void start(){
        System.out.println(make + " " + model + "이(가) 조용히 시동을 겁니다.");

    }
    // 메서드: 배터리 용량에 따른 예상 주행 거리를 출력
    public void displayRange() {
        System.out.println("예상 주행 거리: " + (batteryCapacity * 5) + "km");
    }


}
