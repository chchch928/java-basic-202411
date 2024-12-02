package chap1_7.practice.q5;

public class Order {

    public String orderId;
    public double amount;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;

    }
    // 메서드: 주문을 처리하는 동작
    public void process() {
        System.out.println("주문 ID: " + orderId + "이(가) 처리되었습니다.");
    }
}
