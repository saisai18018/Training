package Assessment;

public interface IEmployeeDetails {
	
	void displayPersonalDetails();

	void displayProfessionalDetails();

}

class Employeee implements IEmployeeDetails {

	// Personal details

	private String name;

	private int age;

	private String address;

	// Professional details

	private String employeeId;

	private String department;

	private double salary;

	public Employeee(String name, int age, String address,

			String employeeId, String department, double salary) {

		this.name = name;

		this.age = age;

		this.address = address;

		this.employeeId = employeeId;

		this.department = department;

		this.salary = salary;

	}

	public void displayPersonalDetails() {

		System.out.println("Personal Details:");

		System.out.println("Name    : " + name);

		System.out.println("Age     : " + age);

		System.out.println("Address : " + address);

	}

	public void displayProfessionalDetails() {

		System.out.println("Professional Details:");

		System.out.println("Employee ID : " + employeeId);

		System.out.println("Department  : " + department);

		System.out.println("Salary      : " + salary);

	}

}
