package Practice;

import java.util.*;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input to check for palindrome:");

        String text = sc.nextLine();

       
        String reverse = new StringBuilder(text).reverse().toString();

     
        if (text.equalsIgnoreCase(reverse)) {
            System.out.println("The input " + text + " is a palindrome.");
        } else {
            System.out.println("The input " + text + " is not a palindrome.");
        }

        sc.close();  // Close

	}

}
