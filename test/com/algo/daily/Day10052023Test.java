package com.algo.daily;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.algo.daily.Day10052023.zerosToEnd;
import static org.junit.jupiter.api.Assertions.*;

class Day10052023Test {
    @Test
     void testZerosToEnd_EmptyArray() {
        int[] arr = {};
        int[] expectedOutput = {};
        int[] actualOutput = zerosToEnd(arr);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
     void testZerosToEnd_NoZeros() {
        int[] arr = {1, 2, 3, 4};
        int[] expectedOutput = {1, 2, 3, 4};
        int[] actualOutput = zerosToEnd(arr);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
     void testZerosToEnd_AllZeros() {
        int[] arr = {0, 0, 0, 0};
        int[] expectedOutput = {0, 0, 0, 0};
        int[] actualOutput = zerosToEnd(arr);
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
     void testZerosToEnd_MixedArray() {
        int[] arr = {0, 1, 0, 1};
        int[] expectedOutput = {1, 1, 0, 0};
        int[] actualOutput = zerosToEnd(arr);
        System.out.println(Arrays.toString(actualOutput));
        assertArrayEquals(expectedOutput, actualOutput);
    }

}