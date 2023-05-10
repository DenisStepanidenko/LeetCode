package LeetCode.Medium.LongestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int[] visited = new int[256];
        Arrays.fill(visited, 0);

        int left = 0, right = 0;
        while (right < s.length()) {
            int currentRightSymbols = s.charAt(right);
            visited[currentRightSymbols]++;
            while (visited[currentRightSymbols] > 1) {
                int leftCurrentSymbols = s.charAt(left);
                visited[leftCurrentSymbols]--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String f = "tsdgsdds";
        int right = 0;
        int idx = f.charAt(right);

        System.out.println(idx);
    }
}
