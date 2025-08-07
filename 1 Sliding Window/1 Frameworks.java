// Sliding window framework for fixed size variation.

public class Solution
{
    public static int solve(int[] nums, int d) {
        // Declare and initialise the necessary data structures and the variables
        int left = 0; int right = 0;
        
        while(right < nums.length) {
            // Step 1 : Always Allow
            // Expand the right marker
            
            // Step 2 : Can we remove?
            if(right >= d) {
                // Shrink the left marker according to the problem statement
                left++;
            }
            
            // Step 3 : Update if the window is k-sized
            if(right - left + 1 == d) {
               // Update the ans
            }
            right++;
        }
      return // ans;
  } 
} // TC : O(n)
