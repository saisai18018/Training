package ExceptionHandling;

public class ThrowEx {
	
	public static void checkAge(int age) {
		
		if(age < 18) {
			
			throw new IllegalArgumentException("You are not eligible for the access..");
			
		}else {
			
			System.out.println("You are eligible and access is granted...");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			checkAge(19);
			
		}catch(IllegalArgumentException e) {
			
			System.out.println("Exception occured.. "+ e.getMessage());
			
		}
		
		System.out.println("Program continues irrespective of the error");
		
	}

}
