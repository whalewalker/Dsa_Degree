package com.ds.non_linear.tree;

import java.util.*;

public class BinaryTree<T> {
    private Node<T> root;

    public void inorder(Node<T> node) {
        if (node == null)
            return;
        inorder(node.getLeft());
        System.out.print(node.getValue() + " -> ");
        inorder(node.getRight());

    }

    public void preorder(Node<T> node) {
        if (node == null) return;
        System.out.print(node.getValue() + " -> ");
        preorder(node.getLeft());
        preorder(node.getRight());
    }

    public List<List<Node<T>>> preorderList(Node<T> root){
        List<List<Node<T>>> result = new ArrayList<>();
        if (root == null) return result;

        Deque<Node<T>> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()){
            final int SIZE = deque.size();
            final List<Node<T>> path = new ArrayList<>();

            for (int i = 0; i < SIZE; i++){
                Node<T> currNode = deque.removeFirst();
                path.add(currNode);

                if (currNode.getLeft() != null)
                    deque.addLast(currNode.getLeft());

                if (currNode.getRight() != null)
                    deque.addLast(currNode.getRight());
            }
            result.add(path);
        }

        return result;
    }

    public void postorder(Node<T> node) {
        if (node == null) return;
        postorder(node.getLeft());
        postorder(node.getRight());
        System.out.print(node.getValue() + " -> ");
    }

    public void postorder2(Node<T> root) {
        Stack<Node<T>> stack = new Stack<>();
        while (true){
            while (root != null){
                stack.push(root);
                stack.push(root);
                root = root.getLeft();
            }
            if (stack.isEmpty()) return;
            root = stack.pop();

            if (!stack.isEmpty() && stack.peek() == root)
                root = root.getRight();
            else {
                System.out.print(root.getValue() + " -> ");
                root = null;
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.root = new Node<>(1);
        tree.root.setLeft(new Node<>(2));
        tree.root.setRight(new Node<>(3));
        tree.root.getLeft().setLeft(new Node<>(4));
        tree.root.getLeft().setRight(new Node<>(5));

//        tree.inorder(tree.root);
//        System.out.println();
        tree.preorderList(tree.root);
//        System.out.println();
//        tree.postorder(tree.root);
//        System.out.println("\nWhile loop traversal");
//        tree.postorder2(tree.root);
    }

}
