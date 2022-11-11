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

    public static void main(String[] args) {
//        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("aaaaaa", "bbaaaa"));
    }
}
