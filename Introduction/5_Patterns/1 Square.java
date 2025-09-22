/*
Framework :
-- Identify the canvas size.
-- Get clear idea on range of rows and columns as canvas size is already knowm.
-- Run loops(nested) for rows and columns according to the canvas range.
-- Use lines of equation according to the type of line. Substitute i and j values of any cell holding the value on that 
   line. Find the value of constant(c). Now, just frame back the line equation with c value alone.
-- Do not hard code c value. Use a dynamic value ( Logical relation to N ).   
-- The final obtained line equation having value of c is the condition which needs to be checked before printing any 
   cell.
*/

import java.io.*;
import java.util.*;

/*
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/
    
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
		    for(int j = 0; j < num; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		
	}
} // TC : O(n * n), SC : O(1)

