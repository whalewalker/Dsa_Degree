package com.leetCode30Day;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        if(nums.length == 0) return -1;

        int n = nums.length;
        int totalsum = 0, leftsum = 0;

        for(int i : nums)
            totalsum += i;

        for(int i = 0; i < n; i++) {
            if(leftsum == (totalsum - nums[i]))
                return i;
            else {
                leftsum += nums[i];
                totalsum -= nums[i];

            }
        }

        return -1;
    }


    public static void main(String[] args) {
        pivotIndex(new int[]{2, 1, -1});

    }
}
