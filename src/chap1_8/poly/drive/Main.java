package chap1_8.poly.drive;

public class Main {
    public static void main(String[] args) {
        Sonata sonata1 = new Sonata();
        Sonata sonata2 = new Sonata();
        Car sonata3 = new Sonata();
//
//        sonata1.accelerate();
//        sonata2.accelerate();
//        sonata3.accelerate();

        // 쏘나타를 배열에 저장
        //Sonata[] sonataList = { sonata1, sonata2, sonata3 };
        //for(Sonata s : sonataList){
        //    s.accelerate();

        Tuscon tuscon1 = new Tuscon();
        Car tuscon2 = new Tuscon();

        //Tuscon [] tusconList = { tuscon1, tuscon2 };

        Car tesla1 = new Tesla();
        Tesla tesla2 = new Tesla();
        Car tesla3 = new Tesla();
        Car tesla4 = new Tesla();

        //Tesla[] teslaList = { tesla1, tesla2, tesla3, tesla4};
        // 다형성을 통해 동종모음 구조배열을
        // 이종모음 형태로 구현할 수 있다.

        Car[] carList ={sonata1, tuscon1, tesla2, sonata2};

        for (Car car : carList) {
            car.accelerate();
        }


        System.out.println("====================");

        Driver kim = new Driver();
        kim.drive(tesla4);

        System.out.println("====================");

        CarShop shop = new CarShop();
        Car car = shop.exportCar(3000);
        car.accelerate();

        System.out.println("===================");

        kim.drive(shop.exportCar(6000));
        //김씨 아저씨가 돈이 6000인 테슬라로 달린다.

        System.out.println("=============");


//      필요할때만 부모확장자를 쓰고 필요하지 않을때에는 굳이 부모확장자를 사용하면
//      자식에서만 활용되는 것을 사용할 수 없다

        Car mySonata = new Sonata();
        mySonata.accelerate();
//      mySonata.joinSonataClub(); -> 부모확장자로 인해 사용불가능

        Sonata mySonata1 = new Sonata();
        mySonata1.accelerate();
        mySonata1.joinSonataClub();

        // Car에만 정의되어있는 exportCar를 사용하기위해서는 (Sonata)를 사용해서 다운캐스해서 객체타입을 변환시켜주어야 한다.
        Sonata boughtCar = (Sonata) shop.exportCar(3000);
        boughtCar.accelerate();
        boughtCar.joinSonataClub();






    }
}
