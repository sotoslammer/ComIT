import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Please enter an integer");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String result;

        if (n % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }

        System.out.println("The integer " + n + " is " + result);
    }
}
