package Comparator_pkg;

import java.util.*;

public class StudentImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<StudentEx> students = new ArrayList<>();
		
		students.add(new StudentEx(25,"Sai"));
		students.add(new StudentEx(24,"Anand"));
		students.add(new StudentEx(18,"Mahesh"));
		students.add(new StudentEx(49,"Ramu"));
		
		
		// First approach
		
		/*System.out.println("After sorting based on age: ");
		Collections.sort(students, new Agecomparator());
		
		for(StudentEx x:students) {
			System.out.println(x);
		}
		
		System.out.println("After sorting based on name:");
		Collections.sort(students, new NameComparator());
		
		for(StudentEx y:students) {
			System.out.println(y);
		}*/
		
		
		// Using the anonymous function
		
		System.out.println("Using the lambda anonymous function: ");
		
		Collections.sort(students, new Comparator<StudentEx>() {
			public int compare(StudentEx s1, StudentEx s2) {
				return Integer.compare(s1.getage(), s2.getage());
			}
		});
//		
		for(StudentEx sage:students) {
			System.out.println(sage.getage());
		}
		
		
		// Using the lambda function
		
		System.out.println("Using the single line lambda function: ");
		
		students.sort((s1,s2)->Integer.compare(s1.getage(),s2.getage()));
		
		// To iterate the elements of the ArrayList
		students.forEach(System.out::println);
		
		
		

	}

}
