package com.leetCode30Day;

import java.util.ArrayList;
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
        while (head != null) {
            if (store.contains(head)) return head;
            store.add(head);
            head = head.next;
        }
        return null;
    }

    public static ListNode detectCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode list = listNode;


//        list.next = cycle;
//        list = list.next;
//        list.next = new ListNode(0);
//        list = list.next;
//        list.next = new ListNode(4);
//        list = list.next;
//        list.next = cycle;

        System.out.println(detectCycle2(listNode).val);
    }
}
