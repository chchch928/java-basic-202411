package chap1_9.ennum_;

public class Pizza {

    private String pizzaName; // 피자이름
    private PizzaStatus status; // 주문상태 (주문완료, 요리완료, 배달완료)


    public String getStatus() {
        return this.status.getDescription();
    }
    // 피자 주문 기능
    public void orderPizza() {
        this.status = PizzaStatus.ORDERED;
        System.out.println("피자 주문이 들어왔습니다.");
    }
    // 피자 요리 완료 기능
    public void readyPizza() {
        if (this.status == PizzaStatus.ORDERED) {
            this.status = PizzaStatus.READY;
            System.out.println("피자 요리가 완료되었습니다.");
        } else {
            System.out.println("아직 피자 주문이 없습니다.");
        }
    }
    // 피자 배달 기능
    public void deliverPizza() {
        if (this.status == PizzaStatus.READY) {
            this.status = PizzaStatus.DELIVERED;
            System.out.println("피자가 배달되었습니다.");
        } else {
            System.out.println("피자가 아직 요리중입니다.");
        }


    }
}
