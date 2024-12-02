package chap1_7.practice.q5;

public class OnlineOrder extends Order {

    public double deliveryFee;


    OnlineOrder(String orderId, double amount, double deliveryFee) {
        super(orderId, amount);
        this.deliveryFee = deliveryFee;
    }

    @Override
    public void process() {
        System.out.println("온라인 주문 ID: " + orderId + "이(가) 처리되었습니다.");
    }
    // 메서드: 총 금액(주문 금액 + 배송료)을 계산하여 반환
    public double calculateTotalAmount() {
        return amount + deliveryFee;
    }

}
