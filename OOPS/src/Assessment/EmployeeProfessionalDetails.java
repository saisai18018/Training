package Assessment;

public class EmployeeProfessionalDetails {

	private int empid;
	private String email, department, team_name;
	
	
	public EmployeeProfessionalDetails(int empid, String department, String email, String team_name) {
		this.empid = empid;
		this.department = department;
		this.email = email;
		this.team_name = team_name;
	}
	
	public void display() {
        System.out.println("Emp ID: " + empid);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("Team Name: " + team_name);
    }
	
	public int getEmpId() {
	    return empid;
	}

}

