package com.kiran.multithreading;

public class ImplementingRunnable implements Runnable  {

// We can define a Thread even by implementing Runnable interface also.
//Runnable interface present in java.lang.pkg and contains only one method run().

public void run(){
 for(int i=0;i<10;i++)
 {
  Thread.yield();
  System.out.println("child thread");
 }
}

}

class ThreadDemo1 {
public static void main(String[] args) throws InterruptedException {
 ImplementingRunnable r=new ImplementingRunnable();
 Thread t1 =new Thread();
 t1.start(); // case 1 below
 
 Thread t2 =new Thread(r);//here r is a Target Runnable
 t2.start(); // case 3 below
 
// r.start();   // start() not available
 Thread.sleep(3000, 2500);
 System.out.println(Thread.currentThread().getName());
 Thread.currentThread().setName("kiran thread");
 System.out.println(Thread.currentThread().getName());
 System.out.println(t1.getName());
 System.out.println(t2.getName());
 
 
/* Thread.currentThread().setPriority(8);
 System.out.println(Thread.currentThread().getPriority());
 System.out.println(t1.getPriority());
 System.out.println(t2.getPriority());*/
 
 
 for(int i=0;i<10;i++)
 {
  System.out.println("main thread");
 }
}

// case study
// MyRunnable r=new MyRunnable();
//Thread t1=new Thread();
//Thread t2=new Thread(r);

// Case 1: t1.start(): A new Thread will be created which is responsible for the execution of Thread class
//run()method.

// Case 2: t1.run(): No new Thread will be created but Thread class run() method will be executed just like
//a normal method call.

// Case 3: t2.start():New Thread will be created which is responsible for the execution of MyRunnable run()
//method.

// Case 4: t2.run() : No new Thread will be created and MyRunnable run() method will be executed just like
//a normal method call.

// Case 5: r.start(): We will get compile time error saying start() method is not available in MyRunnable
//class.


// Case 6: r.run(): No new Thread will be created and MyRunnable class run() method will be executed
//just like a normal method call.


// Best approach to define a Thread:
//  Among the 2 ways of defining a Thread, implements Runnable approach is
//always recommended.
// In the 1st approach our class should always extends Thread class there is no
//chance of extending any other class hence we are missing the benefits of
//inheritance.
// But in the 2nd approach while implementing Runnable interface we can extend
//some other class also. Hence implements Runnable mechanism is recommended
//to define a Thread.


}

