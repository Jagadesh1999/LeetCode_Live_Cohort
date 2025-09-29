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
		
		int temp = number; int reverse = 0;
		
		while(number != 0) {
		    int last = number % 10;
		    reverse = (reverse * 10) + last;
		    number /= 10;
		}
		
		long result = power(temp, reverse);
		
		System.out.println(result);
	}
} // TC : O(n), SC : O(n)
