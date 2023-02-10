package com.kiran.multithreading;

public class InterThreadCommunication {

//  Two Threads can communicate with each other by using wait(), notify() and notifyAll() methods.
// The Thread which is required update it has to call wait() method on the
//required object then immediately the Thread will entered into waiting state.
//The Thread which is performing updation of object, it is responsible to give
//notification by calling notify() method.
//After getting notification the waiting Thread will get those updations.
//  wait(), notify() and notifyAll() methods are available in Object class but not in
//Thread class because Thread can call these methods on any common object.
// To call wait(), notify() and notifyAll() methods compulsory the current Thread
//should be owner of that object
//i.e., current Thread should has lock of that object
//i.e., current Thread should be in synchronized area. Hence we can call wait(),
//notify() and notifyAll() methods only from synchronized area otherwise we will
//get runtime exception saying IllegalMonitorStateException.
// Once a Thread calls wait() method on the given object 1st it releases the lock of
//that object immediately and entered into waiting state.
// Once a Thread calls notify() (or) notifyAll() methods it releases the lock of that
//object but may not immediately.
// Except these (wait(),notify(),notifyAll()) methods there is no other place(method)
//where the lock release will be happen.
//  Once a Thread calls wait(), notify(), notifyAll() methods on any object then it
//releases the lock of that particular object but not all locks it has.
//1. public final void wait()throws InterruptedException
//2. public final native void wait(long ms)throws InterruptedException
//3. public final void wait(long ms,int ns)throws InterruptedException
//4. public final native void notify()
//5. public final void notifyAll()

}
