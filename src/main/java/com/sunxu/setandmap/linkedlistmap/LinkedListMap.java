package com.sunxu.setandmap.linkedlistmap;

import com.sunxu.setandmap.Map;

/**
 * @author 孙许
 * @date 2018-09-03
 */
public class LinkedListMap<K, V> implements Map<K, V> {

    private class Node {

        K key;
        V value;
        Node next;

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node(K key) {
            this(key, null, null);
        }

        public Node() {
            this(null, null, null);
        }

        @Override
        public String toString() {
            return key.toString() + " : " + value.toString();
        }

    }

    private Node dummyHead;

    private int size;

    public LinkedListMap() {
        this.dummyHead = new Node();
        size = 0;
    }


    @Override
    public void add(K key, V value) {
        Node node = getNode(key);
        if (node != null) {
            node.value = value;
        } else {
            dummyHead.next = new Node(key, value, dummyHead.next);
            size++;
        }
    }

    @Override
    public V remove(K key) {
        Node prev = dummyHead;
        // 沿着dummyHead往下找，找到目标节点的prev
        while (prev.next != null) {
            if (prev.next.key.equals(key)) {
                break;
            } else {
                prev = prev.next;
            }
        }
        // 根据prev删除目标node
        if (prev.next != null) {
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size--;
            return delNode.value;
        }
        return null;
    }

    @Override
    public boolean contains(K key) {
        return getNode(key) != null;
    }

    @Override
    public V get(K key) {
        Node node = getNode(key);
        return node == null ? null : node.value;
    }

    @Override
    public void set(K key, V value) {
        Node node = getNode(key);
        if (node != null) {
            node.value = value;
        } else {
            throw new IllegalArgumentException(key + " doesn't exist!");
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private Node getNode(K key) {
        Node cur = dummyHead.next;
        while (cur != null) {
            if (cur.key.equals(key)) {
                return cur;
            } else {
                cur = cur.next;
            }
        }
        return null;
    }
}
