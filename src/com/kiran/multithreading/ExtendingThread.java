package com.kiran.multithreading;

public class ExtendingThread {

// Defining a thread by extending thread class
   public static void main(String[] args) {
       // instantiation of thread
       ThreadDemo threadDemo = new ThreadDemo();
       // start thread
       threadDemo.start();
       
       for (int i = 0; i < 20; i++) {
        System.out.println("Main thread");
       }
   }
}

class ThreadDemo extends Thread {
    @Override
    public void start(){
     super.start();
     System.out.println("start method");
    }
    // overriding of run method must and highly recommended overriding this method
    @Override
    public void run() {
     for (int i = 0; i < 20; i++)
      System.out.println("child thread");
    }


// case 1: Thread Scheduler
//  If multiple Threads are waiting to execute then which Thread will execute 1st is
//decided by "Thread Scheduler" which is part of JVM.
// Which algorithm or behavior followed by Thread Scheduler we can't expect
//exactly it is the JVM vendor dependent hence in multithreading examples we
//can't expect exact execution order and exact output.

// Case 2: Difference between t.start() and t.run() methods
//  In the case of t.start() a new Thread will be created which is responsible for the
//execution of run() method.
// But in the case of t.run() no new Thread will be created and run() method will be
//executed just like a normal method by the main Thread.

// Case 3: importance of Thread class start() method.
// For every Thread the required mandatory activities like registering the Thread with
//Thread Scheduler will takes care by Thread class start() method and programmer is
//responsible just to define the job of the Thread inside run() method.
//That is start() method acts as best assistant to the programmer.
//Example:
//1. Register Thread with Thread Scheduler
//2. All other mandatory low level activities.
//3. Invoke or calling run() method.
//We can conclude that without executing Thread class start() method there is no chance
//of starting a new Thread in java. Due to this start() is considered as heart of
//multithreading.

// Case 4: If we are not overriding run() method:
// If we are not overriding run() method then Thread class run() method will be executed
//which has empty implementation and hence we won't get any output.
//It is highly recommended overriding run() method. Otherwise, don't go for multithreading concept.

// Case 5: Overloading of run() method.
// We can overload run() method but Thread class start() method always invokes no
//argument run() method the other overload run() methods we have to call explicitly then
//only it will be executed just like normal method.

// Case 6: overriding of start() method
// If we override start() method then our start() method will be executed just like a normal
//method call and no new Thread will be started.
// Entire output produced by only main Thread.
//Note : It is never recommended overriding start() method.

// case 7 call start() with super in child overriding start()

// Case 8: life cycle of the Thread:
//  Once we created a Thread object then the Thread is said to be in new state or
//born state.
// Once we call start() method then the Thread will be entered into Ready or
//Runnable state.
// If Thread Scheduler allocates CPU then the Thread will be entered into running
//state.
// Once run() method completes then the Thread will entered into dead state.

// Case 9:
//After starting a Thread we are not allowed to restart the same Thread once again
//otherwise we will get runtime exception saying "IllegalThreadStateException".

}
