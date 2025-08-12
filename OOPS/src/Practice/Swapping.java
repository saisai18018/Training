package Practice;

import java.util.*;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers to swap:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a = " + a + ", b = " + b);

        sc.close();
	}

}
