package Programs;

public class Swapping {

	public void swap(int a , int b) {
		
		System.out.println("Before Swap: a = " + a + ", b = " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap: a = " + a + ", b = " + b);
	}
}
