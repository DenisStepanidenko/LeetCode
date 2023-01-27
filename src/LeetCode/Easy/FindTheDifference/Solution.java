package LeetCode.Easy.FindTheDifference;

public class Solution {
    public char findTheDifference(String s, String t) {
        String sum = s + t;
        char answer = sum.charAt(0);
        for (int i = 1; i < sum.length(); i++) {
            answer ^= sum.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "nevd";
        String p = "vdenp";
        String k = s + p;
        char answer = ' ';
        for (int i = 0; i < k.length(); i++) {
            answer ^= k.charAt(i);
        }
        System.out.println(answer);
    }
}
