// Recurrence relation : Power(10, 5) - 10 * Power(10, 4)

import java.io.*;
import java.util.*;

public class Main
{
    public static long power(int number, int exponent) {
        if(exponent == 0) {
            return 1; 
        }
        return number * power(number, exponent - 1); 
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int exponent = sc.nextInt();
		
		long result = (power(number, exponent));
		
		System.out.println(result);
	}
} // TC : O(n), SC : O(n)
