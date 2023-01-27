package LeetCode.Easy.IsSubsequence;

public class Solution {
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        else {
            int i = 0;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                    if(i == s.length()){
                        break;
                    }
                }
            }
            return i == s.length();
        }
    }

    public static void main(String[] args) {
        //isSubsequence("" , "ahbgdc");
        String s = "";
        //System.out.println(0);
    }
}
