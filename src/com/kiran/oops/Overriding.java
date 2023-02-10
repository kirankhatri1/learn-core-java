package com.kiran.oops;

public class Overriding {

//Whatever the Parent has by default available to the Child through inheritance, if
//the Child is not satisfied with Parent class method implementation then Child is
// allowed to redefine that Parent class method in Child class in its own way this
//process is called overriding.

// The Parent class method which is overridden is called overridden method. marry() -> laxmi
// The Child class method which is overriding is called overriding method.  marry() ->laxmi/Rozi


//  In overriding method resolution is always takes care by JVM based on runtime
//object hence overriding is also considered as runtime polymorphism or dynamic
//polymorphism or late binding.

//  The process of overriding method resolution is also known as dynamic method dispatch
//Note: In overriding runtime object will play the role and reference type is dummy.
// rules
// In overriding method names and arguments must be same. That is method signature must be same.
// Until 1.4 version the return types must be same but from 1.5 version onwards co-variant return types are allowed.
// Co-variant return type concept is applicable only for object types but not for primitives.
// Private methods are not visible in the Child classes hence overriding concept is not applicable for private methods.
//Parent class non-final methods we can override as final in child class. We can
//override native methods in the child classes.
//We should override Parent class abstract methods in Child classes to provide implementation.

// Overriding with respect to static methods:
//case1: Overriding with respect to static methods:
//case2: Similarly we can't override a non-static method as static.
//case3: It is valid. It seems to be overriding concept is applicable for static methods but it is not overriding it is method hiding.

// Overriding with respect to variables:
// Overriding concept is not applicable for variables.
// Variable resolution is always takes care by compiler based on reference type

}
