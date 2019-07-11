package july10.work;

public class Manager implements Workable {
    private int id;
    private String name;
    private int salary;

    public Manager(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int work(int hours) {
        return salary;
    }
}
