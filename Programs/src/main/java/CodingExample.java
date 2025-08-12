package main.java;

import java.util.*;

public class CodingExample {

	Scanner sc = new Scanner(System.in);

	// 1) Reverse tables
	public String reversetable(int num) {
		String result = "";
		for (int i = 10; i >= 1; i--) {
			result += (num * i) + " ";
		}
		return result.trim();
	}

	// 2) Alphabets from a to z
	public String alphabets() {
		String result = "";
		for (int i = 97; i <= 122; i++) {
			result += (char) i + " ";
		}
		return result.trim();
	}

	// 3) Printing Ascii values
	public String asciivalues() {
		String result = "";
		for (char ch = 'a'; ch <= 'z'; ch++) {
			result += (int) ch + " ";
		}
		return result.trim();
	}

	// 4) Factorial
	public int factorial(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}

	// 5) Counting positive, negative, zeroes
	public String countnumbers(int[] arr) {
		int pos = 0, neg = 0, zero = 0;
		for (int num : arr) {
			if (num > 0)
				pos++;
			else if (num < 0)
				neg++;
			else
				zero++;
		}
		return pos + " " + neg + " " + zero;
	}

	// 6) Finding the largest and the smallest
	public String findminmax(int[] arr) {
		int min = arr[0], max = arr[0];
		for (int num : arr) {
			if (num < min)
				min = num;
			if (num > max)
				max = num;
		}
		return max + " " + min;
	}

	// 7) Divisible by 9
	public String divisibleby9() {
		StringBuilder nums = new StringBuilder();
		int sum = 0;
		for (int i = 100; i <= 200; i++) {
			if (i % 9 == 0) {
				nums.append(i).append(" ");
				sum += i;
			}
		}
		return nums.toString().trim() + " : " + sum;
	}

//	// 8) Ones complement
//	public String onesComplement(int num) {
//		String binary = Integer.toBinaryString(num);
//		String ones = "";
//
//		for (int i = 0; i < binary.length(); i++) {
//			if (binary.charAt(i) == '0') {
//				ones += "1";
//			} else {
//				ones += "0";
//			}
//		}
//
//		return ones;
//	}
//
//	// Two's complement
//	public String twosComplement(int num) {
//		String ones = onesComplement(num);
//		StringBuilder twos = new StringBuilder();
//		boolean carry = true;
//
//		// Add 1 from right to left
//		for (int i = ones.length() - 1; i >= 0; i--) {
//			char bit = ones.charAt(i);
//			if (carry) {
//				if (bit == '1') {
//					twos.append('0'); // 1 + 1 = 0, carry still 1
//				} else {
//					twos.append('1'); // 0 + 1 = 1, carry over
//					carry = false;
//				}
//			} else {
//				twos.append(bit); // Just copy remaining bits
//			}
//		}
//
//		if (carry) {
//			twos.append('1');
//		}
//
//		return twos.reverse().toString();
//	}

	// 1's complement method
    public int onesComplement(int n) {
        return ~n;
    }

    // 2's complement method
    public int twosComplement(int n) {
        return ~n + 1;
    }
	// Fibonacci series
	public String fibonacciSeries(int n) {
		if (n <= 0) {
			return "Invalid input";
		}

		StringBuilder result = new StringBuilder();
		int a = 0, b = 1;

		for (int i = 1; i <= n; i++) {
			result.append(a).append(" ");
			int next = a + b;
			a = b;
			b = next;
		}

		return result.toString().trim();
	}

	public static void main(String[] args) {

		CodingExample ce = new CodingExample();

		Scanner sc = new Scanner(System.in);

		// Reverse table
		System.out.println("Enter the number to view the revers of the table...");
		int num = sc.nextInt();
		String table = ce.reversetable(num);
		System.out.println(table);

		// alphabets from a to z
		String alphabets = ce.alphabets();
		System.out.println(alphabets);

		// Print ASCII values only
		String ascii = ce.asciivalues();
		System.out.println(ascii);

		// Factorial
		int factorial = ce.factorial(num);
		System.out.println("Factorial: " + factorial);

		// Counting numbers
		System.out.println("Enter how many numbers you want to enter");
		int n = 0;

		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter a valid number.");
			e.printStackTrace();
			return;
		}

		int[] numbers = new int[n];
		int i = 0;
		while (i < n) {
			System.out.println("Enter number " + (i + 1) + " :");
			try {
				numbers[i] = sc.nextInt();
				i++;
			} catch (Exception e) {
				System.out.println("Invalid number...");
				e.printStackTrace();
			}
		}

		String result = ce.countnumbers(numbers);
		System.out.println(result);

		// Largest and smallest
		System.out.println("Enter how many numbers you want to enter:");
		int n1 = 0;

		try {
			n1 = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Invalid input.");
			return;
		}

		int[] numbers1 = new int[n1];
		int i1 = 0;

		while (i1 < n1) {
			System.out.println("Enter number " + (i1 + 1) + " :");
			try {
				numbers1[i1] = sc.nextInt();
				i1++;
			} catch (Exception e) {
				System.out.println("Invalid number. Try again.");
				sc.next(); 
			}
		}

		String result1 = ce.findminmax(numbers1);
		System.out.println("Max Min: " + result1);

		// Divisible by 9
		String result3 = ce.divisibleby9();
		System.out.println("Sum is " + result3);

//		// Ones complement
//		int num1 = sc.nextInt();
//		String result4 = ce.onesComplement(num1);
//		System.out.println("1's Complement of " + num1 + " is: " + result4);
//
//		// twos complement
//		String result5 = ce.twosComplement(num1);
//		System.out.println("2's Complement of " + num1 + " is: " + result5);
		
		int comp = 5;

        int ones = ce.onesComplement(comp);
        int twos = ce.twosComplement(comp);

        System.out.println("1's complement of " + n + " is: " + ones);
        System.out.println("2's complement of " + n + " is: " + twos);

		// Fibonacci series

		String result6 = ce.fibonacciSeries(n);
		System.out.println("Fibonacci series of n: " + result6);

	}
}