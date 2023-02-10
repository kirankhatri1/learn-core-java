package com.kiran;


import com.kiran.javastandard.Declaration;

// use noun for class name, should start with upper case, follow camel casing
public class Calculation {

Declaration declaration = new Declaration();

private int roll;
private boolean test;

public boolean isTest() {
 return test;
}

public void setTest(boolean test) {
 this.test = test;
}
// method name should prefix with get and is for boolean
// should be public
// return type should not be void
// nor arguments at all

public int getRoll() {
 return roll;
}

// start with set prefix
//should be public
// return type should be void
// compulsory should take some argument.

public void setRoll(int roll) {
 this.roll = roll;
}

public static void main(String[] args) {
 
 
 // variable name should be noun, start with lowercase
 // follow camelcasing
 int number1;
 int number2;
 
 // constants name always should be uppercase
 // add two words by underscore _ eg MAX_VALUE, PRIORITY
 
 // jAVA BEAN -> java class with all private properties and public
 // getter and setter
 //class name should end with bean, eg StudentBean
 
 // memory location in JVM
 // method area -> static block/static variable/reference
 // instance area -> instance variable
 // stack memory -> method calls, local variable
 // pc register
 // native method area
 
 System.out.println(addNumbers(10,20));
}


// name should be verb or verb+noun eg doSum(), getSalary()
public static int addNumbers(int number1, int number2){
 return number1+number2;
}

}
