package com.algo.daily;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.algo.daily.ShortestPalindrome.shortestPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPalindromeTest {
    @ParameterizedTest
    @CsvSource({
            "abcde,edcbabcde",
            "abcd,dcbabcd",
            "racecar,racecar",
            "a, a",
            "bbbbbb,bbbbbb",
            "12345,543212345",
            "ab3c2d1e,e1d2c3bab3c2d1e",
            "!@#$%,%$#@!@#$%",
            "dasndsadmx, xmdasdnsadasndsadmx",
            "bubble, elbbubble"
    })
    void testShortestPalindrome(String input, String expectedOutput){
        String actualOutput = shortestPalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
     void testEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = shortestPalindrome(input);
        assertEquals(expectedOutput, actualOutput);
    }


}