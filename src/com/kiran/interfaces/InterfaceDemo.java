package com.kiran.interfaces;

public interface InterfaceDemo {
 
 // any service requirement specification (SRS) is interface or 100% pure abstract class
// it never talks about implementation
// types -> normal, marker/ability/empty/tagging (without any abstract method), functional interface/ Single Abstract Method interface

String sayHello();
//public String sayHello();
//abstract String sayHello();
//public abstract String sayHello();

// extends vs implements
// a class can extend only one class at a time
// multiple extends is not possible as multiple inheritance is not allowed in java
// a class can implement any number of interfaces -> multiple inheritance is allowed in case of interface in java
// public ? -> to make this method available for every impln class
// we can't use -> Private, protected, final, static, synchronized, native, strictfp.

// interface variable
// can contain variable
// purpose -> define requirement level constant
// Every interface variable is always public static and final whether we are declaring or not.

//int x=10;
//public int x=10;
//static int x=10;
//final int x=10;
//public static int x=10;
//public final int x=10;
//static final int x=10;
//public static final int x=10;
// public ? -> to make it available for its impln class
// static ? -> without existing object also we hve to access this variable
// we can't use with -> private, protected, transient, and volatile
// For the interface variables compulsory we should perform initialization at the
//time of declaration only otherwise we will get compile time error.

// interface method naming conflicts
// interface variable naming conflicts
// marker interface
// adapter/ concrete class
// constructor

// What is the difference between interface, abstract class and concrete class?

}
