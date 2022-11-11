package com.leetCode30Day;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePreorderTraversal {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node node = stack.pop();
            result.add(node.val);

            for (int i = node.children.size() - 1; i >= 0; i--){
                Node child = node.children.get(i);
                stack.push(child);
            }
        }
        return result;
    }


    public static void main(String[] args) {
//        preorder()
    }
}
