package com.epam.hackerrank.task1;

public class ArraysLeftRotation {

    public static void rotate(int[] arr, int numsOfRotation) {
        if (arr == null || numsOfRotation < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < numsOfRotation; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
