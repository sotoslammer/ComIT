package july12;

import july10.work.Account;
import july10.work.Employee;
import july10.work.Manager;

public class BankMain {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Michael", 200);
        manager.getName();
        Bank rbc = new Bank(manager);

        Employee dwight = new Employee(1, "Dwight", 10);
        dwight.getName();
        rbc.hireEmployee(dwight);

        Account dwightsAccount = new Account(1, 0, dwight);
        rbc.addAccount(dwightsAccount);

        rbc.fireEmployee(1);
    }
}
