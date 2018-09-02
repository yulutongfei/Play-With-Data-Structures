package com.sunxu.binarysearchtree.removeminandmaxinbst;


import java.util.ArrayList;
import java.util.Random;

/**
 * @author 孙许
 * @date 2018-09-02
 * @description
 */
public class Client {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            bst.add(random.nextInt(10000));
        }
        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty()) {
            nums.add(bst.removeMin());
        }
        System.out.println(nums);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) > nums.get(i)) {
                throw new IllegalArgumentException("有异常");
            }
        }
        System.out.println("完成");
    }
}
