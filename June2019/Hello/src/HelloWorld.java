import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String text = Scanner.next();
        int num = Scanner.nextInt();
//        String line = scan.nextLine();
//        int again = scan.nextInt();
        System.out.println("You entered: " + text);
//        int integer = Integer.parseInt(line);
//        System.out.println("Please enter an int: ");
//        int integer = scan.nextInt();
        System.out.println("You entered: " + num);
    }
}