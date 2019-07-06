package july5;

public class GeometryMain {
    public static void main(String[] args) {
        final int         length         = 5;
        Cylinder[]  cylinders  = new Cylinder[length];
        Rectangle[] rectangles = new Rectangle[length];

        cylinders[0] = new Cylinder("Man Hole", 1.5f);
        cylinders[4] = new Cylinder("Tower of Pisa", 15.6f, 57.0f);

        rectangles[0] = new Rectangle("Taylor Field", 110.0f, 30.5f);
        rectangles[1] = new Rectangle("Madison Square Garden", 200.0f, 200.0f, 50.0f);

        for (int i = 0; i < length; i++) {
            if(cylinders[i] != null)  {
                System.out.println(cylinders[i].toString());
            }
            if(rectangles[i] != null) {
                System.out.println(rectangles[i].toString());
            }
        }
    }
}
