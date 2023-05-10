package LeetCode.Medium.LongestPalindromicSubstring;

public class Solution {
    public static String longestPalindrome(String s) {
        if(s.length() == 1){
            return s;
        }
        int maxDlina = 0, currentDlina = 0;
        String answer = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            currentDlina = 1;
            int count = 1;
            if (i != s.length() - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    currentDlina++;
                    while ((i - count >= 0) && (i + count + 1) <= s.length() - 1 && s.charAt(i - count) == s.charAt(i + count + 1)) {
                        currentDlina += 2;
                        count++;
                    }
                    System.out.println(currentDlina);
                    if (currentDlina > maxDlina) {
                        maxDlina = currentDlina;
                        answer = s.substring(i - count + 1, i + count + 1);
                    }
                }
            }

            currentDlina = 1;
            count = 1;
            while ((i - count) >= 0 && (i + count) < s.length() && (s.charAt(i - count) == s.charAt(i + count))) {
                count++;
                currentDlina += 2;
            }
            if (currentDlina > maxDlina) {
                maxDlina = currentDlina;
                answer = s.substring(i - count + 1, i + count);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(longestPalindrome(s));
    }

}



