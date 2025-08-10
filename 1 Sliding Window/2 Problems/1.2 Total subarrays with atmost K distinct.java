// Application of Framework 2 : 
// Problem-2 : No. of subarrays with atmost k distinct elements
public class Solution
{   
    public static int atmostKDistinct(int[] nums, int k) {
        int tail = 0; int head = -1;
        
        Map<Integer, Integer> map = new HashMap<>();
        int countDistinct = 0;
        
        int total_subarrays = 0;
        
        while(tail < nums.length) {
            while(head+1 < nums.length && (map.getOrDefault(nums[head+1], 0) >= 1 || countDistinct < k)) {
                head++;
                map.put(nums[head], map.getOrDefault(nums[head], 0) + 1);
                if(map.get(nums[head]) == 1) countDistinct++;
            }
            
            total_subarrays += head - tail + 1;
            
            if(tail > head) {
                tail ++;
                head = tail - 1;
				map.clear();
                distinctCount = 0;  // Reset state as window is empty
            } else {
                map.put(nums[tail], map.getOrDefault(nums[tail], 0) - 1);
                if(map.get(nums[tail]) == 0) countDistinct--;
                tail++;
            }
        }
        return total_subarrays;
    }
} // TC : O(n)
    
	
           
            
