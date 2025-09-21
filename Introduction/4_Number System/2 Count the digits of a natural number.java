class Solution {
    public int countDigits(int n) {
        // Edge case :
        if(n == 0) return 1;
        
        int count = 0;
        
        while(n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
} // TC : O(digits), SC : O(1)
