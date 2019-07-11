package july10.shapes;

public class Circle implements Measurable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return  (int) (Math.PI * radius * radius);
    }
}
