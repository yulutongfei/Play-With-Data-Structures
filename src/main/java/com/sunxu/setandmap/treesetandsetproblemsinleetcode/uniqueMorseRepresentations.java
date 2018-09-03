package com.sunxu.setandmap.treesetandsetproblemsinleetcode;

import java.util.TreeSet;

/**
 * 自己实现的算法比较繁琐
 * 计算唯一的摩斯密码
 * @author 孙许
 * @date 2018-09-03
 */
public class uniqueMorseRepresentations {

    static String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        int result = uniqueMorse(words);
        System.out.println(result);
    }

    private static int uniqueMorse(String[] words) {
        TreeSet<String> set = new TreeSet<>();
        char[] chars;
        for (String word : words) {
            word = word.toLowerCase();
            chars = word.toCharArray();
            StringBuilder morse = new StringBuilder();
            for (char aChar : chars) {
                morse = morse.append(charConvertMorse(aChar));
            }
            set.add(morse.toString());
        }
        return set.size();
    }

    private static String charConvertMorse(char aChar) {
        int x = aChar - 'a';
        return codes[x];
    }
}
