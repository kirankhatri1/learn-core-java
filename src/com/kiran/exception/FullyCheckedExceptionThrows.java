package com.kiran.exception;

import java.io.*;

public class FullyCheckedExceptionThrows {

// In our program if there is any chance of raising checked exception then compulsory we
//should handle either by try catch or by throws' keyword otherwise the code won't compile.

//Note : Hence the main objective of "throws" keyword is to delegate the responsibility of
//exception handling to the caller method.
// "throws" keyword required only checked exceptions. Usage of throws for
//unchecked exception there is no use.
// "throws" keyword required only to convince complier. Usage of throws keyword
//doesn't prevent abnormal termination of the program.

// Hence recommended to use try-catch over throws keyword.

//We can use throws keyword only for constructors and methods but not for classes

//Exception handling keywords summary:
//1. try: To maintain risky code.
//2. catch: To maintain handling code.
//3. finally: To maintain cleanup code.
//4. throw: To handover our created exception object to the JVM manually.
//5. throws: To delegate responsibility of exception handling to the caller method

//Various possible compile time errors in exception handling:
//1. Exception XXX has already been caught.
//2. Unreported exception XXX must be caught or declared to be thrown.
//3. Exception XXX is never thrown in body of corresponding try statement.
//4. Try without catch or finally.
//5. Catch without try.
//6. Finally without try.
//7. Incompatible types.
//found:Test
//requried:java.lang.Throwable;
//8. Unreachable statement.

public static void main(String[] args) {
try{
 Thread.sleep(5000);
// System.out.println("hello exception");
} catch (InterruptedException e){

}
}


}
