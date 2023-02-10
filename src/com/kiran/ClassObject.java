package com.kiran;

public class ClassObject {

// variable -> primitive and reference
// primitive variable -> represent primitive datatype values
// example -> int number = 10;
// reference variable -> refer objects
// example -> Student student = new Student();
// call by reference vs call by value


// variable -> based on behavior and position of declaration -> instance variable, static variable and local variable

// instance/object-level variable -> value of variable is varied from object to object
// for every object a separate copy of instance variable will be created
// scope of instance variable is same as scope of objects
// stored in heap
// can be declared directly in the class but outside any methods, blocks, constructor
// can be access directly from instance area but not from static area (required object reference)
// JVM always provides default value for instance variable

// static variable -> value is not varied from object to object
// only one copy will be created for entire class and shared to all object of that class
// scope is same as scope of .class file.
// stored in method area
// can be accessed from both instance and static area
// can be accessed by class name or object reference , -> recommended is use class name
// jvm provides default value
// example -> static String apple;

//java TEST
//start jvm
//created and start main thread by JVM
//locate main method
//load test.class by main thread // static variable create
//execute main()
//unload test.class // static variable destroy

// Local/automatic/temporary/stack variable -> inside methods, blocks, constructors
// scope same as block
// JVM won't provide any default value;
// only final modifier are applicable in local variable


// var-arg method java v1.5
// w can declare no of arguments in methods
// implemented as array internally
// valid declarations -> method(int... a), method(int ...a), method(int...a)
// can mix var-arg with general variable -> method(String name, int... a)
// var-arg argument should be last parameter
//only one var-arg parameter is allowed in one method

static int a;
public static void main(String[] sanjayKiran) {
 int p;
// System.out.println(p);


// System.out.println(apple);
// ClassObject c = new ClassObject();
// System.out.println(c.a);
// System.out.println(ClassObject.a);
// System.out.println(a);
 numbers(0);
 numbers(0,10);
 numbers(0,10,20,30);
}


// var-arg method
public static void numbers(int number, int...args){
 System.out.println("test text");
}



public void methodTest(){
// String apple1;
// System.out.println(apple1);
// System.out.println(apple);
}


}
