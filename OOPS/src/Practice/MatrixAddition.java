package Practice;

import java.util.*;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        int[][] m1 = new int[2][3];
        int[][] m2 = new int[2][3];
        int[][] result = new int[2][3];

        System.out.println("Enter elements for the first 2x3 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for the second 2x3 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        
        // Addition
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        //  Result
        
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
