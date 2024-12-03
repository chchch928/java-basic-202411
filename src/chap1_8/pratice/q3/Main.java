package chap1_8.pratice.q3;

public class Main {
    public static void main(String[] args) {

        VehicleManager manager = new VehicleManager();

        Vehicle car = new Car("현대", "소나타");
        Vehicle motorcycle = new Motorcycle("스포츠");

        manager.startVehicle(car);        // 자동차 엔진 시작
        manager.startVehicle(motorcycle); // 오토바이 엔진 시작
    }
}
