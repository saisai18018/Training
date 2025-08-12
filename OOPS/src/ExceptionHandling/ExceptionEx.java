package ExceptionHandling;

import java.util.*;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numerator, denominator, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numerator: ");
		
		numerator = sc.nextInt();
		
		System.out.println("Enter the denominator");
		
		denominator = sc.nextInt();
		
		try {
			
			result = numerator / denominator;
			
			System.out.println("Result is " + result);
			
		}catch(ArithmeticException ae) { // Exception is the main class with object e
			
			System.out.println("Can not divide by zero....");
			
			ae.printStackTrace();
			
		}finally {
			
			result = numerator / denominator;
			
			System.out.println("Result is " + result);
			
			System.out.println("Finally always executes no matter what");
		};
		
	}

}
