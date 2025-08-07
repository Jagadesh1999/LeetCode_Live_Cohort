// Application of Framework 2 : 
// Problem-2 : No. of subarrays with atleast k distinct elements
public class Solution
{
    public static void atleastKDistinct(int[] nums, int k) {
        System.out.println((nums.length * (nums.length + 1) / 2) -  (atmostKDistinct(nums, k - 1)));
    }
    
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
            } else {
                map.put(nums[tail], map.getOrDefault(nums[tail], 0) - 1);
                if(map.get(nums[tail]) == 0) countDistinct--;
                tail++;
            }
        }
        return total_subarrays;
    }
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        while(testcases != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
            atleastKDistinct(nums, k);
            testcases--;
        }
    }
}
