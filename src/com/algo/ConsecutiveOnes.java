package com.algo;

public class ConsecutiveOnes {
    /**
     * Intuition
     * Let first and last variables respectively represent the first and last index where a 1 appears.
     * Let counter represent the number of 1's in the array.
     *The only way for all ones to appear consecutively between [first,last] is for last-first + 1 == counter.
     *  Thus, the problem can be solved by simply calculating these 3 values with one iteration.
     * @param nums
     * @return boolean
     */

    public boolean solution(int[] nums) {
        int first = -1;
        int last = -1;
        int counter = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 1){
               if (first == -1) first = index;
               last = index;
               counter++;
            }

        }
        return last - first + 1 == counter;

    }
}
