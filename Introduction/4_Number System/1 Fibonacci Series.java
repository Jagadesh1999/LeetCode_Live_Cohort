class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int[] fibonacciSeries = new int[n];
        
        if (n >= 1) fibonacciSeries[0] = 0;
        if (n >= 2) fibonacciSeries[1] = 1;
    
        int a = 0, b = 1;
        
        for(int i = 2; i < n; i++) {
            int sum = a + b;
            fibonacciSeries[i] = sum;
            a = b;
            b = sum;
        }
        
        return fibonacciSeries;
    }
} // TC : O(n), SC : O(n)
