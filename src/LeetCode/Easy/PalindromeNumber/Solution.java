package LeetCode.Easy.PalindromeNumber;

public class Solution {
    public static boolean isPalindrome(int x) {
        String p = String.valueOf(x);
        for (int i = 0; i <= p.length() / 2; i++) {
            if (p.charAt(i) != p.charAt(p.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromOptimalSol(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertNumber = 0;
        while (x > revertNumber) {
            revertNumber = 10 * revertNumber + x % 10;
            x = x / 10;
        }

        return (x == revertNumber) || (x == revertNumber / 10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
