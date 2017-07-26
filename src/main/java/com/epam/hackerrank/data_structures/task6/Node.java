package com.epam.hackerrank.data_structures.task6;


public class Node {
    int data;
    Node left;
    Node right;

    public Node (int data) {
        this.data = data;
    }

    public static boolean checkBST(Node root) {
        return checkBST(root, 1, 7);
    }

    private static boolean checkBST(Node node, int min, int max) {
        if (node == null)
            return true;
        if (node.data <= min || node.data >= max)
            return false;
        return checkBST(node.left, min, node.data)
                && checkBST(node.right, node.data, max);
    }
}
