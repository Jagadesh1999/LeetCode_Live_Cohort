// 1. The underlying fundamental math concept is the "Exponentiation by Squaring"

// The logic is based on 2 simple observations :
// -- If n is even, x^n can be expressed in terms of x^(n/2) * x^(n/2)
// -- If n is odd, x^n can be expressed in terms of x * x^(n-1)/2 * x^
// Ex : x^9 = x * x^8 = x * x^4 * x^4 (& so on)

// 2. Understanding Recursion : 
// Recursion is a programming technique where a function calls itself to solve a smaller part of the same problem. Think of it like a set of Russian nesting dolls. Each doll contains a smaller version of itself. To open the largest doll, you first have to open the next one, and then the next, until you reach the smallest one, which is the base case—the one you can't break down any further.

// 3. Here's the key to understanding recursion for any problem:

// Base Case: This is the smallest, simplest version of the problem that you know the answer to immediately. It's the "stopping condition" that prevents an infinite loop. In the Russian doll analogy, it's the smallest doll.

// Recursive Step: This is where you break down the original problem into a smaller, identical subproblem. The function calls itself with this smaller input.

// The magic of recursion lies in the fact that you don't need to worry about how the smaller problems get solved; you just trust that the recursive call will give you the correct answer. You only need to define:

// -- The base case.
// -- How to use the result of the smaller subproblem to solve the larger one.

// 3. Applying the Concepts to x^n
// Let's combine exponentiation by squaring with recursion to solve x^n

// Our recursive function myPow(x, n) will follow these steps:
// Base Case 1: If n = 0, any number to the power of 0 is 1. So, return 1.0. This is our smallest Russian doll.

// Recursive Step (Even Exponent): If n is an even number, we solve for x ^ n/2by making a recursive call: result = myPow(x, n/2). The answer is then result * result.

// Recursive Step (Odd Exponent): If n is an odd number, we solve for x ^ (n−1)/2 by making a recursive call: result = myPow(x, (n-1)/2). The answer is then x⋅result⋅result. 
// Note that (n−1)/2 is an integer division that will work correctly.

class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(n < 0) {
            N = -(N);
            x = 1/x;        
        }
        return recursivePower(x, N);
    }

    public double recursivePower(double x, long n) {
        if(n == 0) return 1.0; // Base case

        if(n % 2 == 0) {
            double result = recursivePower(x, n/2);
            return result * result;
        } else {
            double result = recursivePower(x, (n-1)/2);
            return result * result * x;
        }
    }
} // TC : O(log n)
