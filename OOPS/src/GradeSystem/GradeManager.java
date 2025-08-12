package GradeSystem;

import java.util.*;

public class GradeManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
			
			System.out.print("Enter the number of students: ");
			int numberOfStudents = sc.nextInt();
			sc.nextLine(); 

			for (int i = 0; i <= numberOfStudents; i++) {
				System.out.print("Enter student name: ");
				String name = sc.nextLine(); // now it works properly

				System.out.print("Enter " + name + "'s grade (0–100): ");
				int grade = sc.nextInt();
				sc.nextLine(); // consume newline again after grade input

				try {
					
					if (grade < 0 || grade > 100) {
						
						throw new GradeException("Grade must be between 0 and 100.");
						
					} else {
						
						System.out.println("The grade of the student named " + name + " is " + grade);
						
					}
				} catch (GradeException e) {
					
					System.out.println("Error for " + name + ": " + e.getMessage());
					
				}
			}

		} catch (Exception e) {
			
			System.out.println("An unexpected error occurred: " + e.getMessage());
			
		} finally {
			
			sc.close();
			System.out.println("Scanner closed. Program ended.");
			
		}
	}
}
