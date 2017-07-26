package com.epam.hackerrank.data_structures.task6;


import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BSTTest {

    @Test
     void bstTrueTest() throws Exception {
        Node node = new Node(5);

        assertThat(Node.checkBST(node), is(true));
    }

    @Test
    void bstFalseTest() throws Exception {
        Node node = new Node(9);

        assertThat(Node.checkBST(node), is(false));
    }
}
