// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and 
// will come back in h hours.
// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas 
// from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas 
// during this hour. Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

// Example 1:

// Input: piles = [3,6,7,11], h = 8
// Output: 4

// Corner cases:
// 1. Size of array should not be more than h, if thats the case there is no possible answer -1
// 2. If the size of the array is equal to h, then the minimum speed will be the maximum value in the array

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Find the max range
        int max = piles[0];
        for(int i = 1; i < piles.length; i++) {
            if(max < piles[i]) {
                max = piles[i];
            }
        }

        int low = 1;
        int high = max;
        int result = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            long timeTakenToEatBananas = 0;

            // Understand the below part of implementation style
            for(int i = 0; i < piles.length; i++) {
                timeTakenToEatBananas += piles[i] / mid;
                if(piles[i] % mid != 0) {
                    timeTakenToEatBananas += 1; // As there is a residual part
                } 
            }

            if(timeTakenToEatBananas <= h) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
} 




// Input: piles = [3,6,7,11], h = 8
// K = 3, res = Ceil(3/3 + 6/3 + 7/3 + 11/3)
// 7/3 = 2
// 7/3 = 2
// 11/3 = 3

// Dry run:
// piles = [3,6,7,11], h = 8
// scan the array, find the max
// max = 11
// l=1, r=11:
// m = 6,
// res = ceil(3.0/6) + 6/6 + 7/6 + 11/6 =
// res = 1 + 1 + 2 + 2 = 6
// r = m-1 = 6-1 = 5
// l=1, r=5:
// m = 3
// res = 3/3 + 6/3 + 7/3 + 11/3
// res = 1 + 2 + 3 + 4 = 10
// res > h
// // Shift to right range
// l = m + 1 = 4
// l=4, r=5:
// m = 4
// res = 3/4 + 6/4 + 7/4 + 11/4
// res = 1 + 2 + 2 + 3 = 8
// res <= h, shift to left half to find better answer
// r = m-1, r = 3
// l > r // break the loop
// return l or (r+1)
