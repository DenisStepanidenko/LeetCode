package LeetCode.Easy.AddStrings;

public class Solution {
    public static String addStrings(String num1, String num2) {
        StringBuilder answer = new StringBuilder("");
        String maxStr, minStr;

        if (num1.length() > num2.length()) {
            maxStr = num1;
            minStr = num2;
        } else {
            maxStr = num2;
            minStr = num1;
        }
        int j = minStr.length() - 1;
        int i = maxStr.length() - 1;
        int current = 0; // текущая прибавка
        int difference = (maxStr.length() - 1) - (minStr.length() - 1);
        while (i != -1) {
            if (j == -1) {
                while (i != -1) {
                    int tmp = Integer.parseInt(String.valueOf(maxStr.charAt(i))) + current;
                    //System.out.println((int) maxStr.charAt(i));
                    answer.insert(0, String.valueOf(tmp % 10));
                    current = tmp / 10;
                    i--;
                    if (i == -1 && current != 0) {
                        answer.insert(0, current);
                    }
                }
            } else {
                int tmp = Integer.parseInt(String.valueOf(maxStr.charAt(i))) + Integer.parseInt(String.valueOf(minStr.charAt(j))) + current;
                //System.out.println((int) maxStr.charAt(i));
                //System.out.println((int) minStr.charAt(j));
                answer.insert(0, String.valueOf(tmp % 10));
                current = tmp / 10;
                j--;
                i--;
                if (i == -1 && j == -1) {
                    if(current != 0){
                        answer.insert(0, String.valueOf(current));
                    }
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        /*
        StringBuilder answer = new StringBuilder("");
        String test = "43432";
        Character test1 = 'c';
        answer.insert(0, test1);
        answer.insert(0, test);
        System.out.println(answer.toString());

         */
        System.out.println(addStrings("0", "0"));
        String test = "23123123";
        //System.out.println( (int) test.charAt(0));
    }
}
