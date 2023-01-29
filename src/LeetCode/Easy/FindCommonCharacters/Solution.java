package LeetCode.Easy.FindCommonCharacters;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> commonChars(String[] words) {
        List<String> answer = new ArrayList<>();
        boolean flag;
        for (int i = 0; i < words[0].length(); i++) {
            String current = String.valueOf(words[0].charAt(i));
            flag = true;
            for (int j = 1; j < words.length; j++) {
                if(words[j].contains(current)){
                    words[j]  = words[j].replaceFirst(current,"");
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer.add(current);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String test = "vsdgevsdcdt";
        test = test.replaceFirst("v" , "");
        System.out.println(test);
    }
}
