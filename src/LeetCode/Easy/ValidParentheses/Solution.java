package LeetCode.Easy.ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Map<Character , Character> accordance = new HashMap<>();
        accordance.put(')' , '(');
        accordance.put(']' , '[');
        accordance.put('}' , '{');

        Stack<Character> current = new Stack<>();

        for(int i = 0; i < s.length() ; i++){
            if(accordance.containsKey(s.charAt(i))){
                if(!current.isEmpty() && current.peek() == accordance.get(s.charAt(i))){
                    current.pop();
                }
                else{
                    return false;
                }
            }
            else{
                current.add(s.charAt(i));
            }
        }

        return current.isEmpty();
    }
}
