package com.algo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HitCounterTest {

    HitCounterInitializer hitCounterInitializer;

    @BeforeEach
    void setup(){
        hitCounterInitializer = new HitCounterInitializer();
    }

    @Test
    void canConstructAHitCounter(){
        int[][] actions = new int[][]{{}};
        String[] methods = hitCounterInitializer.methods(actions);
        assertEquals(1, methods.length);
        assertEquals("constructor", methods[0]);
    }

}