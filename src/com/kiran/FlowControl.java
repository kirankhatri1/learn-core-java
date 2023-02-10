package com.kiran;

public class FlowControl {

// selection -> if-else, switch
// iterative -> while, do-while, for, for each
// transfer statements -> break, continue,

public static void main(String[] args) {
 
 // if-else
// boolean value required
// curly braces are optional if body has only one line statement, not declarative statement
// semicolon ; is valid java statment  -> it calls empty stsatement and wont return any output

/* int x = 10;
 if (x == 10) { // boolean
  System.out.println("hello true");
 System.out.println("hello2 true");
 } else
  System.out.println("hello false");
 
 if(true)
  System.out.println("hi true");
 
 if(true);
 
 if(true) {
  int y = 15;
 }*/
 
 // switch -> replace multiple if-else (if-else ladder), coz, improve readability
 // + v4 byte, short, char, int, + v5 -> Byte, Short, Character, Integer, and enum +
 // {} are mandatory in this only
 // case and default are optional
 // statement must be under some case or default
 // case label should be compiled time constant*, also may be constant expression 10+10+5
 // case label should be within range
 // duplicate case label are not allowed
 // fall through inside the switch - executed until break or end of switch
 // default can be place only once
 // default is last case if nothing matched
 // default can be place anywhere
 
// int a = 2, b=0;
// final int c = 0;
// switch (a){
//  case 5+5:
//  System.out.println("hi");
////  break;
//  case 5:
//  System.out.println("hello");
//  default:
//   System.out.println("nothing matched");
// }
 
 
 // iterative statements while, do-while, for, for each
 // while -> if we don't know the iteration in advance
 // argument should be boolean
 // {} are optional
/* int a = 10;
 while(a < 15)
  System.out.println(a);*/
 
 
 // do while -> execute loop at least once
 // {} optional
 
/* do
//  while (true)
   System.out.println("hi");
  while(true);*/
  
  // for loop
 // for(initialization;conditional expn; value_change/increment/decrement){  body }
 
 // {} are optional
 // initialization -> optional, done only once, can take any valid java statement
 // conditional check -> optional (absent default true by compiler), any java expression of boolean type
 // value change -> optional, any valid java statement
 
// for(;;) System.out.println("Hello for loop");


// for each: (Enhanced for loop) v1.5
// retrieve elements from array and collections, not a general purpose loop
 // we can't write equivalent for each loop
 // always from left to right
 
// int[] a = {10,20,30,40,50};
// for(int i =0;i<a.length;i++){
//  System.out.println(a[i]);
// }
// System.out.println("-----------------------");
//
// for(int x:a) System.out.println(x);
 
 
 // iterator vs iterable(1.5v)- array/collection
// for(each item : target/iterable){--}
 
 // transfer statement
 //break -> inside switch to stop fall through, inside loop, inside label block
/*  for(int i= 0; i<10;i++){
   if(i==5)
    break;
    System.out.println(i);
  }*/
 
 // continue -> skip current iteration, we can use only inside loop
/* for(int i= 0; i<10;i++){
  if(i==5)
   continue;
  System.out.println(i);
 }*/
}

}
