package july10.shapes;

public class ShapesMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 10);
        RightTriangle t = new RightTriangle(20, 20);
        System.out.println(r.sameArea(r));
    }
}
