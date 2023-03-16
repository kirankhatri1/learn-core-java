package com.kiran.collection;

import java.util.Stack;

public class StackExample {

    // child class of vector
    // LIFO


    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.search("b"));
        System.out.println(s.search("x"));

    }

}
