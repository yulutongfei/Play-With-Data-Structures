package com.sunxu.setandmap.bstmap;

import com.sunxu.setandmap.FileOperation;

import java.util.ArrayList;

/**
 * @author 孙许
 * @date 2018-09-04
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Pride and Prejudice");
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("src/main/resources/pride-and-prejudice.txt", words)) {
            System.out.println("Total words ：" + words.size());
            BSTMap<String, Integer> map = new BSTMap<>();
            for (String word : words) {
                if (map.contains(word)) {
                    map.set(word, map.get(word) + 1);
                } else {
                    map.add(word, 1);
                }
            }
            System.out.println("Total different words: " + map.getSize());
            System.out.println("Frequency of PRIDE: " + map.get("pride"));
            System.out.println("Frequency of PREJUDICE: " + map.get("prejudice"));
        }
    }
}
