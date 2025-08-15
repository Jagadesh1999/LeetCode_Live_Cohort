// 9. Number of sub arrays with odd prefix sum

// Given an array of integers arr, return the number of subarrays with an odd sum.
// Since the answer can be very large, return it modulo 109 + 7.

class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int currentPrefixSum = 0; int diff = 0; int res = 0;
        int oddSum = 0; int evenSum = 1;

        for(int i = 0; i < arr.length; i++) {
            currentPrefixSum += arr[i]; 

            if(currentPrefixSum % 2 == 0) {
                res = (res + oddSum) % MOD;
                evenSum++;
            } else {
                res = (res + evenSum) % MOD;
                oddSum++;
            }
        }
        return res;
    }
} // TC : O(n)
