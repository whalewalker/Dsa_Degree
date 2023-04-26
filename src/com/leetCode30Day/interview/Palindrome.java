package com.leetCode30Day.interview;

public class Palindrome {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = findPalindrome(s, i, i);
            String s2 = findPalindrome(s, i, i + 1);
            String currentLongestPalindrome = s1.length() > s2.length() ? s1 : s2;
            if (currentLongestPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = currentLongestPalindrome;
            }
        }
        return longestPalindrome;
    }

    private static String findPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("abdbba"));
    }
}
