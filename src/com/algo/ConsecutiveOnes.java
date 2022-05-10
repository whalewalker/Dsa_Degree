package com.algo;

public class ConsecutiveOnes {

    public boolean solution(int[] nums) {
        boolean lastOne = false;
        int counter = 0;
        boolean end = false;

        for (int num : nums) {
            if (counter == 0 && num == 1){
                lastOne = true;
                counter++;
            }

            if (counter > 0 && num != 1){
                end = true;
            }

            if (end && num == 1){
                return false;
            }

        }
        return lastOne;

    }
}
