package chap1_9.practice.q1;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("아반떼", 2020);
        Car car2 = new Car("소나타", 2021);
        Car car3 = new Car("그랜저", 2022);

        car1.getCarInfo(); // 모델명: 아반떼, 제조년도: 2020
        car2.getCarInfo(); // 모델명: 소나타, 제조년도: 2021
        car3.getCarInfo(); // 모델명: 그랜저, 제조년도: 2022

        Car.getTotalCars(); // 총 생산된 자동차 개수: 3
    }


}
