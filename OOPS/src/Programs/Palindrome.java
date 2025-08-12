package Programs;

public class Palindrome {
	
	public boolean IsPalindrome(String text){
		
		String reverse = new StringBuilder(text).reverse().toString();
		
		return text.equalsIgnoreCase(reverse);
		
	};
}
