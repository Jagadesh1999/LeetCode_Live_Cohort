// Number of ways to choose r things from n items

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		long nCr = solve(n, r);
		
		System.out.println(nCr);
	}
	
	public static int solve(int n, int r) {
	    return factorial(n) / (factorial(r) * factorial(n-r));
	     
	}
	
	public static int factorial(int x) {
	    int fact = 1;
	    
	    for(int i = 2; i <= x; i++) {
	        fact *= i;
	    }
	    
	    return fact;
	}
} // TC : O(n)
