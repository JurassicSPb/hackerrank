package com.epam.hackerrank.data_structures.task3;


import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    private Map<String, Integer> wordsMap = new HashMap<>();

    public boolean solve(String magazine, String note) {
        for (String s : magazine.split(" ")) {
            if (s.length() <= 1 || s.length() > 5) {
                return false;
            }
            wordsMap.putIfAbsent(s, 1);
        }

        for (String s : note.split(" ")) {
            if (s.length() <= 1 || s.length() > 5) {
                return false;
            }
            if (wordsMap.get(s) == null || wordsMap.get(s) == 0) {
                return false;
            } else {
                wordsMap.put(s, 0);
            }
        }
        return true;
    }
}
