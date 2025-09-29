class Solution {
    public static int power(int number, int exponent) {
        if(exponent == 0) {
            return 1; 
        }
        return number * power(number, exponent - 1); 
    }

	public int reverseExponentiation(int n) {
        int temp = n; int reverse = 0;
		
		while(n != 0) {
		    int last = n % 10;
		    reverse = (reverse * 10) + last;
		    n /= 10;
		}
		
		int result = power(temp, reverse);
		
		return result;
        
    }
} // TC : O(n), SC : O(n)
