package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class PartitionList {
    public boolean solve(int[] nums, int k) {
        if (nums.length % 2 != 0)
            return false;

        for (int index = 0; index < nums.length; index++){
            int[] sumPosition = twoSum(nums, k);
            System.out.println(Arrays.toString(sumPosition));
            if (sumPosition.length == 0)
                return false;
            nums[sumPosition[0]] = 0;
            nums[sumPosition[1]] = 0;
            twoSum(nums, k);
        }

        return false;
    }

    public int[] twoSum(int [] arr, int target){
        Arrays.sort(arr);
        int right = arr.length - 1;
        int left = 0;

        while (left < right) {
            int result = arr[left] + arr[right] ;
            if (result % target == 0) return new int[]{left, right};
            if (result % target != 0) right--;
            else left++;
        }
        return new int[]{};
    }
}
