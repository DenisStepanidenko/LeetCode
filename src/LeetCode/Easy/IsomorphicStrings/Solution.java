package LeetCode.Easy.IsomorphicStrings;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static boolean isIsomorphic(String s, String t) {
        int[] sChar = new int[256];
        int[] tChar = new int[256];
        Arrays.fill(sChar, -1);
        Arrays.fill(tChar, -1);

        for (int i = 0; i < s.length(); i++) {
            int sCharAscii = (int) s.charAt(i);
            int tCharAscii = (int) t.charAt(i);

            if (sChar[sCharAscii] == -1 && tChar[tCharAscii] == -1) {
                sChar[sCharAscii] = tCharAscii;
                tChar[tCharAscii] = sCharAscii;
            }
            else if(sChar[sCharAscii] != tCharAscii || tChar[tCharAscii] != sCharAscii){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println((int) ' ');
    }
}
