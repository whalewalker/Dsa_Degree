package com.leetCode30Day;

public class MiddleOfTheLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode tracker = null;
        ListNode store = head;
        int size = 1;
        int count = 0;

        while (head != null){
            if (size % 2 != 0){
              count = (size + 1) / 2;
            }else {
                count = (size + 2) / 2;
            }
            size++;
            head = head.next;
        }

           while (count > 0){
               tracker = store;
               store = store.next;
               count--;
       }
        return tracker;
    }

    public static ListNode middleNode2(ListNode head) {
       if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
       return slow;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode list = listNode;
        list.next = new ListNode(2);
        list = list.next;
        list.next = new ListNode(3);
        list = list.next;
        list.next = new ListNode(4);
        list = list.next;
        list.next = new ListNode(5);

        System.out.println( middleNode2(listNode));
    }
}
