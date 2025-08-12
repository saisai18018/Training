package test.java;

import main.java.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;



public class BoxTest {
	
	Box box = new Box();
	
	@Test
    public void testCalculateCircleArea() {
        double result = box.calculateCircleArea(7);
        System.out.println(result);
        double delta2 = 0.0001;
        assertEquals(153.938, result, delta2);
    }

    @Test
    public void testCalculateTriangleArea() {
        double result = box.calculateTriangleArea(10, 5);
        System.out.println(result);
        double delta2 = 0.0001;
        assertEquals(25.0, result, delta2);
    }

    @Test
    public void testCalculateSquareArea() {
        double result = box.calculateSquareArea(4);
        System.out.println(result);
        assertEquals(16.0, result);
    }

    @Test
    public void testCalculateRectangleArea() {
        double result = box.calculateRectangleArea(4, 5);
        System.out.println(result);
        assertEquals(20.0, result);
    }

    @Test
    public void testCalculateSimpleInterest() {
        double result = box.calculateSimpleInterest(1000, 5, 2);
        System.out.println(result);
        assertEquals(100.0, result);
    }
    
    @Test
    public void testCalculateAmount() {
        double result = box.calculateAmount(1000, 5, 2);
        System.out.println(result);
        assertEquals(1202.5, result); 
    }


	
}