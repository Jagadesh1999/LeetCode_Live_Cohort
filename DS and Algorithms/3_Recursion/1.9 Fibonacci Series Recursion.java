import java.io.*;
import java.util.*;
public class Main {
    public int fibonacci(int number) {
        // A. Base Case (Stops the recursion)
        if (number <= 1) {
            return number;
        }
        
        // B. & C. Recursive Step and Combination
        // Assuming fib(n-1) and fib(n-2) correctly calculate the previous values,
        // we combine them to solve the current problem F(n).
        return fibonacci(number - 1) + fibonacci(number - 2); 
    } // TC : O(2^n), SC : O(n)

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();

      fibonacci(number);
}
