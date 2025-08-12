// 3. Sliding Window Maximum - LeetCode

// You are given an array of integers nums, there is a sliding window of size k which is moving from the very left 
// of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves 
// right by one position. Return the max sliding window.

// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0; int right = 0;
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        while(right < nums.length) {
            // Step 1 : Always allow the element inside the deque
            while(!deque.isEmpty() && (nums[deque.peekLast()] < nums[right])) {
                deque.pollLast();
            }
            deque.offerLast(right);

            // Step 2 : Can we remove?
            if(right >= k) {
                if(deque.peekFirst() == left) {
                    deque.pollFirst();
                }
                left++;
            }

            // Update the ans if the window is k-sized
            if(right - left + 1 == k) {
                list.add(nums[deque.peekFirst()]);
            }
            right++;
        }
        // Convert the list to array
        int[] ans = new int[list.size()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
} // TC : O(n), SC : 2 * O(n - k + 1) -> O(n - k + 1)
