package com.epam.hackerrank.task2;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class AnagramsTest {

    @Test
     void AnagramsTest() throws Exception{
        String a = "cde";
        String b = "abc";

        assertThat(Anagrams.numberNeeded(a, b), is(4));
    }
}
