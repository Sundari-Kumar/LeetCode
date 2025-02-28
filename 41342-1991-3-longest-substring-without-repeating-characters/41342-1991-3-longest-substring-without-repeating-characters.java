public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128]; // Stores last seen index of each character
        int i = 0, maxLength = 0; // Left pointer (i), max substring length

        for (int j = 0; j < s.length(); j++) { // j is the right pointer
            i = Math.max(lastSeen[s.charAt(j)], i); // Move left pointer if repeated character found
            maxLength = Math.max(maxLength, j - i + 1); // Update max length
            lastSeen[s.charAt(j)] = j + 1; // Store the next position of the character
        }
        return maxLength;
    }

}
