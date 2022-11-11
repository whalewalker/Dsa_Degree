package com.algo;

import java.util.List;

public class MinimumMoves {
    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        int moves = 0;
        for (int index = 0; index < arr1.size(); index++) {
            String value1 = String.valueOf(arr1.get(index));
            String value2 = String.valueOf(arr2.get(index));

            for (int count = 0; count < value1.length(); count++) {
                int v1 = Character.getNumericValue(value1.charAt(count));
                int v2 = Character.getNumericValue(value2.charAt(count));
                int rem = v1 - v2;
                moves += Math.abs(rem);

            }
        }
        return moves;
    }

    public static int checker(int i, int x, int count) {
        if (i < x) {
            count = x - i;
        } else if (i > x) {
            count = i - x;
        }
        return count;
    }

    public static void main(String[] args) {
        minimumMoves(List.of(123, 543), List.of(321, 279));
    }
}
