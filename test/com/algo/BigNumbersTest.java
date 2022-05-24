package com.algo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigNumbersTest {
    BigNumbers bigNumbers;

    @BeforeEach
    void setUp() {
        bigNumbers = new BigNumbers();
    }

    @AfterEach
    void tearDown() {
        bigNumbers = null;
    }

    @Test
    void getTheLargestNumberInRowAndColumOf2DArrayOfSize3(){
        int [][] _2DArray = {{1, 3, 2}, {6, 6, 5}, {1, 5, 7}};
        int expected = 3;
        int actual = bigNumbers.solve(_2DArray);
        assertEquals(expected, actual);
    }

    @Test
    void getTheLargestNumberInRowAndColumOf2DArrayOfSize1(){
        int [][] _2DArray = {{1, 3, 2}};
        int expected = 1;
        int actual = bigNumbers.solve(_2DArray);
        assertEquals(expected, actual);
    }

    @Test
    void getTheLargestNumberInRowAndColumOf2DArrayOfSize1AndLength2(){
        int [][] _2DArray = {{2, 2}};
        int expected = 2;
        int actual = bigNumbers.solve(_2DArray);
        assertEquals(expected, actual);
    }


    @Test
    void getTheLargestNumberInRowAndColumOf2DArrayOfSize1AndLength1(){
        int [][] _2DArray = {{2}};
        int expected = 1;
        int actual = bigNumbers.solve(_2DArray);
        assertEquals(expected, actual);
    }
}