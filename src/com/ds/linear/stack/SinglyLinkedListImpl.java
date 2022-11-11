package com.ds.linear.stack;

import com.ds.linear.Node;

public class SinglyLinkedListImpl<T> implements SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T first() {
        return head.getValue();
    }

    @Override
    public T last() {
        return tail.getValue();
    }

    @Override
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T value) {
        Node<T> lastNode = new Node<>(value);
        if (tail == null) {
            addFirst(value);
        }
        else {
            tail.setNext(lastNode);
            tail = lastNode;
            size++;
        }
    }

    @Override
    public T removeFirst() {
        return null;
    }
}
