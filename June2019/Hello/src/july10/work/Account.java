package july10.work;

public class Account {
    private int number;
    private int balance;
    private Workable owner;

    public Account(int number, int balance, Workable owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    public void transaction(int amount) throws Exception {
        int result = balance + amount;
        if (result >= 0) {
            balance = result;
        } else {
            throw new Exception("Cannot withdraw below 0");
        }
    }

    public int getBalance() {
        return balance;
    }
}
