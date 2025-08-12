package Programs;

import java.util.*;

public class GreatestNumberImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers to find the greatest ");
		
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++) {
			
            arr[i] = sc.nextInt();
            
        }
		
		Greatest greatest = new Greatest();
		
		int result = greatest.Greatestnum(arr);
		
		System.out.println("The greatest number is " + result);
		
		sc.close();
		
		
		
		
	}

}
