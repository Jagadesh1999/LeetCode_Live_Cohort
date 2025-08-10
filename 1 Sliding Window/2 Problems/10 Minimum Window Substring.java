// 1.9 Minimum Window substring - LeetCode
// Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that 
// every character in t (including duplicates) is included in the window. If there is no such substring, return the 
// empty string "".

class Solution {
    public String minWindow(String s, String t) {
        // Windows Data structure
        Map<Character, Integer> need = new HashMap();
        for(char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int required = t.length(); // number of characters still needed.

        // Markers and the necessary variables
        int tail = 0; int head = -1; int min_start = 0; int min_length = Integer.MAX_VALUE;

        while(tail < s.length()) {
            while(head + 1 < s.length() && required > 0) { 
                head++;
                if(need.getOrDefault(s.charAt(head),0) > 0) {
                    required--;
                }
                need.put(s.charAt(head), need.getOrDefault(s.charAt(head), 0) - 1);
            }

            if(required == 0) {
                if(min_length > head - tail + 1) {
                min_start = tail;
                min_length = head - tail + 1;
                }
            }

            if(tail > head) {
                tail++;
                head = tail - 1;
                need.clear();
                required = t.length();
            }else{
                need.put(s.charAt(tail), need.get(s.charAt(tail)) + 1);
                if(need.get(s.charAt(tail)) > 0) {
                    required++;
                }
                tail++;
            }
        }
        if(min_length == Integer.MAX_VALUE) return "";
        else return s.substring(min_start, min_start + min_length);
    }
} // TC : O(n)
