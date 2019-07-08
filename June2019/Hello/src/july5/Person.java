package july5;

public class Person {
    private String first;
    private String last;
    private String phone;

    public Person(String first, String last, String Phone) throws Exception {
        this.first = first;
        this.last = last;
        if (this.checkPhone(Phone)) {
            this.phone = Phone;
        } else {
            throw new Exception("Invalid phone number");
        }
    }

    public boolean checkPhone(String phone) {
        return phone.length() == 9;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getPhone() {
        return phone;
    }
}
