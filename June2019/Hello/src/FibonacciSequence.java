import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("Please enter the number of numbers to include in the sequence");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int f1 = 0;
        int f2 = 1;

        int i = 0;
        while(i < n) {
            System.out.print(f1 + " ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            i++;
        }
    }
}
