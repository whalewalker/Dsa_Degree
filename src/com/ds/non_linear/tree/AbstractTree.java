package com.ds.non_linear.tree;

import com.sun.source.tree.BinaryTree;

/**
 * An abstract base class that provide some functionality of the Tree interface
 * @param <E>
 */
public abstract class AbstractTree<E> implements Tree<E>{
    @Override
    public boolean isInternal(Position<E> p) {
        return numChildren(p) > 0;
    }

    @Override
    public boolean isExternal(Position<E> p) {
        return numChildren(p) == 0;
    }

    @Override
    public boolean isRoot(Position<E> p) {
        return p == root();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /** Returns the number of levels separating the Position p from the root */
    public int depth(Position<E> p){
        if (isRoot(p)) return 0;
        else return 1 + depth(parent(p));
    }

    /** Returns the height of a tree */
    private int heightBad(){            // Work but quadratic worst case time
        int h = 0;
        for (Position<E> p : positions()){
            if (isExternal(p))        // Only consider leaf position
                h = Math.max(h, depth(p));
        }
        return h;
    }


    /** Returns the height of the subtree rooted at Position P .*/
    public int height(Position<E> p){
        int h = 0;
        for(Position<E> c : children(p)){
            h = Math.max(h, 1 + height(c));
        }
        return h;
    }


    /**
     *                          A
     *                         /  \
     *                        B   C
     *                      /  \ / \
     *                    D    E F  G
     */
}
