package chap1_8.pratice.q1;

public class ShapeManager {
    public void printShapeInfo(Shape shape) {
        double area = shape.area();
        double perimeter = shape.perimeter();
        System.out.println("면적:" +shape.area());
        System.out.println("둘레:" +shape.perimeter());

    }
}
