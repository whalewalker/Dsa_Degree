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
     *
     * @ Approach : Brute Force
     */
    public static int solution(String [] words, String letters){
        //Todo: Get All occurrence in int array
        int[] letterArr = new int[26];
        for (int i = 0; i < letters.length(); i++){
            letterArr[letters.charAt(i) - 'a']++;
        }
        //Todo: initialize longest length
        int longestLen = 0;
        //Todo: Iterate through word in words list
        for (String word : words) {
            //Todo: initialize match
            boolean match = true;
            //Todo: Get All occurrence of each word in int array
            int[] wordArr = new int[26];
            for (int i = 0; i < word.length(); i++){
                wordArr[word.charAt(i) - 'a']++;
            }
            //Todo: Check if each word can be found in  letters
            for (int index = 0; index < 26; index++){
                if (wordArr[index] > letterArr[index]){
                    match = false;
                    break;
                }
            }
            //Todo: If true, get the length
            if (match){
                longestLen = Math.max(longestLen, word.length());
            }
            //Todo: if not Move to the next word
        }
        return longestLen;


    }


    public static void main(String[] args) {
        System.out.println(solution(new String[]{"the", "word", "love", "scott", "finder", "dictionary"}, "ffanierdow"));
    }
}
