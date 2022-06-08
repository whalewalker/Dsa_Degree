package com.algo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwoSum {
    private List<Integer> list;

    public TwoSum() {
        list = new ArrayList<>();
    }

    public void add(int val) {
        list.add(val);
    }

    public boolean find(int val) {
        list.sort(Comparator.naturalOrder());
        int right = list.size() - 1;
        int left = 0;

        while (left < right) {
            int result = list.get(left) + list.get(right);
            if (result == val) return true;
            if (result > val) right--;
            else left++;
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.add(5);
        twoSum.add(4);
        twoSum.add(6);

        System.out.println(twoSum.find(10));
    }
}
