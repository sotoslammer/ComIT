package july5;

public class Account {
    private int number;
    private int balance;
    private Person owner;

    public Account() {
        this.number = 0;
        this.balance = 0;
    }

    public Account(int number, int balance, Person owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void transaction(int amount, Transaction type) throws Exception {
        if(type == Transaction.WITHDRAW) {
            withdraw(amount);
        } else {
            deposit(amount);
        }
    }

    private void deposit(int amount) {
        balance += amount;
    }

    private void withdraw(int amount) throws Exception {
        int newBalance = balance - amount;
        if (newBalance < 0) {
            throw new Exception("get outta here!");
        } else {
            balance = newBalance;
        }
    }
}
