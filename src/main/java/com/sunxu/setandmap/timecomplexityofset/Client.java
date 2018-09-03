package com.sunxu.setandmap.timecomplexityofset;

import com.sunxu.setandmap.FileOperation;
import com.sunxu.setandmap.Set;
import com.sunxu.setandmap.linkedlistset.LinkedListSet;
import com.sunxu.setandmap.setbasicsandbstset.BSTSet;

import java.util.ArrayList;

/**
 * @author 孙许
 * @date 2018-09-03
 */
public class Client {
    public static void main(String[] args) {
        Set<String> set1 = new BSTSet<>();
        Set<String> set2 = new LinkedListSet<>();
        String filename = "src/main/resources/pride-and-prejudice.txt";
        System.out.println(testSet(set1, filename));
        System.out.println(testSet(set2, filename));
    }

    private static double testSet(Set<String> set, String filename) {
        long startTime = System.nanoTime();
        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile(filename, words)) {
            System.out.println("Total Words: " + words.size());

            for (String word : words) {
                set.add(word);
            }
            System.out.println("Total different words: " + set.getSize());
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 10000000000.0;
    }
}
