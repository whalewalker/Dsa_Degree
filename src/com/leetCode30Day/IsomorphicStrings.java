package com.leetCode30Day;

import java.util.*;

import static java.lang.String.format;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Integer, Integer> sMap = new HashMap<>(s.length());
        Map<Integer, Integer> tMap = new HashMap<>(t.length());


        for (int i = 0; i < s.length(); i++) {
            Integer sVal = sMap.put((int) s.charAt(i), i);
            Integer tVal = tMap.put((int) t.charAt(i), i);
            if (!(Objects.equals(sVal, tVal))) {
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        System.out.println(isIsomorphic(
                "app", "egg"
        ));
    }
}
