package chap1_8.poly.casting;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 50;
        child.p1 = 200;

        child.parentMethod();
        child.childMethod();

        System.out.println("=================");

        Parent parent = new Parent();
        parent.p1 = 50;
//      parent.c1 = 200;
        parent.parentMethod();
//      parent.childMethod();
//      자식이 부모걸 사용할 수 있지만 부모는 자식걸 사용할 수 없다

        System.out.println("==================");

        Parent castingChild = new Child();
        castingChild.parentMethod();
//        Overriding한 Child의 메서드 1

        /*
        * 타입을 업캐스팅하는 것은 자식타입의 객체를 부모타입으로 사용하는 것을 말하며
        * 이것은 자동으로 처리된다.
        *
        * 그러나 업캐스팅되면 자식의 원래의 속성과 기능을 사용할 수 없는 문제가 생김.
        *
        * 따라서 자식이 원래 기능을 사용하려면 수동으로 다운캐스팅 해야함.
        * */


        ((Child)castingChild).childMethod();


    }
}
