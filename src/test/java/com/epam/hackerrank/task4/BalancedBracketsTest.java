package com.epam.hackerrank.task4;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BalancedBracketsTest {

    @Test
     void bracketsBalanceTest() throws Exception{
        String first = "{[()]}";
        String second = "{[(])}";
        String third = "{{[[(())]]}}";

        assertThat(BalancedBrackets.isBalanced(first), is(true));
        assertThat(BalancedBrackets.isBalanced(second), is(false));
        assertThat(BalancedBrackets.isBalanced(third), is(true));
    }

    @Test
     void wrongArgumentsTest() throws Exception{
        String first = "{";
        String second = "{[()}";

        assertThat(BalancedBrackets.isBalanced(first), is(false));
        assertThat(BalancedBrackets.isBalanced(second), is(false));
    }

    @Test
    void NullpointerTest () throws Exception{
        Throwable exception = assertThrows(NullPointerException.class, () -> BalancedBrackets.isBalanced(null));

        assertEquals(exception.getMessage(), null);
    }

}
