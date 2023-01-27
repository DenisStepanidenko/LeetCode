package LeetCode.Easy.HappyNumber;

import java.util.ArrayList;

public class Solution {
    public boolean isHappy(int n) {
        int m = n;
        ArrayList<Integer> numbers = new ArrayList<>();
        int i;
        while (true) {
            i = 0;
            while (m > 0) {
                i += Math.pow(m % 10, 2);
                m /= 10;
            }
            if (i == 1) {
                return true;
            } else if (numbers.contains(i)) {
                return false;
            } else {
                numbers.add(i);
                m = i;
            }

        }
    }

    public static void main(String[] args) {

    }
}
