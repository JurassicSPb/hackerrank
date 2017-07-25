package com.epam.hackerrank.task2;


public class Anagrams {

    public static int numberNeeded(String first, String second) {
        int[] numberOfLetters = new int[26];

        for (char c : first.toCharArray()) {
            numberOfLetters[c - 'a']++;
        }

        for (char c : second.toCharArray()) {
            numberOfLetters[c - 'a']--;
        }

        int deleted = 0;

        for (int i : numberOfLetters) {
            deleted += Math.abs(i);
        }
        return deleted;
    }
}
