package com.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveOnesTest {

    ConsecutiveOnes consecutiveOnes;

    @BeforeEach
    void setUp() {
        consecutiveOnes = new ConsecutiveOnes();
    }

    @Test
    void returnTrueWhen_011123_AsListIsCheckedToHaveAConsecutiveOnes(){
        int[] nums = {0, 1, 1, 1, 2, 3};
        boolean isConsecutiveOnes = consecutiveOnes.solution(nums);
        assertTrue(isConsecutiveOnes);
    }

    @Test
    void returnTrueWhen_121_AsListIsCheckedToHaveAConsecutiveOnes(){
        int[] nums = {1, 2, 1};
        boolean isConsecutiveOnes = consecutiveOnes.solution(nums);
        assertFalse(isConsecutiveOnes);
    }
}