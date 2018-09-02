package com.sunxu.binarysearchtree.preordertraverseinbst;

/**
 * @author 孙许
 * @date 2018-09-02
 * @description
 */
public class Client {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            bst.add(num);
        }
        bst.preOrder();
        System.out.println();
        System.out.println(bst);
    }
}
