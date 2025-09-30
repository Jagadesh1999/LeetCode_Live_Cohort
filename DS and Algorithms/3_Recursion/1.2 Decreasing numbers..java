import java.io.*;
import java.util.*;

public class Main
{
    // 1: Define the recursive function with the correct input parameters.
    public static void printDecreasing(int number) {
        // 2: Base case: when to stop
        if(number == 0) {
            return; // Exit the recursion here
        }
        
        // 3: Recursive case
        // First, print the current number n
        System.out.print(number + " "); // Print n before making the recursive call

        // Then, make a recursive call to print next smaller number (n-1)
        printDecreasing(number - 1);
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		printDecreasing(number);
	}
} // TC : O(n), SC : O(n)
