package chap1_9.final_;


class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }
//    @Override
//    public void eat() {
//        System.out.println("생선냠냠");
//    }
// Animal의 eat 메서드가 final이므로 무조건 고정
}



public class Animal {

    public final void eat(){
        System.out.println("냠냠!");
    }

    public void makeSound(){
        System.out.println("동물의 울음소리");
    }
}
