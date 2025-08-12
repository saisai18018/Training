package management;

import management.CourseExceptions.CourseAlreadyRegisteredException;
import management.CourseExceptions.CourseNotFoundException;

public class Main {
    public static void main(String[] args) {
        RegistrationManager manager = new RegistrationManager();

        // Create courses
        Course java = new Course("C101", "Java Programming");
        Course python = new Course("C102", "Python Basics");
        Course db = new Course("C103", "Database Systems");

        // Add to course list
        manager.addCourse(java);
        manager.addCourse(python);
        manager.addCourse(db);

        // Create student
        Student s1 = new Student("S001", "Sai Bharath");
        manager.addStudent(s1);

        try {
            s1.registerCourse(java);
            s1.registerCourse(python);
            s1.registerCourse(java); // Duplicate — should throw exception
        } catch (CourseAlreadyRegisteredException e) {
            System.out.println("Error: " + e.getMessage());
        }

        s1.listCourses();

        try {
            s1.dropCourse("C103"); // Not registered — should throw exception
        } catch (CourseNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            s1.dropCourse("C101"); // Drop Java
        } catch (CourseNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        s1.listCourses();
    }
}

