package Assessment;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;


public class EmployeeImplentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);

		/*
		 * EmployeePersonalDetails emp_personal = new EmployeePersonalDetails("Sai",
		 * "Andhra", 9390029106L, 24, "M");
		 * 
		 * EmployeeProfessionalDetails emp_professional = new
		 * EmployeeProfessionalDetails(640, "Developer", "sai@wipro.com", "Demi_Gods");
		 * 
		 * EmployeeSalaryDetails emp_salary = new EmployeeSalaryDetails(6.5d,
		 * 12478.154d, 25000d, 13015d);
		 * 
		 * EmployeeLeaveDetails emp_leaves = new EmployeeLeaveDetails(36, 14, 14, 8, 5);
		 * 
		 * EmployeeProjects_Undertaken emp_projects = new EmployeeProjects_Undertaken(1,
		 * "Security System for Banking");
		 * 
		 * while (true) {
		 * 
		 * System.out.println("Employee Menu");
		 * System.out.println("1. Display Personal Details");
		 * System.out.println("2. Display Professional Details");
		 * System.out.println("3. Display Salary Details");
		 * System.out.println("4. Display Leave Details");
		 * System.out.println("5. Display Project Details");
		 * System.out.println("6. Exit");
		 * 
		 * 
		 * System.out.print("Enter your choice: ");
		 * 
		 * int choice = sc.nextInt();
		 * 
		 * switch (choice) { case 1: emp_personal.display(); break; case 2:
		 * emp_professional.display(); break; case 3: emp_salary.display(); break; case
		 * 4: emp_leaves.display(); emp_leaves.calculate_leaves(); break; case 5:
		 * emp_projects.display(); break; case 6: System.out.println("Exiting...");
		 * sc.close(); return; default:
		 * System.out.println("Invalid choice! Try again."); } }
		 */

		Scanner sc = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<>();

		//Added employees
		
		employeeList.add(new Employee(new EmployeePersonalDetails("Sai", "Andhra", 9390029106L, 24, "M"),
				new EmployeeProfessionalDetails(1, "Developer", "sai@wipro.com", "Demi_Gods"),
				new EmployeeSalaryDetails(6.5, 12478.15, 25000, 13015), new EmployeeLeaveDetails(36, 14, 14, 8, 5),
				new EmployeeProjects_Undertaken(1, "Security System for Banking")));

		employeeList.add(new Employee(new EmployeePersonalDetails("Keerthi", "Hyderabad", 9876543210L, 25, "F"),
				new EmployeeProfessionalDetails(2, "QA", "keerthi@test.com", "Bug_Busters"),
				new EmployeeSalaryDetails(5.8, 11000, 20000, 12000), new EmployeeLeaveDetails(40, 10, 20, 10, 12),
				new EmployeeProjects_Undertaken(2, "Automated Testing Suite")));
		

		while (true) {
			System.out.println("\nMain Menu:");
			System.out.println("1. Search Employee by ID");
			System.out.println("2. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Employee ID: ");
				int searchId = sc.nextInt();
				Employee selectedEmployee = null;

				for (Employee emp : employeeList) {
					if (emp.getEmpId() == searchId) {
						selectedEmployee = emp;
						System.out.println(emp.getname() + " Found");
						break;
					}
				}

				if (selectedEmployee != null) {
					while (true) {
						System.out.println("\nEmployee Sub-Menu (ID: " + searchId + ")");
						System.out.println("1. Display Personal Details");
						System.out.println("2. Display Professional Details");
						System.out.println("3. Display Salary Details");
						System.out.println("4. Display Leave Details");
						System.out.println("5. Display Project Details");
						System.out.println("6. Back to Main Menu");

						System.out.print("Enter your choice: ");
						int subChoice = sc.nextInt();

						switch (subChoice) {
						case 1:
							selectedEmployee.getPersonal().display();
							break;
						case 2:
							selectedEmployee.getProfessional().display();
							break;
						case 3:
							selectedEmployee.getSalary().display();
							break;
						case 4:
							selectedEmployee.getLeaves().display();
							selectedEmployee.getLeaves().calculate_leaves();
							break;
						case 5:
							selectedEmployee.getProjects().display();
							break;
						case 6:
							System.out.println("Returning to Main Menu...");
							break;
						default:
							System.out.println("Invalid choice! Try again.");
						}

						if (subChoice == 6)
							break;
					}
				} else {
					System.out.println("Employee with ID " + searchId + " not found.");
				}
				break;

			case 2:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
	}

}
