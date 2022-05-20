package com.algo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UniqueFractionTest {

    UniqueFraction uniqueFraction;

    @BeforeEach
    void setUp() {
        uniqueFraction = new UniqueFraction();
    }

    @AfterEach
    void tearDown() {
        uniqueFraction = null;
    }

    @Test
    void shouldReturnUniqueFraction(){
        int [][] fractions = {{8, 4}, {2, 1}, {7, 3}, {14, 6}, {10, 2}, {-3, 6}};
        int [][] expected = {{-1, 2}, {2, 1}, {7, 3}, {5, 1}};
        int[][] actual = UniqueFraction.solve(fractions);
        assertArrayEquals(expected, actual);
    }
}