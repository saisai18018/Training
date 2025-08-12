package Assessment;

public class Employee {
	private EmployeePersonalDetails personal;
	private EmployeeProfessionalDetails professional;
	private EmployeeSalaryDetails salary;
	private EmployeeLeaveDetails leaves;
	private EmployeeProjects_Undertaken projects;

	public Employee(EmployeePersonalDetails personal, EmployeeProfessionalDetails professional, EmployeeSalaryDetails salary, EmployeeLeaveDetails leaves, EmployeeProjects_Undertaken projects) {
		this.personal = personal;
		this.professional = professional;
		this.salary = salary;
		this.leaves = leaves;
		this.projects = projects;
	}

	public int getEmpId() {
		return professional.getEmpId();
	}
	
	public String getname() {
		return personal.getname();
	}

	public EmployeePersonalDetails getPersonal() {
		return personal;
	}

	public EmployeeProfessionalDetails getProfessional() {
		return professional;
	}

	public EmployeeSalaryDetails getSalary() {
		return salary;
	}

	public EmployeeLeaveDetails getLeaves() {
		return leaves;
	}

	public EmployeeProjects_Undertaken getProjects() {
		return projects;
	}
}
