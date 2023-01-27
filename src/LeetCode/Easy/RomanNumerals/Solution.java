package LeetCode.Easy.RomanNumerals;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        Map<String, Integer> numerals = new HashMap<>();
        numerals.put("I", 1);
        numerals.put("V", 5);
        numerals.put("X", 10);
        numerals.put("L", 50);
        numerals.put("C", 100);
        numerals.put("D", 500);
        numerals.put("M", 1000);
        numerals.put("IV", 4);
        numerals.put("IX", 9);
        numerals.put("XL", 40);
        numerals.put("XC", 90);
        numerals.put("CD", 400);
        numerals.put("CM", 900);

        int answer = 0;
        boolean Flag = true;
        int i = 0;
        while (i <= s.length() - 2) {
            String p = new StringBuilder().append(s.charAt(i)).append(s.charAt(i+1)).toString();
            if (numerals.containsKey(p)) {
                answer = answer + numerals.get(p);
                if (i == s.length() - 2) {
                    Flag = false;
                    break;
                } else {
                    i = i + 2;
                }
            } else {
                answer = answer + numerals.get(String.valueOf(s.charAt(i)));
                i++;
            }
        }
        if(Flag){
            answer = answer + numerals.get(String.valueOf(s.charAt(s.length()-1)));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
