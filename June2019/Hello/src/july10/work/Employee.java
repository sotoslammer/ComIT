package july10.work;

public class Employee implements Workable {
    private int id;
    private String name;
    private int wage;

    public Employee(int id, String name, int wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    @Override
    public int work(int hours) {
        return wage * hours;
    }
}
