package com.kiran.collection;

import java.util.Vector;

public class VectorExample {

    // same as ArrayList
    // thread safe
    //cc*2 10,20,40,80,....

//    Vector v = new Vector();
//    Vector v1 = new Vector(50);
//    Vector v2 = new Vector(50, 10);
//    Vector v3 = new Vector(v);

    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity());
        for(int i =1; i <=10; i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity());
        System.out.println(v);
    }

}
