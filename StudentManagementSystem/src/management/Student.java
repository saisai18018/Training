package management;

import java.util.ArrayList;
import management.CourseExceptions.CourseAlreadyRegisteredException;
import management.CourseExceptions.CourseNotFoundException;

public class Student extends Person implements Registrable {
    private ArrayList<Course> courses;

    public Student(String id, String name) {
        super(id, name);
        this.courses = new ArrayList<>();
    }

    @Override
    public void registerCourse(Course course) throws CourseAlreadyRegisteredException {
        for (Course c : courses) {
            if (c.getId().equals(course.getId())) {
                throw new CourseAlreadyRegisteredException("Already registered for course: " + course.getId());
            }
        }
        courses.add(course);
        System.out.println("Registered for: " + course);
    }

    @Override
    public void dropCourse(String courseId) throws CourseNotFoundException {
        boolean removed = courses.removeIf(c -> c.getId().equals(courseId));
        if (!removed) {
            throw new CourseNotFoundException("Course not found: " + courseId);
        }
        System.out.println("Dropped course: " + courseId);
    }

    @Override
    public void listCourses() {
        System.out.println("Courses for " + name + ":");
        if (courses.isEmpty()) {
            System.out.println("No courses registered.");
        } else {
            for (Course c : courses) {
                System.out.println(" - " + c);
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name + " (ID: " + id + ")");
    }
}
