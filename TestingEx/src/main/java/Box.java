package main.java;

public class Box{
	
	 // 1. Area of Circle
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // 2. Area of Triangle
    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // 3. Area of Square
    public double calculateSquareArea(double side) {
        return side * side;
    }

    // 4. Area of Rectangle
    public double calculateRectangleArea(double length, double breadth) {
        return length * breadth;
    }

    // 5. Simple Interest
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
 // 6. Calculate Amount without parameters
    public double calculateAmount(double principal, double rate, double time) {
        double si = calculateSimpleInterest(principal, rate, time);
        double amount = si + principal * Math.pow((1 + rate / 100), time);
        return amount;
    }


}