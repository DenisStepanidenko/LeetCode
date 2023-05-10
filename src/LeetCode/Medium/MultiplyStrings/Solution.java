package LeetCode.Medium.MultiplyStrings;

public class Solution {
    public static String multiply(String num1, String num2) {
        String answer = "0";
        int count = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuilder currentNumber = new StringBuilder();
            int current = 0;
            for (int j = num1.length() - 1; j >= 0; j--) {
                int temp = (Integer.parseInt(String.valueOf(num2.charAt(i))) * Integer.parseInt(String.valueOf(num1.charAt(j)))) + current;
                currentNumber.insert(0, temp % 10);
                current = temp / 10;
                if (j == 0 && current != 0) {
                    currentNumber.insert(0, current);
                }
            }
            currentNumber.append("0".repeat(count));
            System.out.println(currentNumber.toString());
            answer = addStrings(answer, String.valueOf(currentNumber));
            count++;
        }

        return answer;
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder answer = new StringBuilder();
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
                    if (current != 0) {
                        answer.insert(0, String.valueOf(current));
                    }
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String test = multiply("456", "123");
        System.out.println(test);
    }
}
