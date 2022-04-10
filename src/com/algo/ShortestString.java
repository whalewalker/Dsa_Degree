package com.algo;

public class ShortestString {
    public static int solution(String s) {
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0')
                count++;
            else
                count--;
        }

        return Math.abs(count);
    }


    public static void main(String[] args) {
        System.out.println(solution("1010100"));
    }
}
