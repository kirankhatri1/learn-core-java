package com.kiran.oops;

public class Constructors {

//Whenever we are creating an object some piece of the code will be executed
//automatically to perform initialization of an object this piece of the code is constructor.
// main objective of constructor is to perform initialization of an object.
// 1. Name of the constructor and name of the class must be same.
// 2. Return type concept is not applicable for constructor even void also not applicable
//we won't get no error at compile time error and runtime error compiler simply treats it as a method.

String name;
int roll;

public Constructors() {
 super();
 System.out.println("sdf");
// super(); The 1st line inside every constructor should be either super() or this() if we are not
//writing anything compiler will always generate super().
}

public Constructors(String name) {
}

public Constructors(String name, int i) {
}

// Overloaded constructors :
// A class can contain more than one constructor and all these constructors having the
//same name but different arguments and hence these constructors are considered as
//overloaded constructors.
// no inheritance concept in constructor so no overriding concept but can be overloaded
// We can take constructor in any java class including abstract class also but we
//can't take constructor inside interface.

// We can't create object for abstract class but abstract class can contain constructor what
//is the need ?
//Abstract class constructor will be executed for every child class object creation to
//perform initialization of child class object only.

public static void main(String[] args) {
 Constructors constructors = new Constructors();
 Constructors constructors1 = new Constructors("Kiran");
 Constructors constructors2 = new Constructors("Kiran", 125);
}

// super() vs this()

}
