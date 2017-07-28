package com.epam.hackerrank.data_structures.task8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static int lonelyInteger(Integer[] a) {
        int value = 0;

        for (int i : a) {
            value ^= i;
        }
        return value;
    }
}
