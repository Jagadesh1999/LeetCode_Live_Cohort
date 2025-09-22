// Frequency of a Digit

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int digit = sc.nextInt();
		
		int result = findFrequency(num, digit);
		
		System.out.println(result);
	}
	
	public static int findFrequency(int number, int digit) {
	    int count = 0;
	    
	    while(number != 0) {
	        int lastDigit = number % 10;
	        if(lastDigit == digit) {
	            count++;
	        } 
	        number /= 10;
	    }
	    return count;
	}
} // TC : O(digits), SC : O(n)
