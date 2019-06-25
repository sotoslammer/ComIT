import java.util.Scanner;

public class MusicStore {
    public static void main(String[] args) {
        String[] names = {"Guitars", "Pianos", "Keyboards", "Saxophones", "Trumpets", "Drums", "Banjos", "Flute", "Tuba", "Bongos"};
        float[] price = {100, 500, 300, 350, 400, 1000, 200, 150, 1200, 175};
        int[] numBought = new int[10];

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s %s: %.2f\n", i, names[i], price[i]);
        }

        Scanner in = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please enter the id of the product to purchase");
            int id = in.nextInt();
            System.out.println("How many would you like to purchase?");
            int bought = in.nextInt();
            numBought[id] = bought;

            System.out.println("Would you like to continue shopping?");
            answer = in.next();
        } while(!answer.equals("no") && !answer.equals("n"));

        System.out.println("Product \t Price \t Number Bought \t Total\n");
        float grandTotal = 0;
        for (int i = 0; i < names.length; i++) {
            if (numBought[i] > 0) {
                float total = numBought[i] * price[i];
                System.out.printf("%s \t %s \t %s \t %.2f\n", names[i], price[i], numBought[i], total);
                grandTotal += total;
            }
        }
        System.out.printf("\t \t \t %.2f", grandTotal);
    }
}
