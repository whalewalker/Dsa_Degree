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
        return validate(root, null, null);
    }

    public static boolean validate(TreeNode root, Integer low, Integer high){
        if (root == null) return true;
        if ((low != null && root.val <= low) || (high != null && root.val >= high)){
            return false;
        }
        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
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
