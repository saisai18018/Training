package PCK;

public class Emp {
	private int id;
	private String name;
	private String Department;
	private double salary;
	
	public Emp() {}
	
	
	public Emp(int id, String name, String Department, double salary) {
        this.id = id;
        this.name = name;
        this.Department = Department;
        this.salary = salary;
    }
	
    // Getters
    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public String getDepartment() {
        return Department;
    }

    public double getsalary() {
        return salary;
    }

    // Setters
    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }
    
 // Overridden toString() method
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Department=" + Department + ", Salary=" + salary + "]";
    }
}





