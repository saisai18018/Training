package Assessment;

public class EmployeeProjects_Undertaken {

	private int projects_taken;
	private String project_name;
	
	public EmployeeProjects_Undertaken(int projects_taken, String project_name) {
		
		this.projects_taken = projects_taken;
		this.project_name = project_name;
		
	}
	
	public void display() {
        System.out.println("Projects Taken: " + projects_taken);
        System.out.println("Project Name: " + project_name);
    }
}

