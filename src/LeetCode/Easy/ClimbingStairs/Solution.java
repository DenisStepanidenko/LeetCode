package LeetCode.Easy.ClimbingStairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static Map<Integer, Integer> test = new HashMap<>();

    public static int climbStairs(int n) {
        if (n == 2) {
            return 2;
        }
        if (n == 1) {
            return 1;
        } else {
            if (test.containsKey(n)) {
                return test.get(n);
            } else {
                int count = climbStairs(n - 1) + climbStairs(n - 2);
                test.put(n, count);
                return count;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }

}

