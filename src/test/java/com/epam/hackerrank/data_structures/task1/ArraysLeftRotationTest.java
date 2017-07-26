package com.epam.hackerrank.data_structures.task1;

import com.epam.hackerrank.data_structures.task5.BalancedBrackets;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArraysLeftRotationTest {
    private int[] initialArray = {1, 2, 3, 4, 5};
    private int[] expectedArray = {5, 1, 2, 3, 4};

    @Test
    void rotateTest() throws Exception {
        ArraysLeftRotation.rotate(initialArray, 4);

        assertArrayEquals(initialArray, expectedArray);

    }

    @Test
    void testWrongArguments() throws Exception {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> ArraysLeftRotation.rotate(null, 4));

        assertEquals(exception.getMessage(), "Illegal argument!");

        exception = assertThrows(IllegalArgumentException.class, () -> ArraysLeftRotation.rotate(initialArray, -1));

        assertEquals(exception.getMessage(), "Illegal argument!");
    }
}
