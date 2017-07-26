package com.epam.hackerrank.data_structures.task4;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LinkedListDetectAcycleTest {

    @Test
     void linkedListHasLoop () throws Exception {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n2;

        assertThat(Node.hasCycle(n1), is(true));

    }

    @Test
    void linkedListHasNoLoop () throws Exception {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        assertThat(Node.hasCycle(n1), is(false));
    }
}
