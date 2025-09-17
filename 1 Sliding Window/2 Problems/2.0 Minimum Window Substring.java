// 10. Minimum Window substring - LeetCode
// Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that 
// every character in t (including duplicates) is included in the window. If there is no such substring, return the 
// empty string "".

class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return ""; // Edge Case Handling

        Map<Character, Integer> targetMap = new HashMap<>();
        for(char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int required = t.length();

        int tail = 0;
        int head = -1;
        int minStart = 0;
        int minLength = Integer.MAX_VALUE;

        while(tail < s.length()) {
            while(head + 1 < s.length() && required > 0) {
                head++;
                targetMap.put(s.charAt(head), targetMap.getOrDefault(s.charAt(head), 0) - 1);
                if(targetMap.getOrDefault(s.charAt(head), 0) >= 0) required --;
            }

            if(required == 0 && head - tail + 1 < minLength) { // <-- Fix here
                minLength = head - tail + 1;
                minStart = tail;
            }

            if(tail > head) {
                tail++;
                head = tail - 1;
                targetMap.clear();
                for(char c : t.toCharArray()) {
                    targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
                }
                required = t.length();
            } else {
                targetMap.put(s.charAt(tail), targetMap.getOrDefault(s.charAt(tail), 0) + 1);
                if(targetMap.getOrDefault(s.charAt(tail), 0) > 0) {
                    required++;
                }
                tail++;
            }
        }
        if(minLength != Integer.MAX_VALUE) {
            return s.substring(minStart, minStart + minLength);
        } 
        return "";
    }
} // TC : O(n + m)
