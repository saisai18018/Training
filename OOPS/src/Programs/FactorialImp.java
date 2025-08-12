package Programs;

import java.util.*;

public class FactorialImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find the factorial ");
		
		int num = sc.nextInt();
		
		Factorial factorial = new Factorial();
		
		int result = factorial.factorial(num);
		
		System.out.println("Factorial of " + num + " is: " + result);
		
		sc.close();

	}

}
