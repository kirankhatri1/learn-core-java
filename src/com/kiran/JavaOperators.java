package com.kiran;

public class JavaOperators {
// increment and decrement eg a++, a--
// arithmetic operator eg + - * / %
// string concatenation operator +
// relational operator eg < <== > >==
// equality operator ==, !=
// instanceof operator
// bitwise operator & -> AND, |  -> or, ^ -> x-or
// short circuit eg. operator &&, ||
// type cast operator eg implicit and explicit
// assignment operator eg = -> simple, chained, and compoound
// conditional operator eg exp1 ? exp2 : exp3
// new operator eg new -> used to create object , destruction of useless object by garbage collector
// [] operator  -> create arrays

public static void main(String[] args) {
 // ++, --
 // post, pre -> applied only for variable
 // nesting not possible y = ++(++x)
 // not apply in final variable
 // apply for primitive except boolean;
 // automatic type casting by compiler
 
 // a++, a-- post-increment
 // --a, ++a pre-increment
/* int x=10;
 x++;
 System.out.println(x); //11
 char ch = 'a';
 ch++;
 System.out.println(ch); // b
 double d = 10.5;
 d++;
 System.out.println(d); //11.5*/
 
 // diff between x++ and x+1
// byte a=10, b=5;
// byte d = (byte) (a+1);
// byte e = a++; // automatic type casting by compiler
// int c = a+b;  // max(int, type of a, type of b)
 
 // arithmetic operator => +,-,*,/,%
 // max(int, type of a, type of b)
 // byte+byte = int
 // byte+short = int
 // short+long= long
 // float+double = double
 // int +double = double
 // char+char = int
 // char + double = double
 int a=10,b=5,c;
 c = a+b;
 
 // byte, int, short, long -> no way to represent infinity
// System.out.println(10/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
 //float and double  -> string infinity
// System.out.println(10.0/0); // Infinity
// System.out.println(10/0.0); // Infinity
// System.out.println(-10.0/0); // -Infinity
 // byte, short, int, long -> no way to represent undefine
 //float and double  -> in case of undefine NaN
// System.out.println(0/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
// System.out.println(0.0/0); // NaN (Not a Number)
 
 //ArithmeticException
 //RunTimeException but not compile time error
 // occurs only for integral arithmetic but not for floating point
 // operators / and %
 
 // string concatenation
 // overloaded operator is + only
 // c = a+b; where a and b are numbers -> arithmetic operator
 // c = a+b; where a and  b || anyone is String -> string concatenation operator
// String i= "Kiran";
 int j=10, k=5;
// System.out.println(i+j+k); // Kiran105
// System.out.println(j+k+i); // 15Kiran
// System.out.println(j+i+k); // 10Kiran5
 
 // relational operator <, <=, >, >=
 // all primitive applicable except boolean, object type
 // nesting not allowed (10<5<20)
// System.out.println(true > false);
// System.out.println('a' > 'b');
// System.out.println('a' > 10.5);
// System.out.println(10<20<5);
 
 
 // equality operator ==, != -> for all primitive including boolean,
 // and object (reference/address comparison)
 // if we need to compare two object, there must be some relation between argument type
 // object == null -> false, null ===null -> true
// Thread t1 = new Thread();
// Thread t2 = new Thread();
// Thread t3 = t1;
// System.out.println(t1==t2); // false
// System.out.println(t1==t3); // true
 
// Thread t = new Thread();
// Object o = new Object();
// String s = new String("Kiran");
// System.out.println(t==o); // false
// System.out.println(o==s); // false
// System.out.println(s==t); // java: incomparable types: java.lang.String and java.lang.Thread
 
 //  ==      -> reference/address
 // .equal() -> content comparison
// String s1 = new String("Kiran");
// String s2 = new String("Kiran");
// String s3=s2;
// System.out.println(s3==s2); // false
// System.out.println(s1==s2); // false
// System.out.println(s1.equals(s2)); // "Kiran".equals( "Kiran") -> true
 
 // instanceof operator -> check type of object which is related each other
 // r instanceof x where r is object reference and x is class/interface
// Thread t = new Thread();
// System.out.println(t instanceof Thread); // yes
// System.out.println(t instanceof Object); // yes
// System.out.println(t instanceof Runnable); // yes
// public class Thread extends Object implements Runnable{}
// System.out.println(t instanceof String); // no
 
 
 // Bitwise operator -> & = both true , | = at least one true, ^ = both different
// System.out.println(true & false); // false
// System.out.println(true | false); // true
// System.out.println(true ^ false); // true
//
// System.out.println(4&5); // 4   100
// System.out.println(4|5); //5
// System.out.println(4^5); // 1
//
 // Bitwise complement ~
// System.out.println(~true); // cant applied to boolean
// System.out.println(~4);
// 4 --> 0 000 ---- 0100
 // ~4 --> 1 111 ---1011
 
 // boolean complement ! operator - ? applied for boolean only
// System.out.println(!true);
// System.out.println(!4);
 
 // &, | -> true | true
 // &&, || -> second argument evaluation is optional, high performance, only for boolean not for integral
 
// int aa = 5, bb =10;
// if(++aa < 5 || ++bb > 10){
//  aa++;
// } else {
//  bb++;
// }
// System.out.println(aa +"-----------------------"+bb);
 
 // type cast operator
 // byte->short -> int -> long -> float -> double
 // char -> int -> long -> float -> double
 // implicit (by compiler), explicit (by user or developer)
 int num1= 10, num2= 30;
 double p = num1+num2; // implicit
 short q = (short) (num1+num2); // explicit ,
 
 // compound assignment -> +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
// num1 = num1+num2;
// num1 += num2;
 
 // conditional orator
// System.out.println((10<20) ? true : false);
//
 // new operator
 // create an object
 Thread t = new Thread();
 int[] value;
 value = new int[20];
 
 // new vs newInstance()
 // new -> create object , if we know class name at the beginning
 // newInstance() -> class should contain no args constructor,  -> otherwise InstantiationException
 // if we don't know the class name at the beginning and its available dynamically at runtime
 // occurs classNotFound exception if class is not available at runtime

// but there is no delete operator, automatic done GC
 
 // diff between instanceof vs instanceof()
 
}

}
