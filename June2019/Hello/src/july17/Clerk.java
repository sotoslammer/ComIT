package july17;

import july10.work.Account;

public class Clerk extends Employee {
    private int wage;

    public Clerk(String name, int id, int wage) {
        super(name, id);
        this.wage = wage;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public int work(int hours, Account account) {
        int earned = wage * hours;
        try {
            account.transaction(earned);
        } catch (Exception e) {
            System.out.println("error depositing account here is some cash");
        }
        return earned;
    }
}
