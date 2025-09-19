// Book Allocation: We're looking for the minimum possible value for the "maximum pages a student gets." Let's call 
// this value X.

class Solution {
    public int findPages(int[] arr, int k) {
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
            
            long studentsNeeded = 1;
            long currentPages = 0;
            boolean possible = true;
            
            for(int i = 0; i < arr.length; i++) {
                if(currentPages + arr[i] > mid) {
                    studentsNeeded++;
                    currentPages = arr[i];
                    if(studentsNeeded > k) {
                        possible = false;
                        break;
                    }
                }
                else {
                    currentPages += arr[i];
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
    } // TC : O(n * log m)
}
