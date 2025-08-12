package Assessment;

import java.util.*;


public class EmployeeMain {

	public static void main(String[] args) {

		ArrayList<Employeee> employeeList = new ArrayList<>();

		employeeList.add(new Employeee("Scott", 20, "NY", "E001", "HR", 63000));

		employeeList.add(new Employeee("John", 30, "India", "E002", "IT", 72000));

		employeeList.add(new Employeee("Scott", 25, "NY", "E003", "Finance", 81000));

		for (Employeee emp : employeeList) {

			emp.displayPersonalDetails();

			emp.displayProfessionalDetails();

		}

	}

}
