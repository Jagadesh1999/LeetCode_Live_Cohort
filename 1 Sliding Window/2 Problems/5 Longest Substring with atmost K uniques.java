// 5. Longest Substring with exactly k distinct

class Solution {
    public int longestKSubstr(String s, int k) {
        int tail = 0; int head = -1;
        
        Map<Character, Integer> map = new HashMap<>();
        int distinctCount = 0;
        
        int resMax = -1;
        
        while(tail < s.length()) {
            while(head+1 < s.length() && ((map.getOrDefault(s.charAt(head+1), 0) > 0 && distinctCount == k) || distinctCount < k)) {
                head++;
                map.put(s.charAt(head), map.getOrDefault(s.charAt(head), 0)+1);
                if(map.get(s.charAt(head)) == 1) distinctCount++;
            }
            
            if(distinctCount == k) resMax = Math.max(resMax, head - tail + 1);
            
            if(tail > head) {
                tail++;
                head = tail - 1;
                map.clear();
            } else {
                map.put(s.charAt(tail), map.get(s.charAt(tail))-1);
                if(map.get(s.charAt(tail)) == 0) {
                    distinctCount--;
                    map.remove(s.charAt(tail));
                }
                tail++;
            }
        }
        return resMax;
    }
} // TC : O(n)
            
            
