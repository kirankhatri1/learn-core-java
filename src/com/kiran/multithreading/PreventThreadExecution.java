package com.kiran.multithreading;

public class PreventThreadExecution {

// We can prevent(stop) a Thread execution by using the following methods.

// 1. yield();
//2. join();
//3. sleep();

// yield():
// 1. yield() method causes "to pause current executing Thread for giving the chance
//of remaining waiting Threads of same priority".
//2. If all waiting Threads have the low priority or if there is no waiting Threads then
//the same Thread will be continued its execution.
//3. If several waiting Threads with same priority available then we can't expect
//exact which Thread will get chance for execution.
//4. The Thread which is yielded when it get chance once again for execution is
//depends on mercy of the Thread scheduler.
//5. public static native void yield();

// Join()
// If a Thread wants to wait until completing some other Thread then we should go for
//join() method.
//Example: If a Thread t1 executes t2.join() then t1 should go for waiting state until
//completing t2.

//1. public final void join()throws InterruptedException
//2. public final void join(long ms) throws InterruptedException
//3. public final void join(long ms,int ns) throws InterruptedException

// Every join() method throws InterruptedException, which is checked exception hence
//compulsory we should handle either by try catch or by throws' keyword.
//Otherwise, we will get complete error.
//  If we are commenting line 1 then both Threads will be executed simultaneously,
//and we can't expect exact execution order.
// If we are not commenting line 1 then main Thread will wait until completing
//child Thread in this the output is sita Thread 5 times followed by Rama Thread 5
//times.

//Sleep() method:
// If a Thread don't want to perform any operation for a particular amount of time then
//we should go for sleep() method.
//1. public static native void sleep(long ms) throws InterruptedException
//2. public static void sleep(long ms,int ns)throws InterruptedException
}
