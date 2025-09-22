// Convert any base to decimal

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int base = sc.nextInt();
		
		System.out.println(baseToDecimal(number, base));
	}
	
	public static int baseToDecimal(int number, int base) {
		int result = 0; int power = 1;
		
		while(number != 0) {
		    int remainder = number % 10;
		    result = result + (remainder * power);
		    power *= base;
		    number /= 10;
		}
		
		return result;
	} 
} // TC : O(digits), SC : O(1)
