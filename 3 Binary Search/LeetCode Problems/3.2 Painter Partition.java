/*
Input: arr[] = [5, 10, 30, 20, 15], k = 3
Output: 35
Explanation: The most optimal way will be: Painter 1 allocation : [5,10], Painter 2 allocation : [30], Painter 3 
allocation : [20, 15], Job will be done when all painters finish i.e. at time = max(5 + 10, 30, 20 + 15) = 35

Input: arr[] = [10, 20, 30, 40], k = 2
Output: 60
Explanation: The most optimal way to paint: Painter 1 allocation : [10, 20, 30], Painter 2 allocation : [40], 
Job will be complete at time = 60 
*/

class Solution {
    public int minTime(int[] arr, int k) {
        // Edge case : 
        if (k > arr.length) {
            return -1;
        }
        
        // Finding the lowest range
        int maximum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        
        // Finding the highest range
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        int low = maximum;
        int high = sum;
        int result = -1;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            long paintersNeeded = 1;
            long currentLength = 0;
            boolean possible = true;
            
            for(int i = 0; i < arr.length; i++) {
                if(currentLength + arr[i] > mid) {
                    paintersNeeded++;
                    currentLength = arr[i];
                    if(paintersNeeded > k) {
                        possible = false;
                        break;
                    }
                }
                else {
                    currentLength += arr[i];
                }
            }
            
            if(possible) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;  
    }
} // TC : O(n * log m)
