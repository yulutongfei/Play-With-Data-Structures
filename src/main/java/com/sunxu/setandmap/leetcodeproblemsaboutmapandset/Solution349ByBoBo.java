package com.sunxu.setandmap.leetcodeproblemsaboutmapandset;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author 孙许
 * @date 2018-09-04
 */
public class Solution349ByBoBo {
    public int[] intersection(int[] nums1, int[] nums2) {

        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
