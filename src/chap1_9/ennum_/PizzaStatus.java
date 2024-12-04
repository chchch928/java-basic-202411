package chap1_9.ennum_;

public enum PizzaStatus {

    ORDERED("주문 완료"),
    READY("준비 완료"),
    DELIVERED("배달 완료")
    ;

    // 상수의 추가 정보 데이터를 필드로 생성
    private String description;

    // 해당 필드를 초기화할 생성자
    PizzaStatus(String description) {
        this.description = description;
    }
    // 접근제한된 필드에 값을 참조하는 getter
    public String getDescription() {
        return description;
    }

//    public static final String ORDERED = "ORDERED";
//    public static final String READY = "READY";
//    public static final String DELIVERED = "DELIVERED";

}
