package july5;

import java.text.DecimalFormat;

public class Cylinder {
    private String name;
    private float radius;
    private float height;

    public Cylinder(String name, float radius) {
        this.name = name;
        this.radius = radius;
        this.height = 0;
    }

    public Cylinder(String name, float radius, float height) {
        this.name = name;
        this.radius = radius;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double volume() {
        return area() * height;
    }

    public boolean isCircle() {
        return height == 0;
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#.##");
        String cylinderLine = isCircle()
               ? name + " is not a cylinder.  Does not Compute"
               : name + " is a cylinder.  it has a volume of " + formatter.format(volume()) + " cubic meters";
        return name + " has the following properties:\n" +
                name + "\'s area is equal to " + formatter.format(area()) + "meters squared.\n" +
                name + "\'s circumference is equal to " + formatter.format(circumference())+ "meters squared.\n" +
                cylinderLine;

    }
}
