package com.ds.linear.stack;

import java.util.LinkedList;

public interface SinglyLinkedList<T> {
    int size();
    boolean isEmpty();
    T first();
    T last();
    void addFirst(T value);
    void addLast(T value);
    T removeFirst();
}
