package LeetCode.Easy.LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int answer = 0;
        while (s.charAt(i) == ' ') {
            i--;
            if (i == -1) {
                return 0;
            }
        }
        while (s.charAt(i) != ' ') {
            answer++;
            i--;
            if (i == -1) {
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Character.isLetter('a'));
    }
}
