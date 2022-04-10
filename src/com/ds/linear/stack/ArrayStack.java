package com.ds.linear.stack;

import com.exceptions.StackOverFlowException;
import com.exceptions.StackUnderFlowException;

public class ArrayStack implements Stack{
    private String[] stackList;
    private int size;

    public ArrayStack(int capacity) {
        this();
        stackList = new String[capacity];
    }

    public ArrayStack(){
        this.size = - 1;
    }

    /**
     * Tests whether the stack is empty
     * @return true if stack is empty, otherwise false
     */
    @Override
    public boolean isEmpty() {
        return size == -1;
    }

    /**
     * Inserts an element at the top
     * @param e the element to be inserted
     */
    @Override
    public void push(String e) throws StackOverFlowException {
        if (size == stackList.length - 1) throw new StackOverFlowException("Stack is full");
        stackList[++size] = e;
    }

    /**
     * Returns, but does not remove, the element at the top of the stack
     * @return top element in the stack ( or null if empty)
     */
    @Override
    public String top() {
        if (isEmpty()) return null;
        return stackList[size];
    }

    /**
     * Removes and returns the top element from the stack
     * @return element removed (or throw EmptyStackException)
     */
    @Override
    public String pop() throws StackUnderFlowException {
        if (isEmpty()) throw new StackUnderFlowException("Stack is empty");
        String popElement = top();
        stackList[size] = null;
        size--;
        return popElement;
    }
}
