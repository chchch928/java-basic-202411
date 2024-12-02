package chap1_7.practice.q2;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("현대", "소나타", 2020);
        ElectricCar myElectricCar = new ElectricCar("테슬라", "모델 3", 2021, 75);

        myCar.start();
        myElectricCar.start();
        myElectricCar.displayRange();
    }
}
