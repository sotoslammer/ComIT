package july12;

import july10.work.Account;
import july10.work.Employee;
import july10.work.Manager;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private Manager manager;
    private List<Employee> employees;
    private List<Account> accounts;

    public Bank(Manager manager) {
        this.manager = manager;
        this.employees = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void fireEmployee(int employeeId) {
        for (Employee e: employees) {
            if (e.getId() == employeeId) {
                employees.remove(e);
            }
        }
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(int accountNumber) {
        for(Account a: accounts) {
            if (a.getNumber() == accountNumber) {
                accounts.remove(a);
            }
        }
//        accounts.stream()
//                .filter(a -> a.getNumber() == accountNumber)
//                .findFirst()
//                .ifPresent(a -> accounts.remove(a));
    }
}
