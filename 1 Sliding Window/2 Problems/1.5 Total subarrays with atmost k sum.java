// Application of Framework 2 : 
// Problem-5 : Number of subarrays with atmost k sum
public class Solution
{
    public static int solve(int[] nums, int k) {
        int tail = 0; int head = -1; long total_subarrays = 0; long sum = 0;
        
        while(tail < nums.length) {
            while (head + 1 < nums.length && sum + nums[head + 1] <= k) {
                head++;
                sum += nums[head];
            }
            
            total_subarrays += head - tail + 1;
            
            if(tail > head) {
                tail++;
                head = tail - 1;
                sum = 0;
            }else {
                sum -= nums[tail];
                tail++;
            }
        }
        return total_subarrays;
    }
  }
}
