class Solution {
    public String[] divideString(String s, int k, char fill) {
        // If the length of s is not a multiple of k, pad s with fill so that it becomes a multiple of k
        int reminder = s.length() % k;
        if (reminder != 0) {
            int paddingNeeded = k - reminder;
            // Create a char array of length paddingNeeded filled with fill character
            char[] fillChars = new char[paddingNeeded];
            Arrays.fill(fillChars, fill);
            // Append the fill characters to s
            s += new String(fillChars);
        }

        int numGroups = s.length() / k;
        String[] result = new String[numGroups];

        // Extract each group of size k
        for (int i = 0; i < numGroups; i++) {
            result[i] = s.substring(i * k, i * k + k);
        }

        return result;
    }
}
// TC : O(n)
