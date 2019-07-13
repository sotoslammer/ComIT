package july10.work;

import july12.Person;

public class Employee extends Person implements Workable {
    private int id;
    private int wage;

    public Employee(int id, String name, int wage) {
        super(name);
        this.id = id;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    @Override
    public int work(int hours) {
        return wage * hours;
    }
}
