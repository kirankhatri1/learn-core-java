package com.kiran.collection;

import java.util.LinkedList;

public class LinkedListExample {
    // ds -> double linked list
    // insertion order is preserved
    // duplicates are allowed
    // heterogenious allowed
    // null
    // serializable and cloneable but not randomAccess

//    LinkedList l = new LinkedList();
//    LinkedList l2 = new LinkedList(l);
public static void main(String[] args) {
    LinkedList<Integer> l3 = new LinkedList<Integer>();

    l3.addFirst(111);
    l3.addLast(1235);
    l3.add(3);
    l3.add(1);
    l3.add(2);
    l3.add(3);
    l3.add(null);
    System.out.println(l3.getLast());
    System.out.println(l3.getFirst());
    System.out.println(l3.removeFirst());
    l3.clone();
}



}
