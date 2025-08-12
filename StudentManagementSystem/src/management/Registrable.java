package management;

import management.CourseExceptions.CourseAlreadyRegisteredException;
import management.CourseExceptions.CourseNotFoundException;

public interface Registrable {
    void registerCourse(Course course) throws CourseAlreadyRegisteredException;
    void dropCourse(String courseId) throws CourseNotFoundException;
    void listCourses();
}
