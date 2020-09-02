package datastructuresandalgorithms.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int getUniqueCharacterSubstring(String s) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < s.length(); end++) {
            char currChar = s.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = s.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        return output.length();
    }

    public static void main(String[] args) {
        System.out.println(getUniqueCharacterSubstring("PRASHANT"));
    }

}
