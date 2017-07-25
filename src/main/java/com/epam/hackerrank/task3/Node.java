package com.epam.hackerrank.task3;

public class Node<V> {
    public V data;
    public Node<V> next;

    public Node(V data) {
        this.data = data;
    }

    public static boolean hasCycle (Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node pointer1 = head;
        Node pointer2 = head;
        while (pointer2 != null && pointer1 != null) {
            if (pointer1 == pointer2.next) {
                return true;
            }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
        }
        return false;
    }
}
