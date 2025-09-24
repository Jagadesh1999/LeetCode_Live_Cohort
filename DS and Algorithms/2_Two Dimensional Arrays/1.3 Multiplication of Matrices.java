// -- Multiplication of matrices can only be performed if the matrix A is of the dimension (m * n) and matrix B is of the dimension (n * p).
// -- The resultant matrix C would be of the dimension (m * p)

// Formula : C[i][j] = Summation (k = 0 to k = n−1) A[i][k] * B[k][j];

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[][] matrixA = {{1, 2}, {3, 4}};
		int[][] matrixB = {{5, 6}, {7, 8}};

		if(matrixA[0].length == matrixB[0].length) {
			System.out.println("Multiplication of matrices are not possible.");
		}
		
		int[][] result = new int[2][2];
		
		for(int i = 0; i < 2; i++) {
		    for(int j = 0; j < 2; j++) {
		        result[i][j] = 0;
		        for(int k = 0; k < 2; k++) {
		            result[i][j] += matrixA[i][k] * matrixB[k][j];
		        }
		    }
		}
		
		for(int i = 0; i < 2; i++) {
		    for(int j = 0; j < 2; j++) {
		        System.out.print(result[i][j] + " ");
		    }
		    System.out.println();
		}
	}
} // TC :  O(m * n * p), SC : O(m * p)
