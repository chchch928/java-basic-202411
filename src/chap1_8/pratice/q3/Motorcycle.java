package chap1_8.pratice.q3;

public class Motorcycle extends Vehicle {

    private String type;

    public Motorcycle(String type) {
        this.type = type;
    }

    @Override
    public void startEngine(){
        System.out.println(type+" 오토바이 엔진에 시동을 겁니다.");
    }

}
