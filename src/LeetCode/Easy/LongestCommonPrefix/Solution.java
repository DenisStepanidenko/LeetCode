package LeetCode.Easy.LongestCommonPrefix;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        boolean flag = true; // нужен для того чтобы выйти из всего цикла
        String answer = "";
        for (int i = 0; i < strs[0].length() && flag; i++) {
            String candidates = answer + String.valueOf(strs[0].charAt(i));
            for (int j = 1; j < strs.length && flag; j++) {
                if (strs[j].startsWith(candidates)) {
                    continue;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                answer = candidates;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String[] test = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(test));
        String test1 = "fligth";

    }
}
