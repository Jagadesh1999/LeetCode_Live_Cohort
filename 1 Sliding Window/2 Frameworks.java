// Sliding Window Framework for Dynamic sized variation 

public class Solution
{
    public static void solve(int[] nums, int k) {
        // Head, tail, datastructure for the window, ans
        int tail = 0; int head = -1; int counter = 0; int sol = 0;
        
        while(tail < nums.length) {
            while (// there is a next element to eat && we can eat) {
                head++; // Expand the window
                // Upon condition, update the the data structure 
            }
            
            // update the answer for current start

            // move start one step forward.
            if(tail > head) { // keep it same for all question, it basically help to handle empty subarray
                tail ++;
                head = tail - 1;
            } else {
                // Upon condition, update the the data structure
                tail++; // Shrink the window
            }
        }
        return sol;
    }
} // TC : O(n)
