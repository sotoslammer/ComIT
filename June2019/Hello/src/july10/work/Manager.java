package july10.work;

import july12.Person;

public class Manager extends Person implements Workable {
    private int id;
    private int salary;

    public Manager(int id, String name, int salary) {
        super(name);
        this.id = id;
        this.salary = salary;
    }

    @Override
    public int work(int hours) {
        return salary;
    }
}
