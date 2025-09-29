import java.io.*;
import java.util.*;

public class Main
{
    // 1: Define the recursive function with the correct input parameters.
    public static void printIncreasing(int currentNumber, int number) {
        // 2: Base case: when to stop
        if(currentNumber == number + 1) {
            return; // Exit the recursion here
        }
        
        // 3: Recursive case
        // First, print the current number n
        System.out.print(currentNumber + " "); // Print n before making the recursive call

        // Then, make a recursive call to print next smaller number (n-1)
        printIncreasing(currentNumber+1, number);
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		printIncreasing(1, number);
	}
} // TC : O(n), SC : O(n)
