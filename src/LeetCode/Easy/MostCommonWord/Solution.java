package LeetCode.Easy.MostCommonWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> words = new HashMap<>();
        String current = "";
        for (int i = 0; i < paragraph.length(); i++) {
            if (Character.isLetter(paragraph.charAt(i))) {
                current = current + paragraph.charAt(i);
            } else {
                if (current.length() != 0) {
                    if(!Arrays.asList(banned).contains(current)) {
                        current = current.toLowerCase();
                        if (words.containsKey(current)) {
                            words.put(current, words.get(current) + 1);
                        }
                        else {
                            words.put(current, 1);
                        }
                        current = "";
                    }
                    else{
                        current = "";
                    }
                }
            }
        }
        if(current.length() != 0){
            current = current.toLowerCase();
            if (words.containsKey(current)) {
                words.put(current, words.get(current) + 1);
            }
            else {
                words.put(current, 1);
            }
        }
        String answer = "";
        int largest = 0;
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if(entry.getValue() > largest){
                largest = entry.getValue();
                answer = entry.getKey();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        test.add("s");
        test.add("s");
        System.out.println(test.toString());
    }
}
