package Programs;

public class Prime {
	
	public boolean primeimp(int num) {
		
		if (num <= 1) {
			
            return false; 
            
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
        	
            if (num % i == 0) {
            	
                return false; 
                
            }
            
        }

        return true; 

		
	}

}
