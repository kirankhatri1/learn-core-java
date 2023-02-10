package com.kiran.exception;

public class ThrowStatement {

//Sometimes we can create Exception object explicitly and we can hand over to the JVM
//manually by using throw keyword.

static ArithmeticException e;


public static void main(String[] args){
 System.out.println(10/0);
}

/*public static void main(String[] args){
 throw new ArithmeticException("/ by zero created by Kiran");
 // Note: In general we can use throw keyword for customized exceptions but not for predefined exceptions.
}*/

//case 1
// throw e;
// If e refers null then we will get NullPointerException.



}
