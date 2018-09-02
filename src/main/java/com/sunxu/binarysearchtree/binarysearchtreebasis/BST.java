package com.sunxu.binarysearchtree.binarysearchtreebasis;

/**
 * @author 孙许
 * @date 2018-09-02
 * @description
 */
public class BST<E extends Comparable<E>> {
    /**
     * 节点类
     */
    private class Node {
        E e;
        Node left;
        Node right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        this.root = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
