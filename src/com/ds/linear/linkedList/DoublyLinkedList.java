package com.ds.linear.linkedList;

import com.ds.linear.Node;

public interface DoublyLinkedList<T> {
    int size();
    boolean isEmpty();
    Node<T> first();
    Node<T> last();
    void addHead(T value);
    void addTail(T value);
    Node<T> removeHead();
    Node<T> removeTail();
    Node<T> find(int index);
    void insert(T value, int index);
    Node<T> remove(int index);
    Node<T> update (T value, int index);
    Node<T> sortASC();
    Node<T> sortDSC();
    void print();
}
