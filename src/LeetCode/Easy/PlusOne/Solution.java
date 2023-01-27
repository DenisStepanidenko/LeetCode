package LeetCode.Easy.PlusOne;


public class Solution {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        } else {
            digits[digits.length - 1] = 0;
            int i = digits.length - 2;
            while (i != -1) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    i--;
                } else {
                    digits[i]++;
                    break;
                }

            }

            if (i == -1) {
                int[] answer = new int[digits.length + 1];
                answer[1] = 1;
                for (int k = 1; k < answer.length; k++) {
                    answer[k] = 0;
                }
                return answer;
            }
            else {
                return digits;
            }
        }
    }

    public static void main(String[] args) {
        int[] test = {5, 6, 2, 0, 0, 4, 6, 2, 4, 9};
        //System.out.println(Arrays.toString(plusOne(test)));
    }
}
