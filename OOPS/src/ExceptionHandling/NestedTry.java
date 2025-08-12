package ExceptionHandling;

import java.util.*;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {100, 20};
		
		try {
			
			System.out.println("Outer try block");
			
		
		try{
			
			int result = numbers[0] / numbers[1];
			
		}catch(ArithmeticException ae) {
			
			System.out.println("Inner try catch: cannot divide by zero....");
			
		}
		
		int value = numbers[2];
		
		System.out.println("Value :" + value);
		
		}catch(ArrayIndexOutOfBoundsException  e) {
			
			System.out.println("Index out of range...");
			
		}finally {
			
			System.out.println("Example of outer/inner block");
			
		}
	}

}
