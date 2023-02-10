package com.kiran.javastandard;

// import java.util.ArrayList; // explicit -> recommended
// import java.util.Date; // explicit -> recommended, high priority


import static java.lang.Integer.MAX_VALUE;

public class Declaration {

// static int MAX_VALUE = 100;

  public static void hello(){
   System.out.println("print Hello");
  }


// zero or at-most one public class allowed in java program ->
// if there is no public class then  any name we give for java source file
// program name and public class name must be matched if there is public class

// we compile java program but run java class
// for each java class one dot class file will be created
//Exception in thread "main" java.lang.NoSuchMethodError: main -> when main() not available
//Exception in thread "main" java.lang.NoClassDefFoundError: kiran  -> when .class file not available

// import statement -> reduce code length and increase readability
// types explicit and implicit class import
// during import all classes and interfaces are available but not sub-packages
// import is compile time concept -> more cto import more compile time, no change in execution time
// import .class file will be loaded when using .class file is called dynamic loading/ on-demand loading/ load-on fly
// static import(v1.5) -> not recommended

// priority -> Current class static members, Explicit static import, implicit static import

public static void main(String[] args) {
 
 System.out.println(MAX_VALUE);
 
/* System.out.println(Math.sqrt(4));
 System.out.println(Math.max(10,20));
 System.out.println(Math.random());
 System.out.print(Math.random());
 System.out.print(Math.random());*/
 
 // System.out.println();
 // System -> class
 // out -> static variable of type String present in System class
 // println() -> method present in PrintStream class

}
}
