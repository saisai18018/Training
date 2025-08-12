package test.java;

import main.java.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CodingExampleTest {

	CodingExample ce = new CodingExample();

	// Reverse table test case
	@Test
	public void reversetable() {
		String expected = "50 45 40 35 30 25 20 15 10 5";
		String actual = ce.reversetable(5);
		assertEquals(expected, actual);
	}

	// alphabets test case
	@Test
	public void alphabetstest() {
		String expected = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		String actual = ce.alphabets();
		assertEquals(expected, actual);
	}

	// Printing Asciivalues
	@Test
	public void testAsciiValues() {
		String expected = "97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122";
		String actual = ce.asciivalues();
		assertEquals(expected, actual);
	}

	// Factorial
	@Test
	public void testfactorial() {
		int expected = 120;
		int actual = ce.factorial(5);
		assertEquals(expected, actual);
	}

	// Counting numbers
	@Test
	public void testCountNumbers() {
		int[] input = { 5, -3, 0, 7, -1, 0, 2 }; // 3 positives, 2 negatives, 2 zeros
		String expected = "3 2 2";
		String actual = ce.countnumbers(input);
		assertEquals(expected, actual);
	}

	// Largest and smallest
	@Test
	public void testmaxmin() {
		int[] input = { 1, 2, 3, 4, 5, 6, 8 };
		String expected = "8 1";
		String actual = ce.findminmax(input);
		assertEquals(expected, actual);
	}

	// Divisible by 9
	@Test
	public void testDivisibleBy9() {
		String expected = "108 117 126 135 144 153 162 171 180 189 198 : 1683";
		assertEquals(expected, ce.divisibleby9());
	}

//	// Ones complement
//	@Test
//	public void testOnesComplement() {
//		String expected = "0101";
//		String actual = ce.onesComplement(10);
//		assertEquals(expected, actual);
//	}
//
//	// Twos complement
//	@Test
//	public void testTwosComplement() {
//		String expected = "0110"; // 2's complement of 10
//		assertEquals(expected, ce.twosComplement(10));
//	}
	
	@Test
    public void testOnesComplement() {
        assertEquals(-6, ce.onesComplement(5)); // ~5 == -6
    }

    @Test
    public void testTwosComplement() {
        assertEquals(-5, ce.twosComplement(5)); // ~5 + 1 == -5
    }

	// Fibonacci
	@Test
	public void testFibonacciSeriesNormal() {
		String expected = "0 1 1 2 3 5 8";
		assertEquals(expected, ce.fibonacciSeries(7));
	}

}