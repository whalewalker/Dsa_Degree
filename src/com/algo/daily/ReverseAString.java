package com.algo.daily;

public class ReverseAString {
    public static String solution2(String str){
        StringBuilder reverseStr = new StringBuilder();
        for (int i =  str.length() - 1; i >= 0; i--){
            reverseStr.append(str.charAt(i));
        }
        return reverseStr.toString();
    }

    public static String solution(String str){
        char[] charArr = str.toCharArray();
        int left = 0;
        int right = charArr.length - 1;

        while (left < right){
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return new String(charArr);
    }
}
