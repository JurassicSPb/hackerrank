package com.epam.hackerrank.data_structures.task5;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class BalancedBrackets {

    public static boolean isBalanced(String expression) {
        Objects.requireNonNull(expression);

        if (expression.length() < 2 || expression.length() % 2 != 0) return false;

        char[] symbols = expression.toCharArray();

        Deque<Character> list = new LinkedList<>();
        for (char s : symbols) {
            switch (s) {
                case '{':
                    list.push('}');
                    break;
                case '(':
                    list.push(')');
                    break;
                case '[':
                    list.push(']');
                    break;
                default:
                    if (list.isEmpty() || s != list.peek())
                        return false;
                    list.pop();
            }
        }
        return list.isEmpty();
    }
}
