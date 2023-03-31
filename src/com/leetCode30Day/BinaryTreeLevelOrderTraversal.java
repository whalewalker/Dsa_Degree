package com.leetCode30Day;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        final List<List<Integer>> paths = new ArrayList<>();
        if (root == null)
            return paths;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);

        while (!deque.isEmpty()){
            int DEQUE_SIZE = deque.size();
            List<Integer> path = new ArrayList<>();

            for (int i = 0; i < DEQUE_SIZE; i++){
                TreeNode currNode = deque.removeFirst();
                path.add(currNode.val);

                if (currNode.left != null)
                    deque.addLast(currNode.left);

                if (currNode.right != null)
                    deque.addLast(currNode.right);

            }
            paths.add(path);
        }

        return paths;
    }
}
