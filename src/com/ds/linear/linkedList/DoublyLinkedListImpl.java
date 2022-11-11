package com.ds.linear.linkedList;

import com.ds.linear.Node;
import com.leetCode30Day.MergeTwoSortedList;

public class DoublyLinkedListImpl<T> implements DoublyLinkedList<T>{

    private Node<T> head;
    private Node<T> tail;
    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Node<T> first() {
        return head;
    }

    @Override
    public Node<T> last() {
        return tail;
    }

    @Override
    public void addHead(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null){
            head = newNode;
            tail = head;
        }
        head.setPrev(newNode);
        newNode.setNext(head);
        head = newNode;

        size++;
    }

    @Override
    public void addTail(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail == null){
            head = newNode;
            tail = newNode;
        }

        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;

        size++;
    }

    @Override
    public Node<T> removeHead() {
        Node<T> removedNode = head;
        if (head == null) return null;
        head = head.getNext();
        head.setPrev(null);

        size--;
        return removedNode;
    }

    @Override
    public Node<T> removeTail() {
        Node<T> removeNode = tail;
        if (tail == null) return null;

        tail = tail.getPrev();
        tail.setNext(null);

        size--;
        return removeNode;
    }

    @Override
    public Node<T> find(int index) {
        Node<T> current;
        if (isNotValidIndex(index)) return null;
        if (index <= size / 2){
            current = head;
            for (int i = 0; i < index; i++){
                current = current.getNext();
            }
        }else {
            current = head;
            for (int i = size; i > index; i--){
                current = current.getPrev();
            }
        }
        return current;
    }

    private boolean isNotValidIndex(int index) {
        return index <= 0 && index >= size;
    }

    @Override
    public void insert(T value, int index) {
        if (isNotValidIndex(index)) throw new ArrayIndexOutOfBoundsException("Index out of bound");
        if (index == size) addTail(value);
        if (index == 0) addHead(value);

        Node<T> prev = find(index - 1);
        Node<T> newNewNode = new Node<>(value);
        Node<T> temp = prev.getNext();

        prev.setNext(newNewNode);
        newNewNode.setNext(temp);
        newNewNode.setPrev(prev);

        size++;
    }

    @Override
    public Node<T> remove(int index) {
        if (isNotValidIndex(index)) throw new ArrayIndexOutOfBoundsException("Index out of bound");
        if (index == size) removeTail();
        if (index == 0) removeHead();

        Node<T> removedNode = find(index);
        removedNode.getPrev().setNext(removedNode.getNext());
        removedNode.getNext().setNext(removedNode.getPrev());

        size--;
        return removedNode;
    }

    @Override
    public Node<T> update(T value, int index) {
        Node<T> nodeToUpdate = find(index);
        if (nodeToUpdate != null){
            nodeToUpdate.setValue(value);
        }
        return nodeToUpdate;
    }

    @Override
    public Node<T> sortASC() {
        //Learn Quick sort;
        return null;
    }

    @Override
    public Node<T> sortDSC() {
        //Learn Quick sort;
        return null;
    }

    @Override
    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + " -> ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
