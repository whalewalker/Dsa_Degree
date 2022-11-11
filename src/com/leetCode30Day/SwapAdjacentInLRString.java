package com.leetCode30Day;

import java.util.HashMap;
import java.util.Map;

public class SwapAdjacentInLRString {
    public static boolean canTransform(String start, String end) {
        if (!start.replace("X", "").equals(end.replace("X", ""))) return false;
        if (start.length() > end.length() || end.length() > start.length()) return false;

        Map<Character, Integer> starCharacter = new HashMap<>();
        Map<Character, Integer> endCharacter = new HashMap<>();

        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'L') {
                starCharacter.put(start.charAt(i), starCharacter.getOrDefault(start.charAt(i), 0) + i);
            }
            if (start.charAt(i) == 'R') {
                starCharacter.put(start.charAt(i), starCharacter.getOrDefault(start.charAt(i), 0) + i);
            }

            if (end.charAt(i) == 'L') {
                endCharacter.put(end.charAt(i), endCharacter.getOrDefault(end.charAt(i), 0) + i);
            }
            if (end.charAt(i) == 'R') {
                endCharacter.put(end.charAt(i), endCharacter.getOrDefault(end.charAt(i), 0) + i);
            }
        }
        if (starCharacter.get('L') != null && endCharacter.get('L') > starCharacter.get('L')) return false;

        if (endCharacter.get('R') != null && endCharacter.get('R') < starCharacter.get('R')) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canTransform("XXXXXLXXXLXXXX", "XXLXXXXXXXXLXX"));
    }

    //
//        ArrayList<Integer> lstart = new ArrayList<>(start.length() / 2);
//        ArrayList<Integer> lend = new ArrayList<>(start.length() / 2);
//        ArrayList<Integer> rstart = new ArrayList<>(start.length() / 2);
//        ArrayList<Integer> rend = new ArrayList<>(start.length() / 2);
//
//        for (int i = 0; i < start.length(); i++){
//            if (start.charAt(i) == 'L') lstart.add(i);
//            if (start.charAt(i) == 'R') rstart.add(i);
//        }
//
//        for (int i = 0; i < end.length(); i++){
//            if (end.charAt(i) == 'L') lend.add(i);
//            if (end.charAt(i) == 'R') rend.add(i);
//        }
//
//        int count = 0;
//
//        while (count < lstart.size() && count < lend.size()){
//            if (lend.get(count) > lstart.get(count)) return false;
//            count++;
//        }
//
//        count = 0;
//        while (count < rstart.size() && count < rend.size()){
//            if (rend.get(count) < rstart.get(count)) return false;
//            count++;
//        }

}
