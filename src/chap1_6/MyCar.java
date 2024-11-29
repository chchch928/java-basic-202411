package chap1_6;

public class MyCar {

    private String mode; // 변속모드 D,R,P,N

    // 변속모드를 검증하고 세팅해주는 메서드: setter
    public void setMode(String mode) {
        switch(mode){
            case "D": case"R": case"N": case"P":
                this.mode = mode;
                break;
            default:
                this.mode = "P";
        }
    }

    // 필드값을 가져오는 메서드: getter

    public String getMode() {
        return mode;
    }

    // 기능
    // 엔진 오일을 분사하는 기능
    private void injectOil(){
        System.out.println("엔진오일이 분사됩니다.");
    }
    // 실린더가 움직이는 기능
    private void moveCylinder(){
        System.out.println("실린더가 움직입니다.");

    }
    // 시동을 거는 기능
    private void powerOn(){
        System.out.println("시동이 걸렸습니다.");
    }
    public void pressStartButton(){
        System.out.println("시동 버튼을 눌렀습니다.");
        injectOil();
        moveCylinder();
        powerOn();
    }
    // 따로 다 main에서 각각의 기능을 적을 필요없이
    // pressStartButton만 적으면 다른 기능들이 다 작동되도록 설정 public과 private을 이용

}
