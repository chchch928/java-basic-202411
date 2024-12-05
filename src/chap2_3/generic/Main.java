package chap2_3.generic;

public class Main {


    public static void main(String[] args) {

        // ===== 제네릭을 사용하지 않았을 때 =====//
        // 과일 전용바구니를 일일히 설계해야함

        // 사과바구니 생성
        AppleBasket appleBasket = new AppleBasket();
        appleBasket.setApple(new Apple (10));
        Apple apple = appleBasket.getApple();
        System.out.println("apple = "+ apple);

        //===== 제네릭을 사용했을 때 =====//
        // 바구니 설게도는 딱 한개만 만들고 바구니 생성시 전용과일을 지정

        Basket<Apple> ab = new Basket<Apple>();
        ab.setFruit(new Apple(20));
        Apple apple2 = ab.getFruit();

        Basket<Banana> bb= new Basket<Banana>();
        bb.setFruit(new Banana(30));
        Banana banana = bb.getFruit();

        Basket<Peach> peachBasket = new Basket<>();
        peachBasket.setFruit(new Peach());

        // Fruit 인터페이스에 속해있는 것만 Basket으로 만들수 있도록 설정했다.
        // Fruit 인터페이스에 속해있지 않으므로 catBasket은 만들 수 없음
//      Basket<Cat> catBasket = new Basket<>();


    }
}
