package com.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordMachineTest {
    WordMachine wordMachine;

    @BeforeEach
    void setUp() {
        wordMachine = new WordMachine();
    }

    @Test
    void canAddElementIntoStack(){
        String[] ops = {"1", "2", "3"};
        wordMachine.solutionTwo(ops);
        assertEquals( 3, wordMachine.getStack().size());
        assertEquals(3, wordMachine.getStack().peek());
    }

    @Test
    void canDuplicateTopElementInStack(){
        String[] ops = {"1", "2", "3", "DUP"};
        wordMachine.solutionTwo(ops);
        assertEquals( 4, wordMachine.getStack().size());
        assertEquals(3, wordMachine.getStack().peek());
    }

    @Test
    void returnMinusOneWhenOperationIsDuplicateAndStackIsEmpty(){
        String[] ops = {"DUP"};
        assertEquals( 0, wordMachine.getStack().size());
        assertEquals(-1, wordMachine.solutionTwo(ops));
    }

    @Test
    void returnMinusOneWhenOperationIsMinusAndStackIsEmpty(){
        String[] ops = {"-"};
        assertEquals( 0, wordMachine.getStack().size());
        assertEquals(-1, wordMachine.solutionTwo(ops));
    }

    @Test
    void returnMinusOneWhenOperationIsPlusAndStackIsEmpty(){
        String[] ops = {"+"};
        assertEquals( 0, wordMachine.getStack().size());
        assertEquals(-1, wordMachine.solutionTwo(ops));
    }

    @Test
    void returnMinusOneWhenOperationIsPopAndStackIsEmpty(){
        String[] ops = {"POP"};
        assertEquals( 0, wordMachine.getStack().size());
        assertEquals(-1, wordMachine.solutionTwo(ops));
    }


    @Test
    void canPopFirstTwoElementFromStackAndPushTheSum(){
        String[] ops = {"1", "2", "3", "+"};
        wordMachine.solutionTwo(ops);
        assertEquals( 2, wordMachine.getStack().size());
        assertEquals(5, wordMachine.getStack().peek());
    }

    @Test
    void returnMinusOneWhenOperationIsPlusAndStackContainOneElement(){
        String[] ops = {"1", "+"};
        assertEquals(-1, wordMachine.solutionTwo(ops));
        assertEquals( 1, wordMachine.getStack().size());
    }

    @Test
    void canPopFirstTwoElementFromStackAndPushTheDifference(){
        String[] ops = {"1", "2", "3", "-"};
        wordMachine.solutionTwo(ops);
        assertEquals( 2, wordMachine.getStack().size());
        assertEquals(1, wordMachine.getStack().peek());
    }

    @Test
    void returnMinusOneWhenOperationIsMinusAndStackContainOneElement(){
        String[] ops = {"1", "-"};
        assertEquals(-1, wordMachine.solutionTwo(ops));
        assertEquals( 1, wordMachine.getStack().size());
    }

    @Test
    void canPerformWordMachine(){
        String[] ops = {"0", "POP", "POP"};
        assertEquals(-1, wordMachine.solutionTwo(ops));
        assertEquals( 0, wordMachine.getStack().size());
    }

    @Test
    void canRemoveTheTopElement(){
        String[] ops = {"1", "2", "3", "POP"};
        wordMachine.solutionTwo(ops);
        assertEquals( 2, wordMachine.getStack().size());
        assertEquals(2, wordMachine.getStack().peek());
    }
}