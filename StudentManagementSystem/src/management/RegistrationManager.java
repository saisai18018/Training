package management;

import java.util.ArrayList;

public class RegistrationManager {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public RegistrationManager() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Student findStudentById(String studentId) {
        for (Student s : students) {
            if (s.getId().equals(studentId)) return s;
        }
        return null;
    }

    public Course findCourseById(String courseId) {
        for (Course c : courses) {
            if (c.getId().equals(courseId)) return c;
        }
        return null;
    }
}
