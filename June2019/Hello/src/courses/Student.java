package courses;

import java.util.ArrayList;
import java.util.List;

public class Student extends Academic {
    private List<Registration> courses;

    public Student(int id) {
        super(id);
        this.courses = new ArrayList<>();
    }

    public void register(Registration registration) {
        courses.add(registration);
    }

    public void drop(Registration registration) {
        courses.remove(registration);
    }

    public boolean isRegistered(Registration registration) {
        return courses.contains(registration);
    }

    public int average() {
        int total = 0;
        for(Registration course: courses) {
            total += course.getGrade();
        }

        return total / courses.size();
    }

    public List<Registration> getCourses() {
        return courses;
    }
}
