package com.sunxu.setandmap.leetcodeproblemsaboutmapandset;

import java.util.HashSet;
import java.util.Set;

/**
 * leetcode349号问题：自己解答
 * 思路：1.将nums1插入set1中
 * 2.将set1和nums2相同的元素，插入set2中
 * 3.将set2转成Integer[]数组
 * 4.Integer[]数组遍历复制给Int[]
 * @author 孙许
 * @date 2018-09-04
 */
public class Solution349 {


    private int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                set2.add(i);
            }
        }
        int[] result = new int[set2.size()];
        Integer[] integers = set2.toArray(new Integer[]{});
        for (int i = 0; i < integers.length; i++) {
            result[i] = integers[i];
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
