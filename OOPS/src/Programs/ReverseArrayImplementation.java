package Programs;

import java.util.*;

public class ReverseArrayImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array ");
		
		int size = sc.nextInt();		
		
		int arr[] = new int[size];
		
		for (int i = 0; i < size; i++) {
			
            arr[i] = sc.nextInt();
            
        }
		
		
		ReverseArray reversearray = new ReverseArray();
		
		reversearray.ReverseArrayImp(arr);
		
		sc.close();
		
		
		
	}

}
