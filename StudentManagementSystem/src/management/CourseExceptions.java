package management;

//Define both exceptions in the same file

public class CourseExceptions {

	// Exception for already registered course
	public static class CourseAlreadyRegisteredException extends Exception {
		public CourseAlreadyRegisteredException(String message) {
			super(message);
		}
	}

	// Exception for course not found when dropping
	public static class CourseNotFoundException extends Exception {
		public CourseNotFoundException(String message) {
			super(message);
		}
	}
}
