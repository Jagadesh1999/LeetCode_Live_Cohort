class Solution {
    public int reverseDigits(int n) {
        // Edge Case :
        if(n == 0) return 0;
        
        int reverse = 0;
        
        while(n != 0) {
            int lastDigit = n % 10;
            reverse =  (reverse * 10) + lastDigit;
            n = n / 10;
        }
        
        return reverse;
    }
} // TC : O(digits), SC : O(1)
