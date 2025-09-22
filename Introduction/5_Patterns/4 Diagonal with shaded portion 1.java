import java.io.*;
import java.util.*;

/*
    Assume, N = 5 ( or any odd number)
    
            *
          * *
        * * *
      * * * *
    * * * * *
    
    Canvas size is num * num.        
    For better visualization, we shall draw the pattern once again with numberings.
    
    0 1 2 3 4
    
0           *
1         * *
2       * * *
3     * * * *
4   * * * * *
    
   Now, got clear idea on loops range for rows and columns.
   
   For this type of line -> equation is i + j = c. Substituting i and j values of any line cell holding the value, we get,
   2 + 2 = c;
   c = 4;
   
   Dynamic c value in relation to input number. ( c = number - 1)
   Frameback the equation with only c value and not i and j--> i + j = number - 1; 
   
   But, in this problem, we are not printing stars only on the line, but every cell after cells of line in the canvas.
   
   Take any cell holding the value except the line cells to get the correct condition.
   Lets take, (4,3) -> i = 4, j = 3, c = n-1, that is, 3, so the condition becomes i + j >= number - 1
   */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(i + j >= num - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }
    }
}
