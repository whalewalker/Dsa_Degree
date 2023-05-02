package com.algo.daily;

public class ShortestPalindrome {
    public ShortestPalindrome() {
    }

    public static String shortestPalindromeOld(String str){
        if(isPalindrome(str))
            return str;
        else {
            int len = str.length() + (str.length() - 1);
            char[] charArr = new char[len];
            String pad =  str.substring(1);

            int count = 0;
            for (int i = pad.length() - 1; i >= 0; i--){
                charArr[count] = pad.charAt(i);
                count++;
            }

            for (int i = 0; i < str.length(); i++){
                charArr[count] = str.charAt(i);
                count++;
            }
            return new String(charArr);
        }
    }

    public static String shortestPalindrome(String s) {
        if (isPalindrome(s)) {
            return s;
        }
        String suffix = s.substring(1);
        String prefix = new StringBuilder(suffix).reverse().toString();
        return prefix + s;
    }


    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
