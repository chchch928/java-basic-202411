package chap1_10.abs;

public class Main {
    public static void main(String[] args) {

//      Pet pet = new Pet(); // 추상클래스이기 때문에 추상적인 객체 불가능

        Dog mydog = new Dog();
        Dog yourdog = new Dog();
        Cat mycat = new Cat();

        Pet[] petList = {mydog, mycat,new GoldFish()};

        // 추상클래스 pet에도 eat메서드가 있어야 pet.eat() 실행가능
        for (Pet pet : petList) {
            pet.eat();

        }

    }
}
