package july17;

import july10.work.Account;
import july12.Person;

public abstract class Employee extends Person {
    private int id;

    public Employee(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public abstract int work(int hours, Account account);
}
