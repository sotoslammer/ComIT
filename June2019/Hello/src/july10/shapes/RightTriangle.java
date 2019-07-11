package july10.shapes;

public class RightTriangle implements Measurable {
    private int base;
    private int height;

    public RightTriangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int area() {
        return base * height / 2;
    }
}
