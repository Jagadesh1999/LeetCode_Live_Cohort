// Application of Framework 1 :
// Problem-2 : Minimum Penalty
public class Solution
{
    public static void solve(int[] nums, int d) {
        int left = 0; int right = 0; int minimumPenalty = Integer.MAX_VALUE;
        
        Map<Integer, Integer> map = new HashMap<>();
        int countDistinct = 0;
        
        while(right < nums.length) {
            // Step 1 : Always Allow
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            if(map.get(nums[right]) == 1) countDistinct++;
            
            // Step 2 : Can we remove?
            if(right >= d) {
                map.put(nums[left], map.getOrDefault(nums[left], 0) - 1);
                if(map.get(nums[left]) == 0) countDistinct--;
                left++;
            }
            
            // Step 3 : Update if the window is d-sized
            if(right - left + 1 == d) {
                minimumPenalty = Math.min(minimumPenalty, countDistinct);
            }
            right++;
        }
        return minimumPenalty;
    }
} // TC : O(n)
    
