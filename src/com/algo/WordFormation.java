package com.algo;

import java.util.Arrays;

public class WordFormation {
    /**
     * Given a list of strings words and a string letters, return the length of
     * longest string in words that can be made from letters in letters. If no word can be made, return 0.
     *
     * Note that you can't reuse letters.
     *
     * Constraints
     *
     * n ≤ 10,000 where n is the length of words
     * m ≤ 1,000 where m is the length of letters
     * Example 1
     * Input: words = ["the", "word", "love", "scott", "finder", "dictionary"]
     * letters = "fanierdow"
     * Output: 6
     * Explanation: We can make the word finder out of our letters, which has the longest length of 6.
     *
     * Example 2
     * Input: words = ["credit", "nirvana", "karma", "empathy", "hang", "aaaaaaaaa"]
     * letters = "afnvlfkm"
     * Output: 0
     * Explanation: We can't make any of these words with the letters we have.
     */


    /**
     * @ Approach : Brute Force
     */
    public static int solution(String[] words, String letters) {

        int[] letterArr = new int[26];
        for (int i = 0; i < letters.length(); i++) {
            letterArr[letters.charAt(i) - 'a']++;
        }

        int longestLen = 0;

        for (String word : words) {

            boolean match = true;

            int[] wordArr = new int[26];
            for (int i = 0; i < word.length(); i++) {
                wordArr[word.charAt(i) - 'a']++;
            }

            for (int index = 0; index < 26; index++) {
                if (wordArr[index] > letterArr[index]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                longestLen = Math.max(longestLen, word.length());
            }

        }
        return longestLen;


    }


    /**
     * @ Approach : Brute Force
     */
    public int solve(String[] words, String letters) {
        int[] lengths = new int[words.length];
        int count = 0;
        int index = 0;
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                boolean match = false;
                for (int i = 0; i < letters.length(); i++) {
                    System.out.println(word.charAt(j) + " -> " + letters.charAt(i));
                    if (word.charAt(j) == letters.charAt(i)) {
                        match = true;
                        break;
                    }
                }
                if (match) {
                    count++;
                } else {
                    count = 0;
                    break;
                }
            }
            if (count == word.length()) {
                lengths[index] = word.length();
                count = 0;
            }
            index++;
        }
        return Arrays.stream(lengths).max().getAsInt();
    }


    public static void main(String[] args) {
        System.out.println(solution(new String[]{"the", "word", "love", "scott", "finder", "dictionary"}, "ffanierdow"));
    }
}
