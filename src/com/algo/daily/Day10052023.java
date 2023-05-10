package com.algo.daily;

public class Day10052023 {
    public static int[] zerosToEndOld(int[] arr) {
        if (arr.length > 0) {
            int movedCount = 0;
            for (int idx = arr.length - 1; idx >= 0; idx--) {
                int swapCount = ((arr.length - 1) - idx) - movedCount;
                if (arr[idx] == 0 && swapCount > 0) {
                    int step = idx;
                    while (swapCount > 0) {
                        int temp = arr[step + 1];
                        arr[step + 1] = arr[step];
                        arr[step] = temp;
                        swapCount--;
                        step++;
                    }
                    movedCount++;
                } else if (arr[idx] == 0) {
                    movedCount++;
                }

            }
        }
        return arr;
    }

    public static int[] zerosToEnd(int[] arr) {
        int lastNonZeroIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                lastNonZeroIndex++;
                if (i != lastNonZeroIndex) {
                    int temp = arr[lastNonZeroIndex];
                    arr[lastNonZeroIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
