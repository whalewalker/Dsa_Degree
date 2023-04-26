package com.algo.daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAStringTest {

    @Test
     void testEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = ReverseAString.solution(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
     void testStringOfLengthOne() {
        String input = "a";
        String expectedOutput = "a";
        String actualOutput = ReverseAString.solution(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
     void testStringWithWhitespaceCharacters() {
        String input = "    ";
        String expectedOutput = "    ";
        String actualOutput = ReverseAString.solution(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
     void testStringWithSpecialCharacters() {
        String input = "!@#$%^&*()";
        String expectedOutput = ")(*&^%$#@!";
        String actualOutput = ReverseAString.solution(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
     void testStringWithUppercaseAndLowercaseCharacters() {
        String input = "Hello, World!";
        String expectedOutput = "!dlroW ,olleH";
        String actualOutput = ReverseAString.solution(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
     void testLongString() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus lobortis tellus vel sem faucibus, in maximus orci luctus. Fusce fringilla ligula et purus volutpat, eu tincidunt augue tristique. Sed lacinia ligula sapien, vel aliquet metus semper quis. Nulla facilisi. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Quisque ultricies dui eget sem maximus, sit amet tristique lacus auctor. Suspendisse potenti. Donec suscipit est lectus, vel rutrum sapien facilisis ac. Nam quis elit elit. Sed eget elit hendrerit, bibendum urna sit amet, consequat nibh. Quisque ultrices eget quam auctor venenatis. Pellentesque rutrum sem sit amet erat eleifend, nec dapibus lorem dignissim.";
        String expectedOutput = ".missingid merol subipad cen ,dnefiele tare tema tis mes murtur euqsetnelleP .sitanenev rotcua mauq tege secirtlu euqsiuQ .hbin tauqesnoc ,tema tis anru mudnebib ,tirerdneh tile tege deS .tile tile siuq maN .ca sisilicaf neipas murtur lev ,sutcel tse tipicsus cenoD .itnetop essidnepsuS .rotcua sucal euqitsirt tema tis ,sumixam mes tege iud seicirtlu euqsiuQ .satsege siprut ca semaf adauselam te suten te sutcenes euqitsirt ibrom tnatibah euqsetnelleP .isilicaf alluN .siuq repmes sutem teuqila lev ,neipas alugil ainical deS .euqitsirt eugua tnudicnit ue ,taptulov surup te alugil allignirf ecsuF .sutcul icro sumixam ni ,subicuaf mes lev sullet sitrobol sumaviV .tile gnicsipida rutetcesnoc ,tema tis rolod muspi meroL";
        String actualOutput = ReverseAString.solution(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testLongString2() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus lobortis tellus vel sem faucibus, in maximus orci luctus. Fusce fringilla ligula et purus volutpat, eu tincidunt augue tristique. Sed lacinia ligula sapien, vel aliquet metus semper quis. Nulla facilisi. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Quisque ultricies dui eget sem maximus, sit amet tristique lacus auctor. Suspendisse potenti. Donec suscipit est lectus, vel rutrum sapien facilisis ac. Nam quis elit elit. Sed eget elit hendrerit, bibendum urna sit amet, consequat nibh. Quisque ultrices eget quam auctor venenatis. Pellentesque rutrum sem sit amet erat eleifend, nec dapibus lorem dignissim.";
        String expectedOutput = ".missingid merol subipad cen ,dnefiele tare tema tis mes murtur euqsetnelleP .sitanenev rotcua mauq tege secirtlu euqsiuQ .hbin tauqesnoc ,tema tis anru mudnebib ,tirerdneh tile tege deS .tile tile siuq maN .ca sisilicaf neipas murtur lev ,sutcel tse tipicsus cenoD .itnetop essidnepsuS .rotcua sucal euqitsirt tema tis ,sumixam mes tege iud seicirtlu euqsiuQ .satsege siprut ca semaf adauselam te suten te sutcenes euqitsirt ibrom tnatibah euqsetnelleP .isilicaf alluN .siuq repmes sutem teuqila lev ,neipas alugil ainical deS .euqitsirt eugua tnudicnit ue ,taptulov surup te alugil allignirf ecsuF .sutcul icro sumixam ni ,subicuaf mes lev sullet sitrobol sumaviV .tile gnicsipida rutetcesnoc ,tema tis rolod muspi meroL";
        String actualOutput = ReverseAString.solution2(input);
        assertEquals(expectedOutput, actualOutput);
    }

}