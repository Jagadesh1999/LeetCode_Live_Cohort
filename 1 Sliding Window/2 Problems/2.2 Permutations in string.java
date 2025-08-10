// 12. Permutations in String - LeetCode
// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
// In other words, return true if one of s1's permutations is the substring of s2.
// Example 1:

// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0; int right = 0; // Markers

        Map<Character, Integer> need = new HashMap<>(); // Data structure
        for(char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int required = s1.length(); // Data structure

        Map<Character, Integer> window = new HashMap<>(); // Data structure

        while(right < s2.length()) {
            // Expand the window, always add the char at right
            window.put(s2.charAt(right), window.getOrDefault(s2.charAt(right), 0) + 1);

            // Remove/shrink if needed 
            if(right >= required) {
                window.put(s2.charAt(left), window.get(s2.charAt(left)) - 1); 
                if(window.get(s2.charAt(left)) == 0) {
                    window.remove(s2.charAt(left));
                }
                left++;
            }

            // Check if the window size is valid
            if(right - left + 1 == required) {
                if(need.equals(window)) { // Only update if both the maps are the same
                    return true;
                }
            }
            right++;
        }
        return false;
    }
} // TC : O(n)
