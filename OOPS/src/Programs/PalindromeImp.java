package Programs;

import java.util.*;

public class PalindromeImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input to check for palindrome ");
		
		String input = sc.nextLine();
		
		Palindrome palindromeimp = new Palindrome();
		
		boolean result = palindromeimp.IsPalindrome(input);
		
		if(result) {
			
			System.out.println("The input " + input + " is palindrome ");
			
		}else {
			
			System.out.println("The input " + input + " is not palindrome");
			
		}

	}

}
