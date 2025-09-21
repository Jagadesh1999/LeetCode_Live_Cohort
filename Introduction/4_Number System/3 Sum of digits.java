class Solution {
    static int sumOfDigits(int n) {
        // Edge case :
        if(n == 0) return 0;
        
        int sum = 0;
        
        while(n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
        
    }
} // TC : O(digits), SC : O(1)
