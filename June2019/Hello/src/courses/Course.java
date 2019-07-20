package courses;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Course {
    private final int id;
    private String name;
    private String description;
    private List<Registration> students;

    public Course(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.students = new ArrayList<>();
    }

    public void register(Student student) {
        int registrationId = new Random(1000).nextInt();
        Registration registration = new Registration(registrationId, 100);
        student.register(registration);
        students.add(registration);
    }

    public void deregister(Student student) {
        boolean removed = false;
        for(Registration registration: students) {
            if (student.isRegistered(registration)) {
                removed = students.remove(registration);
                student.drop(registration);
            }
        }

        if (!removed) {
            throw new IllegalArgumentException("Cannot drop a class you were not registered for");
        }
    }
}
