// 

public class Solution
{
    public static void solve(int[] nums, int k) {
        int tail = 0; int head = -1; int counter = 0; int sol = 0;
        
        while(tail < nums.length) {
            while(head+1 < nums.length && (nums[head+1] == 1 || counter < k)) {
                head++;
                if(nums[head] == 0) counter++;
            }
            
            sol = Math.max(sol, head - tail + 1);
            
            if(tail > head) {
                tail ++;
                head = tail - 1;
            } else {
                if(nums[tail] == 0) counter--;
                tail++;
            }
        }
        return sol;
    }
} // TC : O(n)

