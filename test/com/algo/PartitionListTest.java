package com.algo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionListTest {

    PartitionList partitionList;
    @BeforeEach
    void setUp() {
        partitionList = new PartitionList();
    }

    @AfterEach
    void tearDown() {
        partitionList = null;
    }

    @Test
    void whenInputWith_4821_AndConstantIs3ReturnTrue(){
        int [] nums = {4, 8, 2, 1};
        int k = 3;
        boolean result = partitionList.solve(nums, k);
        assertTrue(result);
    }
}