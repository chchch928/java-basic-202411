package chap1_3;

public class Rectangle {
    // 속성
    int width;
    int height;
    int area;
    int perimeter;

    // 기능
    void calculateArea() {
        area = width * height;
        System.out.println("area = " + area);
    }
    void calculatePerimeter() {
        perimeter = width*2 + height*2;
        System.out.println("perimeter = " + perimeter);
    }
    Rectangle(int userwidth, int userheight) {
        width = userwidth;
        height = userheight;

    }
}
