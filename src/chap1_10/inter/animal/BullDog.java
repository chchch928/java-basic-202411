package chap1_10.inter.animal;

    // 클래스 상속과 인터페이스 구현을 동시에 할 때는 상속이 우선
public class BullDog extends Animal implements Huntable,Wild,Pet {



    @Override
    public void hunt(Animal pet) {

    }

    @Override
    public void handle() {

    }

    @Override
    public void inject() {

    }

    @Override
    public void violent() {

    }

    // 사냥 가능(Hunt)

    // 난폭한 행동(Wild)

    // 애완동물로 키울 수도 있음(Pet)
}
