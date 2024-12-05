package chap2_2.lang;

class Pen extends Object{
    long serial; // 일련번호
    String color; // 색상
    int price; // 가격

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    // Alt + insert toString 고르면 자동으로 완성
//    @Override
//    public String toString() {
//        return "Pen{" +
//                "serial=" + serial +
//                ", color='" + color + '\'' +
//                ", price=" + price +
//                '}';
//    }

    // Object 클래스의 toString을 오버라이딩
    // 객체의 주소값은 사실 궁금하지 않다.
    @Override
    public String toString() {
        return String.format("serial: %d, color: %s, price: %d", serial, color, price);
    }

    // equals 를 통해 모든 필드 값이 같으면 두 객체를 같은 객체로 인식시키기
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Pen target = (Pen) o;
        if (this.serial == target.serial
        && this.price == target.price
        && this.color.equals(target.color)
        ){
            return true;
        }
        else{
            return false;
        }
    }
}

public class ObjectSample {
    public static void main(String[] args) {

        Pen yellowPen = new Pen(100L,"노랑",1000);
        Pen bluePen = new Pen(200L,"파랑",1200);
        Pen bluePen2 = new Pen(200L,"파랑",1200);

        System.out.println("yellowPen = "+ yellowPen.toString());
        System.out.println("bluePen = "+ bluePen.toString());

        System.out.println("두 펜이 같은가? "+bluePen.equals(bluePen2));
    }

}
