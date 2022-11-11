package com.leetCode30Day;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        Map<Character, Integer> palindromeCount = new HashMap<>();
        for (Character c : s.toCharArray())
            palindromeCount.put(c, palindromeCount.getOrDefault(c, 0) + 1);

        int result = 0;
        boolean oddFound = false;
        for (int count : palindromeCount.values()){
            if (count % 2 == 0)
                result += count;
            else {
                oddFound = true;
                result += count - 1;
            }
        };
        return oddFound ? ++result : result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
