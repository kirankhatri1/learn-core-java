package com.kiran.multithreading;


class Display
{
public synchronized void wish(String name)
{
 for(int i=0;i<10;i++)
 {
  System.out.print("good morning:");
  try
  {
   Thread.sleep(1000);
  }
  catch (InterruptedException e)
  {}
  System.out.println(name);
 }
}
}

public class Synchronization extends Thread {

Display d;
String name;
Synchronization(Display d,String name){
 this.d = d;
 this.name = name;
}

public void run()
{
 d.wish(name);
}


//1. Synchronized is the keyword applicable for methods and blocks but not for
//classes and variables.
//2. If a method or block declared as the synchronized then at a time only one
//Thread is allow to execute that method or block on the given object.
//3. The main advantage of synchronized keyword is we can resolve date inconsistency problems.
//4. But the main disadvantage of synchronized keyword is it increases waiting time
//of the Thread and effects performance of the system.
//5. Hence, if there is no specific requirement then never recommended to use
//synchronized keyword.
//6. Internally synchronization concept is implemented by using lock concept.
//7. Every object in java has a unique lock. Whenever we are using synchronized
//keyword then only lock concept will come into the picture.
//8. If a Thread wants to execute any synchronized method on the given object 1st it
//has to get the lock of that object. Once a Thread got the lock of that object then
//it's allow to execute any synchronized method on that object. If the synchronized
//method execution completes then automatically Thread releases lock.
//9. While a Thread executing any synchronized method the remaining Threads are
//not allowed execute any synchronized method on that object simultaneously. But
//remaining Threads are allowed to execute any non-synchronized method
//simultaneously. [lock concept is implemented based on object but not based on method].

// Conclusion : If multiple threads are operating on multiple objects then there is no
//impact of Synchronization.
//If multiple threads are operating on same java objects then syncronized concept is
//required(applicable).

}


class SynchronizedDemo
{
public static void main(String[] args)
{
 Display d1=new Display();
 Synchronization t1=new Synchronization(d1,"Kiran");
 Synchronization t2=new Synchronization(d1,"Sanjay");
 t1.start();
 t2.start();
}
}