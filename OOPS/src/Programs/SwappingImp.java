package Programs;

import java.util.*;

public class SwappingImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to swap ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Swapping swapping = new Swapping();
		
		swapping.swap(a, b);
		
		sc.close();
		
	}

}
