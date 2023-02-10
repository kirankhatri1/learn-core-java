package com.kiran.multithreading;

public class DaemonThreads {

// The Threads which are executing in the background are called daemon Threads.
//The main objective of daemon Threads is to provide support for non-daemon Threads
//like main Thread.

// Example:
//Garbage collector
// When ever the program runs with low memory the JVM will execute Garbage Collector
//to provide free memory. So that the main Thread can continue it's execution.
// We can check whether the Thread is daemon or not by using isDaemon() method
//of Thread class.
//public final boolean isDaemon();
// We can change daemon nature of a Thread by using setDaemon () method.
//public final void setDaemon(boolean b);
// But we can change daemon nature before starting Thread only. That is after
//starting the Thread if we are trying to change the daemon nature we will get R.E
//saying IllegalThreadStateException.
// Default Nature : Main Thread is always non daemon and we can't change its
//daemon nature because it's already started at the beginning only.
// Main Thread is always non daemon and for the remaining Threads daemon
//nature will be inheriting from parent to child that is if the parent is daemon child
//is also daemon and if the parent is non daemon then child is also non daemon.
// Whenever the last non daemon Thread terminates automatically all daemon
//Threads will be terminated.

//Lazy thread
// If we are commenting line 1 then both main and child Threads are non daemon
//and hence both will be executed until they completion.
// If we are not commenting line 1 then main Thread is non daemon and child
//Thread is daemon and hence whenever main Thread terminates automatically
//child Thread will be terminated.

// Deadlock vs Starvation:
// A long waiting of a Thread which never ends is called deadlock.
// A long waiting of a Thread which ends at certain point is called starvation.
// A low priority Thread has to wait until completing all high priority Threads.
// This long waiting of Thread which ends at certain point is called starvation.

//How to kill a Thread in the middle of the line?
// We can call stop() method to stop a Thread in the middle then it will be entered
//into dead state immediately.
//public final void stop();
// stop() method has been deprecated and hence not recommended to use.

//suspend and resume methods:
// A Thread can suspend another Thread by using suspend() method then that
//Thread will be paused temporarily.
// A Thread can resume a suspended Thread by using resume() method then
//suspended Thread will continue its execution.
//1. public final void suspend();
//2. public final void resume();
// Both methods are deprecated and not recommended to use.

// RACE condition:
//Executing multiple Threads simultaneously and causing data inconsistency problems is
//nothing but Race condition
//we can resolve race condition by using synchronized keyword.

//ThreadGroup:
//Based on functionality we can group threads as a single unit which is nothing but
//ThreadGroup.
//ThreadGroup provides a convenient way to perform common operations for all threads
//belongs to a perticular group.
//We can create a ThreadGroup by using the following constructors
//ThreadGroup g=new ThreadGroup(String gName);
//We can attach a Thread to the ThreadGroup by using the following constructor of
//Thread class
//Thread t=new Thread(ThreadGroup g, String name);


// GreenThread:
//Java multiThreading concept is implementing by using the following 2 methods :
//1. GreenThread Model
//2. Native OS Model
//GreenThread Model
//The threads which are managed completely by JVM without taking support for
//underlying OS, such type of threads are called Green Threads.
//Native OS Model
// The Threads which are managed with the help of underlying OS are called
//Native Threads.
// Windows based OS provide support for Native OS Model
// Very few OS like SunSolaries provide support for GreenThread Model
// Anyway GreenThread model is deprecated and not recommended to use.

}
