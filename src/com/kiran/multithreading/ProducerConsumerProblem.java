package com.kiran.multithreading;

public class ProducerConsumerProblem {

//  Producer(producer Thread) will produce the items to the queue and
//consumer(consumer thread) will consume the items from the queue. If the queue
//is empty then consumer has to call wait() method on the queue object then it will
//entered into waiting state.
// After producing the items producer Thread call notify() method on the queue to
//give notification so that consumer Thread will get that notification and consume
//items.

// Notify vs notifyAll():
// We can use notify() method to give notification for only one Thread. If multiple
//Threads are waiting then only one Thread will get the chance and remaining
//Threads has to wait for further notification. But which Thread will be
//notify(inform) we can't expect exactly it depends on JVM.
// We can use notifyAll() method to give the notification for all waiting Threads. All
//waiting Threads will be notified and will be executed one by one, because they
//are required lock

// Note: On which object we are calling wait(), notify() and notifyAll() methods that
//corresponding object lock we have to get but not other object locks.

}
