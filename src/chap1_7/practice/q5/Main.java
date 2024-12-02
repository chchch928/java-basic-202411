package chap1_7.practice.q5;

public class Main {
    public static void main(String[] args) {

        Order order = new Order("ORD12345", 50000);
        OnlineOrder onlineOrder = new OnlineOrder("ORD67890", 50000, 2500);

        order.process();
        onlineOrder.process();
        System.out.println("총 결제 금액: " + onlineOrder.calculateTotalAmount() + "원");
    }

}

