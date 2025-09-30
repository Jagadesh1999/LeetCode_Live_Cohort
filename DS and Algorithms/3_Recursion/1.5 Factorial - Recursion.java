// Recursive Idea :
// fact(5) => 5 * fact(4); - 5 * 24 = 120
// fact(4) => 4 * fact(3); - 4 * 6 = 24
// fact(3) => 3 * fact(2); - 3 * 2 = 6
// fact(2) => 2 * fact(1); - 2 * 1 = 2
// fact(1) => 1 * fact(0); - 1 * 1 = 1
// fact(0) => return 1;

// Recurrence Relation : Factorial(5) - 5 * Factorial(4);

import java.io.*;
import java.util.*;

public class Main
{
    // 1: Define the recursive function with the correct input parameters.
    public static int factorial(int number) {
        // 2: Base case: when to stop
        if(number == 0) {
            return 1; // Exit the recursion here
        }
        
        // 3: Recursive case :
        return number * factorial(number - 1); // Make a choice and calling the function
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.print(factorial(number));
	}
} // TC : O(n), SC : O(n)


