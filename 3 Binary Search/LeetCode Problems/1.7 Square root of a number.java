// 7. Square root of a number - LeetCode
// Note : This problem needs to be transformed in such a way that it needs to be 1 1 1 . . . 1 0 0 . . . 0 0 
// Finding the index of the last occurence of 1 is the answer

class Solution {
    private static int check(int mid, int x) {
        if((long) mid * mid <= x) return 1;
        else return 0;
    }

    public int mySqrt(int x) {
        int low = 0; int high = x; int res = 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(check(mid, x) == 0) {
                high = mid - 1;
            } else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
} // TC : O(log2(n))
