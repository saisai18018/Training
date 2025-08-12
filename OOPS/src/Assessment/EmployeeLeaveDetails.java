package Assessment;

public class EmployeeLeaveDetails {
	
	private int total_leaves, sick_leaves, paid_leaves, causal_leaves, leaves_used;
	
	
	public EmployeeLeaveDetails(int total_leaves, int sick_leaves, int paid_leaves, int causal_leaves, int leaves_used) {
		
		this.total_leaves = total_leaves;
		this.sick_leaves = sick_leaves;
		this.paid_leaves = paid_leaves;
		this.causal_leaves = causal_leaves;
		this.leaves_used = leaves_used;
	}
	
	public void display() {
        System.out.println("Total Leaves: " + total_leaves);
        System.out.println("Sick Leaves: " + sick_leaves);
        System.out.println("Paid Leaves: " + paid_leaves);
        System.out.println("Casual Leaves: " + causal_leaves);
    }

	public void calculate_leaves() {
		
		if (leaves_used != 0) {
			
			int remaining = total_leaves - leaves_used;
			
			System.out.println(leaves_used + " leaves have been used.");
			System.out.println("Remaining leaves: " + remaining);
		} else {
			
			System.out.println("No leaves are used. Good employee so far!");
			
		}
		
	}
	
}

