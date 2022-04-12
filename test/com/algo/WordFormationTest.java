package com.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFormationTest {

    private WordFormation wordFormation;

    @BeforeEach
    void setUp() {
        wordFormation = new WordFormation();
    }

    @Test
    void canFindTheLongestWordInThisLetter_fanierdow_(){
        String[] words = {"the", "word", "love", "scott", "finder", "dictionary"};
        String letters = "fanierdow";
        int longestLength = wordFormation.solve(words, letters);
        assertEquals(6, longestLength);
    }

    @Test
    void canFindTheLongestWordInThisLetter_afnvlfkm_(){
        String[] words = {"credit", "nirvana", "karma", "empathy", "hang", "aaaaaaaaa"};
        String letters = "afnvlfkm";
        int longestLength = wordFormation.solve(words, letters);
        assertEquals(0, longestLength);
    }
}