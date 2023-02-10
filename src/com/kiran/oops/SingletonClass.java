package com.kiran.oops;

public class SingletonClass {

// For any java class if we are allowed to create only one object such type of class is said to be singleton class.
 //Creation of our own singleton classes:
//We can create our own singleton classes for this we have to use
// private constructor,
// static variable and
// factory method.

private static SingletonClass sc = null;
private SingletonClass(){}

public static SingletonClass getSingletonClass(){
 if(sc == null){
  sc = new SingletonClass();
 }
 return new SingletonClass();
}


//Factory method: By using class name if we are calling a method and that method returns the same class
//object such type of method is called factory method.


}

class TestSingleton{
public static void main(String[] args) {
 System.out.println(SingletonClass.getSingletonClass().hashCode());
 System.out.println(SingletonClass.getSingletonClass().hashCode());
 System.out.println(SingletonClass.getSingletonClass().hashCode());
 System.out.println(SingletonClass.getSingletonClass().hashCode());
 System.out.println(SingletonClass.getSingletonClass().hashCode());
}
}
