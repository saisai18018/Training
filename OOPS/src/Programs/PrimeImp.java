package Programs;

import java.util.*;

public class PrimeImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is prime or not");
		
		int num = sc.nextInt();
		
		Prime prime = new Prime();
		
		boolean result = prime.primeimp(num);
		
		if(result) {
			
			System.out.println(num + " is a prime number");
			
		}else {
			
			System.out.println(num + "is not a prime number");
			
		}

	}

}
