package com.ds.linear.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListImplTest {

    private SinglyLinkedList<String> singlyLinkedList;

    @BeforeEach
    void setUp() {
        singlyLinkedList = new SinglyLinkedListImpl<>();
    }

    @AfterEach
    void tearDown() {
        singlyLinkedList = null;
    }

    @Test
    void linkedListIsEmptyWhenCreated(){
        assertTrue(singlyLinkedList.isEmpty());
    }

    @Test
    void canAddValueToTheHeadOfALinkedList(){
        String value = "boy";
        singlyLinkedList.addFirst(value);
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(singlyLinkedList.first(), value);
        assertEquals(singlyLinkedList.size(), 1);
    }

    @Test
    void canAddValueToTheEndOfALinkedList(){
        String value = "boy";
        singlyLinkedList.addLast(value);
        assertFalse(singlyLinkedList.isEmpty());
        assertEquals(singlyLinkedList.last(), value);
        assertEquals(singlyLinkedList.size(), 1);
    }
}