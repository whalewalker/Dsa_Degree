package com.leetCode30Day;

public class FindPivotIndex2 {
    public static int pivotIndex(int[] nums) {
        if (nums.length < 4) return 0;
        int right = nums.length - 1;
        int left = 1;
        int leftSum = nums[left - 1] + nums[left], rightSum = nums[right - 1] + nums[right];

        while (right > left) {
            if (leftSum == rightSum) return left + 1;
            if (rightSum > leftSum){
                left++;
                leftSum += nums[left];
            }else {
                right--;
                rightSum += nums[right];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 2, 2, 3, 4}));
    }
}
