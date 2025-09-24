import java.util.*;
import java.io.*;

// Wave traversal ====================================================================
public class Main {
    public static void solve(int[][] arr){
        for(int j = 0; j < arr[0].length; j++) {
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        
        int[][] arr = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        solve(arr);
    }
} // TC : O(m * n), SC : O(1)
