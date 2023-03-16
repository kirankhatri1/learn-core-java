package com.kiran.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.RandomAccess;

public class List {

    // child interface of collection
    // group of individuals where duplicate allowed
    // order must be preserved
    // index is important to differentiate objects

    public static void main(String[] args) {
//        void add(int index, object o);
//        boolean addAll(int index, Collection c);
//        Object get(int index);
//        Object remove(int index);
//        Object set(int index, object o);
//        int indexOf(object o);
//        int lastIndexOf(object o);
//        ListIterator listIterator();

        // ArrayList, linkedList
        // ds -> resizable array
        //        duplicates allowed
        //        order preserved
        // null insertion is possible
        // serializable and cloneable interfaces
        // RandomAccess(I)
        // best choice for frequent operation
        // worst choice for frequent operation in middle
        // non-synchronized
        // not thread-safe

        ArrayList<String> l = new ArrayList<>(); // default capacity is 10, 16, 25, 38, .... (cc*3/2)+1


        ArrayList l1 = new ArrayList(100);
        ArrayList l2 = new ArrayList(l);
        System.out.println(l1.size() + " initial size" );
        System.out.println(l.size() + " asdf size" );
        l.add("A");
        l.add("A");
        l.add("A");
        l.add("A");
        l.add("A");
        l.add("A");
        l.add("A");
        l.add("A");
        l.add("A");
        l.add("A");
        l.add("A");
        System.out.println(l.size() + " second time size" );
        l.add("10");
        l.add(null);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof Cloneable);
        System.out.println(l instanceof RandomAccess);

    }

}
