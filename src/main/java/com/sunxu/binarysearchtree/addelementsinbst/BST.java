package com.sunxu.binarysearchtree.addelementsinbst;

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

    /**
     * 向二分搜索树中添加新的元素e
     * @param e
     */
    public void add(E e) {
        if (root == null) {
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }
    }

    /**
     * 向以node为根的二分搜索树中插入元素E，递归算法
     * @param node
     * @param e
     */
    private void add(Node node, E e) {
        if (e.equals(node.e)) {
        } else if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            size++;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
            size++;
        }

        if (e.compareTo(node.e) < 0) {
            add(node.left, e);
        } else {
            add(node.right, e);
        }
    }
}
