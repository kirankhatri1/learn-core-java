package com.kiran.exception;

public class Exception {

//Exception: An unwanted unexpected event that disturbs normal flow of the program is
//called exception.

// It is highly recommended to handle exceptions. The main objective of exception
//handling is graceful (normal) termination of the program.

// Exception handling doesn't mean repairing an exception. We have to define alternative
// way to continue rest of the program normally. This way of defining alternative is exception handling.

//Default Exception Handling in Java:

public static void main(String[] args){
 doStuff();
}

public static void doStuff(){
 doMoreStuff();
}

public static void doMoreStuff() {
 
/* System.out.println("Hello from start"); // yes
 System.out.println("Hello exception part one"); // yes
 */
/* try{
  System.out.println(10/0); // no
 } catch (ArithmeticException e) {
  
  System.out.println("sorry it's error" + e.getMessage()); // yes
//  e.printStackTrace(); // yes
  System.out.println("sorry it's error" + e); // yes
  System.out.println("sorry it's error" + e.getMessage()); // yes
 } catch (java.lang.Exception e){
  e.printStackTrace();
 }
 
 System.out.println("Hello exception part two"); // yes
 System.out.println("Hello exception"); // yes
*/
 
 // Case-1: If there is no Exception:
/*  try {
   System.out.println("try block executed");
  } catch (ArithmeticException e) {
   System.out.println("catch block executed");
  } finally {
   System.out.println("finally block executed");
  }*/
  
  // Case-2: If an exception raised but the corresponding catch block matched:
/* try
 {
  System.out.println("try block executed");
  System.out.println(10/0);
 }
 catch(ArithmeticException e)
 {
  System.out.println("catch block executed");
 }
 finally
 {
  System.out.println("finally block executed");
 }*/
 
// Case-3: If an exception raised but the corresponding catch block not matched:
 
 try
 {
  System.out.println("try block executed");
  System.out.println(10/0);
 }
 catch(NullPointerException e)
 {
  System.out.println("catch block executed");
 }
 finally{
  System.out.println("finally block executed");
 }
 
 // return vs finally
// Even though return statement present in try or catch blocks first finally will be executed
// and after that only return statement will be considered. i.e. finally block dominates return statement.

/* try
 {
  System.out.println("try block executed");
//  return 0;
 }
 catch(ArithmeticException e)
 {
  System.out.println("catch block executed");
//  return 1;
 }
 finally
 {
//  System.out.println("finally block executed");
//  return 2; // only this will be printed
 }*/
 
 try
 {
  System.out.println("try");
          try
          {
           System.out.println("try block executed");
          }
          catch(ArithmeticException e)
          {
           System.out.println("catch block executed");
          }
          finally
          {
          System.out.println("finally block executed");
          }
  System.exit(0);
 }
 catch(ArithmeticException e)
 {
  System.out.println("catch block executed");
 }
 finally {
  System.out.println("finally block executed");
 }
 //Output:
 //try
 // 1. 0 argument acts as status code. Insteadof zero, we can take any integer value
 //2. zero means normal termination , non-zero means abnormal termination
 //3. This status code internally used by JVM, whether it is zero or non-zero there is no
 //change in the result and effect is same wrt program.
 
 // finally, vs System.exit(0):
 // There is only one situation where the finally block won't be executed is whenever we are
 //using System.exit(0) method.
 //When ever we are using System.exit(0) then JVM itself will be shutdown , in this case
 //finally block won't be executed.
 
 
// Difference between final, finally, and finalize:
// final:
// final is the modifier applicable for classes, methods and variables.
// If a class declared as the final then child class creation is not possible.
// If a method declared as the final then overriding of that method is not possible.
// If a variable declared as the final then reassignment is not possible.

// finally:
// finally is the block always associated with try-catch to maintain clean up code
// which should be executed always irrespective of whether exception raised or not
// raised and whether handled or not handled.
 
 // finalize:
 //finalize is a method, always invoked by Garbage Collector just before destroying
 //an object to perform cleanup activities.
 
 }
 
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at com.kiran.exception.Exception.doMoreStuff(Exception.java:25)
//at com.kiran.exception.Exception.doStuff(Exception.java:21)
//at com.kiran.exception.Exception.main(Exception.java:17)

//object
//  throwable
//exception and error

//Throwable acts as a root for exception hierarchy.
//Throwable class contains the two child classes are exception and error.

// exception -> Most of the cases exceptions are caused by our program and these are recoverable.
// Error -> Most of the cases errors are not caused by our program these are due to lack of system
//resources and these are non-recoverable.

// Checked Vs Unchecked Exceptions
//Note: Whether exception is checked or unchecked compulsory it should occur at
//runtime only and there is no chance of occurring any exception at compile time.
//Fully checked Vs Partially checked :
//A checked exception is said to be fully checked if and only if all its child classes are also checked.
//eg IOException, InterruptedException.

//A checked exception is said to be partially checked if and only if some of its child classes are unchecked.
//eg  exception

// Customized Exception Handling by using try-catch:
// It is highly recommended handling exceptions.
// In our program the code which may raise exception is called risky code, we have
//to place risky code inside try block and the corresponding handling code inside catch block.


//Finally block
/*
try {
 risky code
}
catch(x e)
{
 handling code
}
finally
{
 cleanup code
}*/

}