package com.leetCode30Day;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        //Keep track of the most recently discovered character's index.
        int step = 0;
        for(int i = 0; i < s.length(); i++){
            boolean isSubsequence = false;
            while (step < t.length()) {
                //Check to see if the character at "i" is the same as the character at "step."
                if(s.charAt(i) == (t.charAt(step))){
                    //Change the value to confirm that the character at "i" is a subsequence.
                    isSubsequence = true;
                    step++;
                    break;
                }
                step++;
            }
            //Check to see if character is not a subsequence
            if (!isSubsequence){
               return false;
            }
        }
        return true;
    }

    public static boolean isSubsequence2(String s, String t) {
        if(!(s.trim().length() > 0 && t.trim().length() > 0)) return false;
        int count = 0;
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(count) == t.charAt(i)){
                ++count;
            }
        }
        return count == s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abe", "acdbf"));
//        System.out.println(isSubsequence2("", "ahbgdc"));
    }
}
