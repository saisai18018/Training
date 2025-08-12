package test.java;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
 
import org.junit.Test;

import main.java.Calculator;
 
public class CalculatorTest {

	Calculator calc = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(3,calc.add(1, 2));
	}

	@Test
	public void testSub() {
		assertEquals(1,calc.sub(2, 1));
	}

	@Test
	public void testMul() {
		assertEquals(1,calc.mul(1, 1));
	}

	@Test
	public void testDiv() {
		assertEquals(4,calc.div(4, 1));
	}

}

 