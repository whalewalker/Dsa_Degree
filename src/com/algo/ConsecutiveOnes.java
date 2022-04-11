package com.algo;

public class ConsecutiveOnes {

    public boolean solution(int[] nums) {
       boolean isConsecutiveOnes = false;
        for (int num : nums){
            if (num == 1) {
                isConsecutiveOnes = true;
            }else if ((num > 1 || num < 0) && isConsecutiveOnes){
                break;
            }
        }
        return isConsecutiveOnes;
    }
}
