package com.leetCode30Day;

public class reverseList {
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

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public ListNode setNext(ListNode next) {
            this.next = next;
            return this;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }






    public static ListNode reverseList2(ListNode head) {
        ListNode reverseList = null;
        ListNode curr = head;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = reverseList;
            reverseList = curr;
            curr = next;
        }
        return reverseList;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1)
                .setNext(new ListNode(2))
                .setNext(new ListNode(3))
                .setNext(new ListNode(4))
                .setNext(new ListNode(5));

        System.out.println(reverseList.reverseList(head));
    }
}
