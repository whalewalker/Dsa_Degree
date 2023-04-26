package com.ds.non_linear.tree;

public interface BinaryTree<E> extends Tree<E>{
    /** Returns the Position of p's left child (or null if no child exists). */
    Position<E> left(Position<E> p) throws IllegalArgumentException;

    /** Returns the Position of p's right child (or null if no child exists). */
    Position<E> right(Position<E> p) throws IllegalArgumentException;

    /** Returns the Position of p's sibling child (or null if no child exists). */
    Position<E> sibling(Position<E> p) throws IllegalArgumentException;

}
