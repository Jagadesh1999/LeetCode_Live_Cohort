// 4. Longest Substring Without Repeating Characters
// This problem statement directly maps to the dynamic sized sliding window template.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Initialise the head and tail
        int tail = 0; int head = -1;

        // Data structure for the window
        Map<Character, Integer> map = new HashMap<>();

        // Result variable 
        int resMax = 0;

        while(tail < s.length()) {
            // While there is a next element to eat and you can eat
            while(head + 1 < s.length() && (map.getOrDefault(s.charAt(head+1), 0) == 0)) {
                head++;
                map.put(s.charAt(head), map.getOrDefault(s.charAt(head), 0) + 1);
            }

            // Update ans for the particular valid window
            resMax = Math.max(resMax, head - tail + 1);

            if(tail > head) { // Reset tail and head for the empty window
                tail++;
                head = tail - 1;
                map.clear();
            } else {
                // Reset tail for the next iteration
                map.put(s.charAt(tail), map.get(s.charAt(tail)) - 1);
                tail++;
            }
        }
       return resMax; 
    }
} // TC : O(n)
