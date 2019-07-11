package july10;

public class ITry {
    public static void main(String[] args) {
        int result = divide(1, 0);
    }

    public static int divide(int numerator, int denominator) {
        try {
            return numerator / denominator;
        } catch(Exception e) {
            throw new IllegalArgumentException("divide by zero, No bueno");
        }
    }
}
