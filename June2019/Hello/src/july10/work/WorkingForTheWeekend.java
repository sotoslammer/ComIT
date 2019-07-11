package july10.work;

public class WorkingForTheWeekend {
    public static void main(String[] args) {
        Employee john = new Employee(1, "John Wick", 15);
        Manager lawrence = new Manager(0, "Lawrence", 100);

        Account johnsAccount = new Account(1, 0, john);
        Account lawrencesAccount = new Account(2, 0, lawrence);

        int earned = john.work(8);
        int lEarned = lawrence.work(10);
        try {
            johnsAccount.transaction(earned);
            lawrencesAccount.transaction(lEarned);
        } catch( Exception e) {
            System.out.println("don't steal his money!");
        }

        System.out.println(johnsAccount.getBalance());
        System.out.println(lawrencesAccount.getBalance());
    }
}
