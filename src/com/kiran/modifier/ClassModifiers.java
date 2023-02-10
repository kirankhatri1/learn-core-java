package com.kiran.modifier;

// allowed modifiers for top level class -> public, Default, Final, Abstract, Strictfp
// java: modifier private not allowed here

// but for inner class -> +, private, protected, and static
// public ->> can access from anywhere, within the package or outside the package
// Default -> can access only with in current package, package level access modifier
// Final -> applicable for class, methods, and variables

// Final for methods
// parents methods are by default available to child.
// child is not allowed to override-> make final parent method -> can not override/edit/alter

// final class
// no inheritance concept for final class
// main advantage of final keyword is security, disadvantage is missing inheritance concept in oops

// final variables
// final instance variable -> user have to perform initialization
// at the time of declaration eg. final int a = 10;
// inside instance block
// inside constructor

// final static variable------12/30/2022 to be continued
// when we need top create an object whose value is not varied from object to object we create static variable
// only one copy will be created and shared among all object of that class
// by default JVM will provide default value
// BUT if the static variable is final -> compulsory we should perform initialization

// final local variable
// only modifier can be used with local variable
// Formal parameters
// formal parameters act as local variable so it can be final

// Abstract modifier -> applicable only for methods and class but not for variables
// Abstract methods
// have only declaration but not definition/implementation
// abstract illegal combination with -> final, static, synchronised, native, strictfp,private

// abstract class -> is abstract class instantiation/ object creation not possible eg HttpServlet, every adapter class
// adapter class is a simple java class that implements an interface with only an empty implementation.

// strictfp -> methods and classes v1.2, IEEE754

// private < default < protected < public


public class ClassModifiers {

final static int i=10;

public strictfp static void main(String[] args) {
// System.out.println(doSum(100,200)); //340
// System.out.println("hello");
// System.out.println(10.0/3);
// Declaration.hello();
// System.out.println(doSum(10,20)); //340

}

public static int doSum(final int a, final int b){
 return a+b;
}

}
