package com.epam.hackerrank.data_structures.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RansomNoteTest {
    private RansomNote r = new RansomNote();
    private RansomNote r2 = new RansomNote();

    @BeforeEach
    void init() throws Exception {
        r = new RansomNote();
        r2 = new RansomNote();
    }

    @Test
    void ransomNoteTestReturnsTrue() throws Exception {
        String magazine = "give me one grand today night";
        String note = "give one grand today";

        String magazine2 = "give me one grand today night hello world";
        String note2 = "give one grand today world hello";

        assertThat(r.solve(magazine, note), is(true));

        assertThat(r2.solve(magazine2, note2), is(true));
    }

    @Test
    void ransomNoteTestReturnsFalse() throws Exception {
        String magazine = "two times three is not four";
        String note = "two times two is four";

        String magazine2 = "two times three is not four";
        String note2 = "two times hello is four";

        assertThat(r.solve(magazine, note), is(false));

        assertThat(r.solve(magazine2, note2), is(false));
    }

    @Test
    void wrongArgumentsTest() throws Exception {
        String magazine = "twoooooo times three is not four";
        String note = "twoooooo times is four";

        assertThat(r.solve(magazine, note), is(false));
    }
}
