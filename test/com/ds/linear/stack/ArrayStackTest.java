package com.ds.linear.stack;

import com.exceptions.StackOverFlowException;
import com.exceptions.StackUnderFlowException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {
    ArrayStack stack;

    @BeforeEach
    void setUp() {
        stack = new ArrayStack(3);
    }

    @AfterEach
    void tearDown() {
        stack = null;
    }

    @Test
    void stackIsEmptyWhenCapacityIsNotParsed(){
        ArrayStack stack = new ArrayStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    void stackIsEmptyWhenCapacityIsParsed(){
        assertTrue(stack.isEmpty());
    }

    @Test
    void elementCanBeAddedToStack() throws StackOverFlowException {
        String element = "Boy";
        stack.push(element);
        assertFalse(stack.isEmpty());
        assertEquals(element, stack.top());
    }

    @Test
    void multipleElementCanBeAddedToStack() throws StackOverFlowException {
        stack.push("Boy");
        stack.push("Girl");
        stack.push("Something else");

        assertFalse(stack.isEmpty());
        assertEquals("Something else", stack.top());
    }

    @Test
    void elementCanBeRemovedFromStack() throws StackOverFlowException, StackUnderFlowException {
        //Add
        stack.push("Boy");
        assertFalse(stack.isEmpty());
        assertEquals("Boy", stack.top());

        //Remove
        String expected = stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals("Boy", expected);
    }

    @Test
    void throwExceptionWhenStackIsFull() throws StackOverFlowException {
        ArrayStack stack = new ArrayStack(1);
        stack.push("Boy");
        assertThrows(StackOverFlowException.class, ()-> stack.push("Girl"));
    }

    @Test
    void returnNullWhenStackIsEmpty() {
        ArrayStack stack = new ArrayStack(1);
        assertNull(stack.top());
    }

    @Test
    void throwExceptionWhenPopedMethodIsCalledWithEmptyStack() {
        ArrayStack stack = new ArrayStack(1);
        assertThrows(StackUnderFlowException.class, ()->stack.pop());
    }
}