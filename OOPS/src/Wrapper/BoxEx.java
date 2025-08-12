package Wrapper;

public class BoxEx<T> {
	
	private T value;
	
	public void set(T value) {
		
		this.value = value;
		
	}
	
	public T get() {
		
		return value;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Area of rectangle
		
		BoxEx<Integer> lenght = new BoxEx<>();
		lenght.set(15);
		
		BoxEx<Integer> breadth = new BoxEx<>();
		breadth.set(15);
		
		int RectangleArea = lenght.get() * breadth.get();
		
		System.out.println("Rectangle Area : " + RectangleArea);
		
		
		// Area of Circle
		
		BoxEx<Double> radius = new BoxEx<>();
		radius.set(15.2);
		
		double Area_of_circle = ( radius.get() * 2 )* Math.PI;
		
		System.out.println("Area of circle : " + Area_of_circle);
		
		
		
		// Perimeter of Square
		
		BoxEx<Float> side = new BoxEx<>();
		side.set(15.2f);
		
		double Perimeter_of_square =  side.get() * 4 ;
		
		System.out.println("Perimeter of square : " + Perimeter_of_square);
		
		
		
		// Area of triangle
		
		BoxEx<Double> base = new BoxEx<>();
		base.set(15.5);
		
		BoxEx<Double> height = new BoxEx<>();
		height.set(10.5);
		
		double Area_of_triangle = 0.5 * base.get() * height.get();
		
		System.out.println("Area of triangle : " + Area_of_triangle);
		
		
		// String
		
		BoxEx<String> message = new BoxEx<>();
		message.set("Above the the complete examples of Generic class using String class.");
		
		System.out.println("Message :" + message.get());
		
	}

}
