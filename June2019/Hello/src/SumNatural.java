import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        System.out.println("Please enter an integer: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
