package com.leetCode30Day;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidateBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isValidBST(TreeNode root) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return true;
        boolean isValidBST = false;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);

        while (!deque.isEmpty()) {
            TreeNode currNode = deque.removeFirst();
            TreeNode leftNode = currNode.left;
            TreeNode rightNode = currNode.right;

            if (currNode.val > leftNode.val && currNode.val < rightNode.val) {
                isValidBST = true;

                if (leftNode.left != null && leftNode.right != null) {
                    deque.addLast(leftNode);
                }

                if (rightNode.left != null && rightNode.right != null) {
                    deque.addLast(rightNode);
                }
            }
        }
        return isValidBST;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-1);
//        root.right = new TreeNode(6);
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(8);

        System.out.println(isValidBST(root));

    }
}
