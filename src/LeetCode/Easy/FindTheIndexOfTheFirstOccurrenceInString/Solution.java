package LeetCode.Easy.FindTheIndexOfTheFirstOccurrenceInString;

import java.util.Arrays;

public class Solution {
    // реализуем алгоритм КМП
    public int strStr(String haystack, String needle) {
        int[] prefixFunction = prefixFunction(needle);
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = prefixFunction[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j >= needle.length()) {
                return (i - j + 1);
            }
        }
        return -1;
    }

    public int[] prefixFunction(String needle) {
        int[] prefixNum = new int[needle.length()];
        Arrays.fill(prefixNum, 0);
        for (int j = 0, i = 1; i < needle.length(); ) {
            if (needle.charAt(j) == needle.charAt(i)) {
                prefixNum[i] = j + 1;
                i++;
                j++;
            } else {
                if (j == 0) {
                    i++;
                    continue;
                } else {
                    j = prefixNum[j - 1];
                }
            }
        }
        return prefixNum;
    }
}
