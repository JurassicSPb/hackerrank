package com.epam.hackerrank.data_structures.task7;

import com.epam.hackerrank.data_structures.task8.*;
import com.epam.hackerrank.data_structures.task8.Solution;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LonelyIntegerTest {
    @Test
    void test() throws Exception {
        Integer [] a = {1, 1, 2, 2, 5};
        Solution.lonelyInteger(a);
    }
}
