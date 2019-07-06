package july5;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Rectangle {
    private String name;
    private float length;
    private float width;
    private float height;

    public Rectangle(String name, float length, float width) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = 0;
    }

    public Rectangle(String name, float length, float width, float height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length * 2) + (width * 2);
    }

    public double volume() {
        return area() * height;
    }

    public boolean isRectangle() {
        return height == 0;
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#.##");
        String rectangleLine = isRectangle()
                              ? name + " is not a cube.  Does not Compute"
                              : name + " is a cube.  it has a volume of " + formatter.format(volume()) + " cubic meters";
        return name + " has the following properties:\n" +
                name + "\'s area is equal to " + formatter.format(area()) + "meters squared.\n" +
                name + "\'s perimeter is equal to " + formatter.format(perimeter()) + "meters.\n" +
                rectangleLine;
    }
}
