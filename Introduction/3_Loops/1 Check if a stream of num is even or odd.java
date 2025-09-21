// 1 Check if a stream of numbers is odd or even

import java.io.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    while(n != 0) {
	        int number = sc.nextInt();
	        if(number % 2 == 0) {
	            System.out.println("The number " + number + " is even");
	        } else {
	            System.out.println("The number " + number + " is odd");
	        }
	        n--;
	    }
	}
} // TC : O(n), SC : O(1)

