package Wrapper;

public class GenericEx<T> {

	private T lenght;
	private T breadth;
	private T radius;
	private T side;
	private T base;
	private T height;
	private T message;

	public void box() {
		this.lenght = null;
		this.breadth = null;
		this.radius = null;
		this.side = null;
		this.base = null;
		this.height = null;
		this.message = null;
	}

	// Rectangle
	public void set(T lenght, T breadth) {
		this.lenght = lenght;
		this.breadth = breadth;
	}

	public T getlenght() {
		return lenght;
	}

	public T getbreadth() {
		return breadth;
	}

	// Circle
	public void setradius(T radius) {
		this.radius = radius;
	}

	public T getradius() {
		return radius;
	}

	// Square
	public void setside(T side) {
		this.side = side;
	}

	public T getside() {
		return side;
	}

	// triangle
	public void set1(T base, T height) {
		this.base = base;
		this.height = height;
	}

	public T getbase() {
		return base;
	}

	public T getheight() {
		return height;
	}

	// Message

	public void setmsg(T message) {
		this.message = message;
	}

	public T getmsg() {
		return message;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Area of rectangle

		GenericEx<Integer> rectanglearea = new GenericEx<>();

		rectanglearea.set(10, 20);

		System.out.println("Rectangle Area : " + rectanglearea.getlenght() * rectanglearea.getbreadth());

		// Area of circle

		GenericEx<Double> areaofcircle = new GenericEx<>();

		areaofcircle.setradius(5.0);

		System.out.println("Area of circle : " + (Math.pow(areaofcircle.getradius(), 2) * Math.PI));

		// Perimeter of square

		GenericEx<Float> perimterofsquare = new GenericEx<>();

		perimterofsquare.setside(5f);

		System.out.println("Perimeter of square : " + (perimterofsquare.getside() * 4));

		// Area of triangle

		GenericEx<Double> areaoftriangle = new GenericEx<>();

		areaoftriangle.set1(10.0, 20.5);

		System.out.println("Area of triangle : " + (0.5 * areaoftriangle.getbase() * areaoftriangle.getheight()));

		// Printing the message

		GenericEx<String> message = new GenericEx<>();

		message.setmsg("Above are the examples of the Generic class");

		System.out.println("Message :" + message.getmsg());

	}

}
