package july5;

public class AccountMain {
    public static void main(String[] args) {
        try {
            Person p = new Person("Joe", "Blow", "1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
