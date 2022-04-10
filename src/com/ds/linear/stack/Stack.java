package com.ds.linear.stack;


import com.exceptions.StackOverFlowException;
import com.exceptions.StackUnderFlowException;

/**
 * A collection of object that are inserted and removed according to the last-in-first-out-principle
 * @author Whalewlaker
 */
public interface Stack {
    /**
     * Tests whether the stack is empty
     * @return true if stack is empty, otherwise false
     */

    boolean isEmpty();

    /**
     * Inserts an element at the top
     * @param e the element to be inserted
     */

    void push(String e) throws StackOverFlowException;

    /**
     * Returns, but does not remove, the element at the top of the stack
     * @return top element in the stack ( or null if empty)
     */

    String top();
    /**
     * Removes and returns the top element from the stack
     * @return element removed (or throw StackUnderFlowException)
     */

    String  pop() throws StackUnderFlowException;

}
