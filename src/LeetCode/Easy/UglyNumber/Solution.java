package LeetCode.Easy.UglyNumber;

public class Solution {
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        } else {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                    if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {

                        return false;
                    }
                    int m = n / i;
                    if (m % 2 != 0 && m % 3 != 0 && m % 5 != 0) {

                        return false;
                    }
                }
            }
            return count != 0 || (n == 5) || (n == 3) || (n == 2) || (n == 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(isUgly(4));
    }
}
