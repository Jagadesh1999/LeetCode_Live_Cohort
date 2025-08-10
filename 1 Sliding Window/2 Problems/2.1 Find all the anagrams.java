// 11. Find all the anagrams - LeetCode

// This problem maps directly to Template 1
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0; int right = 0; // Markers

        Map<Character, Integer> need = new HashMap<>(); // Data structure
        for(char c : p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int required = p.length(); // Data structure

        Map<Character, Integer> window = new HashMap<>(); // Data structure

        List<Integer> list = new ArrayList<>(); // Ans arraylist
        if(s.length() < p.length()) return list;

        while(right < s.length()) {
            // Expand the window, always add the char at right
            window.put(s.charAt(right), window.getOrDefault(s.charAt(right), 0) + 1);

            // Remove/shrink if needed 
            if(right >= required) {
                window.put(s.charAt(left), window.get(s.charAt(left)) - 1); 
                if(window.get(s.charAt(left)) == 0) {
                    window.remove(s.charAt(left));
                }
                left++;
            }

            // Check if the window size is valid
            if(right - left + 1 == required) {
                if(need.equals(window)) { // Only update if both the maps are the same
                    list.add(left); 
                }
            }
            right++;
        }
        return list;
    }
} // TC : O(n)
