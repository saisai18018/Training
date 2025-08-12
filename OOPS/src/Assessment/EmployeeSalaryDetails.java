package Assessment;

public class EmployeeSalaryDetails {
	
	private double lpa, basic_salary, bonus, allowance;
	
	public EmployeeSalaryDetails(double lpa, double basic_salary, double bonuc, double allowance) {
		this.lpa = lpa;
		this.allowance = allowance;
		this.basic_salary = basic_salary;
		this.bonus = bonus;
	}
	
	public void display() {
        System.out.println("LPA: " + lpa);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Salary is :" + (basic_salary + bonus + allowance));
    }

}


