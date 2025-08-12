package Programs;

public class MatrixAddition {

	public int[][] addingmatrix(int[][] m1, int[][] m2){
		
		int[][] result = new int[2][3];
		
		for (int i = 0; i < 2; i++) {
		    for (int j = 0; j < 3; j++) {
		        result[i][j] = m1[i][j] + m2[i][j];
		    }
		}
		
		return result;

	}
	
}
