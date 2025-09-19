/*
A conveyor belt has packages that must be shipped from one port to another within days days.
The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the 
conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

Example 1:

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into 
parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
*/

/*
Imagine you're running a shipping company, and you have a list of packages that need to be shipped. Each package has a 
specific weight, given by an array weights. You have a fleet of ships, and you're told you must ship all the packages within a specific number of days, say D. Each ship can carry a certain maximum weight capacity. Your goal is to find the minimum possible weight capacity a ship must have so that all packages can be delivered within D days.

Here are the key rules:

Packages must be shipped in the order they're given. You can't change the order.
Each ship can carry one or more packages, but the total weight of packages on a single ship can't exceed its maximum weight capacity.
*/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        // Edge case : 
        if (days > weights.length) {
            return -1;
        }
        
        // Finding the lowest range
        int maximum = weights[0];
        for(int i = 1; i < weights.length; i++) {
            if(weights[i] > maximum) {
                maximum = weights[i];
            }
        }
        
        // Finding the highest range
        int sum = 0;
        for(int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        
        int low = maximum;
        int high = sum;
        int result = -1;
        
        // Binary search on ans
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            long daysNeeded = 1;
            long currentWeight = 0;
            boolean possible = true;
            
            // Feasibility check
            for(int i = 0; i < weights.length; i++) {
                if(currentWeight + weights[i] > mid) {
                    daysNeeded++;
                    currentWeight = weights[i];
                    if(daysNeeded > days) {
                        possible = false;
                        break;
                    }
                } else {
                    currentWeight += weights[i];
                }
            }
            
            if(daysNeeded <= days) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
} // TC : O(n * log s)







  
