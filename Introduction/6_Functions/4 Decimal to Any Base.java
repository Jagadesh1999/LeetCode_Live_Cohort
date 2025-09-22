// Decimal to any base

import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int base = sc.nextInt();
		
		System.out.println(decimalToBase(number, base));
	}
	
	public static int decimalToBase(int number, int base) {
		int result = 0; int place = 1;
		
		while(number != 0) {
		    int remainder = number % base;
		    result = result + (remainder * place);
		    place *= 10;
		    number /= base;
		}
		
		return result;
	} 
} // TC : O(digits), SC : O(1)

