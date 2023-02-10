package com.kiran;

public class Adapter extends TestInterface {

//Adapter class is a simple java class that implements an interface only with empty
//implementation for every method.

//If we implement an interface directly for each and every method compulsory we
//should provide implementation whether it is required or not. This approach
//increases length of the code and reduces readability.

//Generic Servlet simply acts as an adapter class for Servlet interface.

//Note : marker interface and Adapter class are big utilities to the programmer to simplify programming.

// interface, abstract class, adapter class,
// concrete class -> implementation completely and ready to provide service || normal class

// We can replace interface concept with abstract class. But it is not a good programming
//practice. We are misusing the roll of abstract class. It may create performence problems also.

private int number;

public Adapter(int number) {
 this.number = number;
 System.out.println(this);
 System.out.println(this.hashCode());
}

public Adapter() {
}


// smalltalk
// C++

public Adapter(String data) {
}

public static void main(String[] args) {
 Adapter adapter = new Adapter();
}


// constructor
// To Initialize an Object but Not to Create an Object.
// Whenever we are creating an Object after Object Creation automatically constructor will be executed to Initialize that Object.
// Object Creation by New Operator and then Initialization by Constructor.

@Override
public void sum1() {
 System.out.println("Hello");
}

}
