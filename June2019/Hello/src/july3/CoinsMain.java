package july3;

import java.util.Scanner;

public class CoinsMain {
    public static void main(String[] args) {
        final Coin nickle = new Coin("nickle", 5);
        final Coin dime = new Coin("dime", 10);
        final Coin quarter = new Coin("quarter", 25);
        final Coin loonie = new Coin("loonie", 100);
        final Coin twoonie = new Coin("twoonie", 200);

        System.out.println("Please enter a cent value");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();

        Coin[] coins = {twoonie, loonie, quarter, dime, nickle};
        int [] values = new int[5];
        int tempValue = value;
        for (int i = 0; i < coins.length; i++) {
            Coin coin = coins[i];
            values[i] = coin.coinsNeeded(tempValue);
            if (values[i] > 0) {
                tempValue = coin.totalAfterValue(tempValue);
            }
        }
        System.out.println("hello");
    }
}
