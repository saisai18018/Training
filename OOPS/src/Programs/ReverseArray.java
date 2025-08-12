package Programs;

public class ReverseArray {
	
	public void ReverseArrayImp(int[] arr) {
		
		System.out.println("The reversed array is ");
		
		for (int i = arr.length - 1; i >= 0; i--) {
			
	        System.out.print(arr[i] + " ");
	        
	    }
		
	}
}
