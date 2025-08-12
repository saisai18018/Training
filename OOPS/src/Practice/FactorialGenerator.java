package Practice;

import java.util.*;

public class FactorialGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number to find the factorial: ");
	        int num = sc.nextInt();

	        int fact = 1;

	        for (int i = num; i >= 1; i--) {
	            fact *= i;
	        }

	        System.out.println("Factorial of " + num + " is: " + fact);

	        sc.close();

	}

}
