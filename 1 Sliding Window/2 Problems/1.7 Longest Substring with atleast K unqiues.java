// 7. Longest Substring with atleast k distinct

class Solution {
    public int longestKSubstr(String s, int k) {
        int tail = 0; 
        int head = -1;
        
        Map<Character, Integer> map = new HashMap<>();
        int distinctCount = 0;
        
        int resMax = -1;
        
        int n = s.length();
        
        while (tail < n) {
            // Expand right while allowed (always can expand, no upper bound!)
            while (head + 1 < n) {
                head++;
                map.put(s.charAt(head), map.getOrDefault(s.charAt(head), 0) + 1);
                if (map.get(s.charAt(head)) == 1) distinctCount++;
                
                // Once we already have ≥ k distinct, we can stop expanding further
                // because now res can be updated directly from tail.
                if (distinctCount >= k) break;
            }
            
            if (distinctCount >= k) {
                // from current tail, longest valid substring is till end
                resMax = Math.max(resMax, n - tail);
            }
            
            if (tail > head) {
                tail++;
                head = tail - 1;
                map.clear();
                distinctCount = 0;
            } else {
                map.put(s.charAt(tail), map.get(s.charAt(tail)) - 1);
                if (map.get(s.charAt(tail)) == 0) {
                    distinctCount--;
                }
                tail++;
            }
        }
        
        return resMax;
    }
}
// TC : O(n)
