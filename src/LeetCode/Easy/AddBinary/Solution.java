package LeetCode.Easy.AddBinary;

public class Solution {
    public static String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int a1 = 0, a2 = 0;
        int remains = 0;
        while (a1 != a.length() || a2 != b.length() || remains == 1) {
            int numberOne, numberTwo;

            if (a1 != a.length()) {
                numberOne = Integer.parseInt(String.valueOf(a.charAt(a.length() - a1 - 1)));
            } else {
                numberOne = 0;
            }
            if (a2 != b.length()) {
                numberTwo = Integer.parseInt(String.valueOf(b.charAt(b.length() - a2 - 1)));
            } else {
                numberTwo = 0;
            }

            int currentNumber = numberTwo + numberOne + remains;
            answer.insert(0 , currentNumber % 2);
            remains = currentNumber / 2;

            if (a1 != a.length()) {
                a1++;
            }
            if (a2 != b.length()) {
                a2++;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11" , "1"));

        String g = "1";
        System.out.println();
    }
}
