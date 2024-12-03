package chap1_8.pratice.q1;

public class Main {
    public static void main(String[] args) {
        ShapeManager mgr = new ShapeManager();

        Shape Circle = new Circle(5);
        mgr.printShapeInfo(Circle);

        Shape Rectangle = new Rectangle(4, 6);
        mgr.printShapeInfo(Rectangle);
    }
}
