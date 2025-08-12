package main.java;

import java.util.*;

public class StringExample {

	Scanner sc = new Scanner(System.in);

	// Concatenation
	public String concatenate(String s1, String s2) {
		return s1 + s2;
	}

	// Replace
	public String removeSpaces(String input) {
		return input.replaceAll(" ", "");
	}

	// couting
	public String countCharacters(String input) {
		int alpha = 0, digit = 0, specialch = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (Character.isLetter(ch)) {
				alpha++;
			} else if (Character.isDigit(ch)) {
				digit++;
			} else {
				specialch++;
			}
		}

		return "Alphabets: " + alpha + ", Digits: " + digit + ", Special characters: " + specialch;
	}

	public char maxChar(String input) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		char maxChar = ' ';
		int maxCount = 0;

		for (char ch : map.keySet()) {
			int count = map.get(ch);
			if (count > maxCount) {
				maxCount = count;
				maxChar = ch;
			}
		}

		return maxChar;
	}
	
	// replace first vowel
	public String replaceFirstVowel(String input) {
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (vowels.indexOf(ch) != -1) {
                return input.substring(0, i) + '-' + input.substring(i + 1);
            }
        }

        return input; // No vowel found
    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StringExample se = new StringExample();

		// Concatenation
		System.out.print("Enter first string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter second string: ");
		String s2 = sc.nextLine();
		String result1 = se.concatenate(s1, s2);
		System.out.println("Concatenated: " + result1);

		// Removing spaces
		String s3 = "hello java welcome to wipro";
		String s4 = se.removeSpaces(s3);
		System.out.println("Removed spaces: " + s4);

		// Counting characters
		String s5 = "hello 124world !@#$%";
		String result = se.countCharacters(s5);
		System.out.println(result);
		
		
		// High frequency char
		String s6 = "helloooooo";
		char result2 = se.maxChar(s6);
		System.out.println("Max occured character is :"+ result2);
		
		//Replace first vowel
		String s7 = "bhrdfalk";
		String result3 = se.replaceFirstVowel(s7);
		System.out.println("Replace fist vowel is :"+ result3);
		

	}

}
