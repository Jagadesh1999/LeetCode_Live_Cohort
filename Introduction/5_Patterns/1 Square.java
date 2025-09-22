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
		Scanner scn = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
		    for(int j = 0; j < num; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		
	}
} // TC : O(n * n), SC : O(1)

