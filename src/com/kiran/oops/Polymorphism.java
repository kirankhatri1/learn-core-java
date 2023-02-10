package com.kiran.oops;

import java.util.*;

public class Polymorphism {
// Same name with different forms is the concept of polymorphism.
//We can use same abs() method for int type, long type, float type etc.
//types ->
// compiletime/static/earlybinding  -> overloading and methodhiding
// and runtime/dynamic/latebinding  -> overriding

void abs (int a){};
void abs (long a){};
void abs (float a){};

// We can use the parent reference to hold any child objects.
List l  =new ArrayList();
List l1 =new LinkedList();
List l2 =new Vector();
List l3 =new Stack();


}
