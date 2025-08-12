package Programs;

import java.util.*;

public class AddingImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the arrays to add ");
		
		int[][] arr = new int[2][3];
		
		int[][] arr1 = new int[2][3];
		
		System.out.println("Enter elements for the first 2x3 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for the second 2x3 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        MatrixAddition matrixadding = new MatrixAddition();
        int[][] result = matrixadding.addingmatrix(arr, arr1);

        System.out.println("The resulting matrix is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

	}

}
