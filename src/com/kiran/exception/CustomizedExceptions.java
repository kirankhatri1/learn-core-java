package com.kiran.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomizedExceptions extends RuntimeException {

// Sometimes we can create our own exception to meet our programming requirements.
//Such type of exceptions are called customized exceptions (user defined exceptions).

// Example:
//1. InSufficientFundsException
//2. TooYoungException
//3. TooOldException

CustomizedExceptions(String s)
{
 super(s);
}
}



class TooOldException extends RuntimeException {
TooOldException(String s)
{
 super(s);
}
}



class CustomizedExceptionDemo {

/*
public static void main(String[] args){
 int age=Integer.parseInt(args[0]);
 if(age>60)
 {
  throw new CustomizedExceptions("please wait some more time.... u will get best match");
 }
 else if(age<18)
 {
  throw new TooOldException("u r age already crossed....no chance of getting married");
 }
 else
 {
  System.out.println("you will get match details soon by e-mail");
 }

//Multi catch block :
*/
/* try{
  System.out.println("sdfs");
 }
 catch(ArithmeticException e) {
  e.printStackTrace();
 }
 catch(NullPointerException e) {
  e.printStackTrace();
 }
 catch(ClassCastException e) {
  System.out.println(e.getMessage());
 } catch(IOException e) {
  System.out.println(e.getMessage());
 }*//*

 
 // Rethrowing an Exception :
 // To convert the one exception type to another exception type , we can use rethrowing
 // exception concept.
 
 try {
  System.out.println(10/0);
 }
 catch(ArithmeticException e) {
  throw new NullPointerException();
 }
 
 
 // Exception Propagation :
// With in a method if an exception raised and if that method doesn't handle that
// exception, then Exception object will be propagated to the caller then caller method is
// responsible to handle that exceptions. This process is called Exception Propagation.

}
*/



}

// Note: It is highly recommended to maintain our customized exceptions as unchecked by
//extending RuntimeException.
//We can catch any Throwable type including Errors also.

//Based on the person who is raising exception, all exceptions are divided into two types.
// They are:
//1) JVM Exceptions: The exceptions which are raised automatically by the jvm whenever a particular event
//occurs, are called JVM Exceptions.
// Example:
//1) ArrayIndexOutOfBoundsException(AIOOBE)
//2) NullPointerException (NPE).

//2) Programmatic exceptions:
// The exceptions which are raised explicitly by the programmer (or) by the API developer
//are called programmatic exceptions.
//Example: 1) IllegalArgumentException(IAE).

// // Top-10 Exceptions:
//ArrayIndexOutOfBoundsException:
//It is the child class of RuntimeException and hence it is unchecked exception
//NullPointerException:
// It is the child class of RuntimeException and hence it is unchecked
// StackOverFlowError
//NoClassDefFoundError
// ClassCastException
//ExceptionInInitializerError
// IllegalArgumentException
// NumberFormatException
// IllegalStateException
// AssertionError


// 1.7 version enhancement
// 1. try with resources
// 2. multi catch block

/*
BufferedReader br=null;
try{
  br=new BufferedReader(new FileReader("abc.txt"));
  //use br based on our requirements
  }
  catch(IOException e) {
  // handling code
  }
  finally {
  if(br != null)
  br.close();
  }
*/

/*

try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"); ))
  {
  br=new BufferedReader(new FileReader("abc.txt")
  use be based on our requirement, br will be closed automatically ,
  Onec control reaches end of try either normally
  or abnormally and we are not required to close explicitly
  }
  catch(IOException e) {
  // handling code
  }
*/

