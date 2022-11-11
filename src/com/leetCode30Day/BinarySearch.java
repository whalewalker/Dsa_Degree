package com.leetCode30Day;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int firstIndex = 0;
        int lastIndex = nums.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (nums[middleIndex] == target)
                return middleIndex;

            else if (target > nums[middleIndex]) {
                firstIndex = middleIndex + 1;
            } else if (target < nums[middleIndex]) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
