package com.leetCode30Day;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycleII {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> store = new HashSet<>();
       while (head != null){
           if (store.contains(head)) return head;
           store.add(head);
           head = head.next;
       }
       return null;
    }
}
