// Spiral Matrix

import java.io.*;
import java.util.*;

/*
The framework for remembering which boundary to update after each of the four loops is simple: update the boundary you just finished printing.

Loop 1: Print Top Row : 
-- After printing the top row, you'll never need to visit it again. So, you increase the starting row index to move the boundary down.
-- k++

Loop 2: Print Right Column : 
-- After printing the rightmost column, you're done with it. You decrease the ending column index to move the boundary left.
-- last_column--

Loop 3: Print Bottom Row : 
-- After printing the bottom row, you can shrink the matrix from the bottom. You decrease the ending row index to move the boundary up.
-- last_row--

Loop 4: Print Left Column : 
-- After printing the leftmost column, you can shrink the matrix from the left. You increase the starting column index to move the boundary right.
-- l++

This pattern—increase start, decrease end, decrease end, increase start—mirrors the spiral motion and ensures you correctly shrink the boundaries inward.
*/

public class Main
{
    public static void printSpiralMatrix(int[][] arr) {
        int k = 0; 
        int l = 0;
        int last_row = arr.length - 1;
        int last_column = arr[0].length - 1;
        
        while(k <= last_row && l <= last_column) {
            for(int i = l; i <= last_column; i++) {
                System.out.print(arr[k][i] + " ");
            } // Printing the first  row
            k++;
            
            for(int i = k; i <= last_row; i++) {
                System.out.print(arr[i][last_column] + " ");
            } // Printing the last column
            last_column--;
            
            if(k <= last_row) {
                for(int i = last_column; i >= l; i--) {
                    System.out.print(arr[last_row][i] + " ");
                }
                last_row--;
            }
            
            if(l <= last_column) {
                for(int i = last_row; i >= k; i--) {
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }
        }
    } // TC : O(R * C), SC : O(1)
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int[][] arr = new int[row][column];
		for(int i = 0; i < row; i++) {
		    for(int j = 0; j < column; j++) {
		        arr[i][j] = sc.nextInt();
		    }
		}
		
		printSpiralMatrix(arr);
	}
}

