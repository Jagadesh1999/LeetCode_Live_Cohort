import java.io.*;
import java.util.*;

/*
Assume, N = 5 ( or any odd number)

    * * * * *
      * * * *
        * * *
          * *
            *
            
    Canvas size is num * num.        
    For better visualization, we shall draw the pattern once again with numberings.
    
    0 1 2 3 4
    
0   * * * * *
1     * * * *
2       * * *
3         * *
4           *
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
    }
} // TC : O(n * n), SC : O(1)

