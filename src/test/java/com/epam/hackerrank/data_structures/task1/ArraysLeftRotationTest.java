package com.epam.hackerrank.data_structures.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArraysLeftRotationTest {

    @Test
    void rotateTest() throws Exception {
        int[] initialArray = {1, 2, 3, 4, 5};

        int[] expectedArray = {5, 1, 2, 3, 4};

        ArraysLeftRotation.rotate(initialArray, 4);

        assertArrayEquals(initialArray, expectedArray);

    }
}
