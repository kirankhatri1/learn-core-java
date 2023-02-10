#### **Multithreading in Java**

1. Multitasking and its types
2. Introduction to Multi-threading
3. Types of multi-threading
4. Defining a thread by extending thread class and its cases
5. Defining a thread by implementing Runnable interface
6. Thread class constructor
7. Getting and setting name of a thread
8. Thread Priority
9. Methods to prevent thread execution
10. Interruption of a thread
11. Synchronization
12. Inter thread communication
13. Deadlock
14. Daemon threads
15. Java multithreading concept implementation models

#### **1. Multitasking and its types**

#### **Executing several tasks simultaneously is multi-tasking**

There are two types of multitasking

![](RackMultipart20230202-1-93s6fv_html_664ef2821c55be13.png) Multitasking

**1. Process-based multitasking**

- Executing several tasks simultaneously, where each task is a separate independent process, is called process multitasking.
- Example playing music, editing text in a text editor, downloading, and more.
- Process-based multitasking is best suited at OS level

**2. Thread-based multitasking**

- Executing several tasks simultaneously where each task is a separate independent part of the same program is nothing but thread-based multitasking and each independent part is called a thread.
- It is best suitable for the programmatic level
- Whether it is process-based or thread-based, the main objective of multitasking is to improve the performance of the system by reducing the response time.
- The main important application areas of multitasking are developing video games, multimedia graphics, animations, etc.
- Java provides inbuilt support for multitasking by introducing a rich API (Thread, Runnable, thread group, thread-local, …), being a programmer, we have to know how to use this API and we are not responsible for defining that API. Hence developing multithreading programs is very easy in java when compared with C++.

#### **2. Introduction to multithreading**

A thread is a sequence of control within a process. A single-threaded process follows a single sequence of control while executing. A Multi-threading process has several sequences of control and thus is capable of several independent actions at the same time. When multiple processors are available, those concurrent but independent actions can occur in parallel.

One of the most important benefits of Multithreading is

- Improved throughput. Many concurrent compute operations and I/O requests within a single process.
- Simultaneous and fully symmetric use of multiple processors for computation and I/O
- Superior application responsiveness. If a request can be launched on its own thread, applications do not freeze or show the "hourglass". An entire application will not block or otherwise wait, pending the completion of another request.
- Improved server responsiveness. Large or complex requests or slow clients don't block other requests for service. The overall throughput of the server is much greater.
- Minimized system resource usage. Threads impose minimal impact on system resources. Threads require less overhead to create, maintain, and manage than a traditional process.
- Program structure simplification. Threads can simplify the structure of complex applications, such as server-class and multimedia applications.
- Better communication. Thread synchronization functions can be used to provide enhanced process-to-process communication.

#### **3. Types of multithreading**

**THE WAYS TO DEFINE, INSTANTIATE AND START A NEW THREAD.**

We can define a thread in the following 2 ways:
- By extenidng thread class and by implementing Runnable interface
![](RackMultipart20230202-1-93s6fv_html_deeff28985049479.png) Multi-threading

#### **4. Defining a thread by extending thread class**

public class MyThreadDemo {

public static void main(String[] args) {

_// instantiation of thread_

ThreadDemo threadDemo = new ThreadDemo();

_// start thread_

threadDemo.start();

for (int i = 0; i \< 3; i++) {

System._out_.println("Main thread");

}

}

}

class ThreadDemo extends Thread {

_// overriding of run method must and highly recommended to override this method_

public void run() {

for (int i = 0; i \< 3; i++)

System._out_.println("child thread");

}

}

Output :

Main thread

Main thread

Main thread

child thread

child thread

child thread

**Case study:**

**Case 1:**

Thread scheduler: -

- Whenever multiple threads are waiting to get a chance for execution, which thread will get a chance first is decided by the thread scheduler whose behavior is JVM vendor dependent. Hence we can't expect exact execution order & hence exact output.
- Thread scheduler is part of JVM due to this unpredictable behavior of the thread scheduler. We can't expect the same order output for the above program.
- Note: whenever the situation comes to multi-threading the guarantee in behavior is very less. We can tell possible output but not exact output.

**Case 2 :**

- Difference between t.start() and t.run()
- In the case of t.start() a new thread will be created and that thread is responsible to execute run().
- But in the case of t.run() no new thread will be created & run method will be executed just like a normal method call.
- In the above program, if we are replacing t.start() with t.run()
- Entire output is produced by only the main thread.

**Case 3:**

- Importance of thread class start() method
- To start a thread, the required mandatory activities ( like registering thread with thread scheduler) will be performed automatically by thread class start() method, because this programmer is not responsible to perform this activity and they are just responsible to define job of the thread. Hence thread class start() plays a very important role and without executing that method there is no chance of starting a new thread.

class Thread {

start() {

1. Register this thread with thread scheduler and perform other initialization activities

2. run()

}

}

**Case 4 :**

- If we are not overriding run() method
- If we are not overriding the run() method then thread class run() will be executed which has empty implementation and hence we can't get any output.

public class MyThreadDemo {

public static void main(String[] args) {

_// instantiation of thread_

ThreadDemo threadDemo = new ThreadDemo();

_// start thread_

threadDemo.start();

}

}

class ThreadDemo extends Thread {

}

Output : no output printing

Note : it is highly recommended to override run() to define our job.

**Case 5 :**

- Overloading of run
- Overloading of run() is possible but thread class start() will always call no argument run() only, but the other run() we have to call explicitly just like a normal method call.

public class Main {

public static void main(String[] args) {

MyThread t = new MyThread(); _// instantiation of thread_

t.start(); _// starting of a thread_

}

}

class MyThread extends Thread {

public void run() {

System._out_.println("run()");

}

public void run(int i) {

System._out_.println("run(int i)");

}

}

Output : run()

**Case 6 :**

- Overriding of start()
- If we override start() then start will be executed just like a normal method call and no new thread will be created

public class MyThreadDemo {

public static void main(String[] args) {

MyThread t = new MyThread(); _// instantiation of thread_

t.start(); _// starting of a thread_

}

}

class MyThread extends Thread {

public void run() {

System._out_.println("run()");

}

public void start() {

System._out_.println("start()");

}

}

Output : start()

**Case 7 :**

class MyThread extends Thread {

public void run() {

System._out_.println("Run()");

}

public void start() {

System._out_.println("start()");

}

}

class ThreadDemo1 {

public static void main(String[] args) {

MyThread t = new MyThread(); _// instantiation of thread_

t.start(); _// starting of a thread_

System._out_.println("main method");

}

}

Output :

| **Probability 1** | **Probability 2** |
|
| --- | --- | --- |
| Start() | Main method |
|
| Main method | Start () |
|
|
|
|
|

**Case 8** :

life-cycle of a thread

![](RackMultipart20230202-1-93s6fv_html_ad3f6a4dc396814b.jpg)

- Once we create a thread object then it is said to be in a new state or born state.
- If we call the start() method then the thread will be entered into a ready or Runnable state
- If the thread scheduler allocates CPU, then the thread will be entered into a running state.
- If the run method is completed then the thread will enter into dead-state

**Case 9:**

- After starting a thread we are not allowed to restart the same thread once again otherwise we will get runTimeException saying "IllegalThreadStateException ".

Thread t = new Thread()

t.start();

.

.

t.start() R.E. "IllegalThreadStateException"

- Within the run() if we call Super.start() we will get the same runTimeException.

Note: It's never recommended to override run().

#### **5. Defining a thread by implementing a Runnable interface**

- We can define a thread even by implementing a Runnable interface also.
- Runnable Interface present in Java Language package & contains only one method **run();**

public class ThreadRunnableDemo {

public static void main(String[] args) {

ThreadRunnable tr = new ThreadRunnable();

_// create new thread and pass Runnable object to it_

Thread t = new Thread(tr);

t.start();

for (int i = 0; i \< 3; i++) {

System._out_.println("Main thread with runnable");

}

}

}

class ThreadRunnable implements Runnable{

public void run(){

for(int i=0; i\<3; i++)

System._out_.println("child thread with runnable");

}

}

Output:

Main thread with runnable

Main thread with runnable

Main thread with runnable

child thread with runnable

child thread with runnable

child thread with runnable

- we can't get exact output & we will get mixed output.

**Case study:**

| MyRunnable r = new MyRunnable(); |
| --- |
| Thread t1 = new Thread(); |
| Thread t2 = new Thread(r) |

**Case 1 :**

t1.start()

A new thread will be created which is responsible for the execution of the thread class run().

**Case 2:**

t1.run()

No new thread will be created and thread class run() will be executed just like a normal method.

**Case 3:**

t2.start()

New thread will be created which is responsible for the execution of the MyRunnable run() method.

**Case 4:**

t2.run()

No new thread will be created and MyRunnable run() will be executed just like a normal method call.

**Case 5:**

r.start()

We will get a compile-time error saying start() is not available in MyRunnable Class

**Case 6:**

r.run()

No new thread will be created and MyRunnable run() will be executed just like a normal method call.

**Best Approach to define a Thread**

- Among the two ways of defining a thread implements Runnable mechanism is recommended to use
- In the first approach, our class always extends the Thread class & hence there is no chance of extending any other class. But in the second approach, we can extend some other classes also while implementing the Runnable interface, in short, we will not miss the feature of inheritance by using the second approach.

#### **6. Thread class constructor**

Thread t = new Thread ();

Thread t = new Thread (Runnable r);

Thread t = new Thread (String name);

Thread t = new Thread (Runnable r, String name);

Thread t = new Thread (ThreadGroup t, String name);

Thread t = new Thread (ThreadGroup t, Runnable r);

Thread t = new Thread (ThreadGroup t, Runnable r, String name);

Thread t = new Thread (ThreadGroup t, Runnable r, String name, Long stack size);

#### **7. Getting and setting name of a thread**

Every thread in java has some name and may be provided by the programmer or default name generated by JVM

We can get and set name of a thread by using the following methods of thread class:

public final String getName();

public final void setName("String name");

class ThreadDemo {

public static void main(String[] args) {

System._out_.println(Thread._currentThread_().getName()); _// main_

Thread._currentThread_().setName("mesanjay");

System._out_.println(Thread._currentThread_().getName()); _//mesanjay_

}

}

Note : we can get current Thread Reference by using the method

public static Thread currentThread();

#### **8. Thread Priority**

- Every thread in java has some priority but the range of thread priorities is 1 to 10 where 1 is least and 10 is highest.
- Thread class defines the following constants to define some standard priorities.

Thread.MIN\_PRIORITY -1

Thread.NORM\_PRIORITY - 5

Thread.MAX\_PRIORITY - 10

- Thread schedular will use these priorities while allocating CPU.
- The Thread which is having highest priority will get chance first
- If two threads having same priority than we can't expect exact execution order, it depends on thread schedular.

**Default priority:**

- The default priority only for the main thread is 5, Rest all the remaining threads it will be inheriting from the parent
- Thread class defines the following 2 methods to get and set priority of a thread.

public final int getPriority();

public final void setPriority(int p);

- Value for int p should be 1 to 10 otherwise we will get IllegalArguementException

class MyThreadNew extends Thread {

public void run() {

for (int i = 0; i \< 3; i++) {

System._out_.println("child thread");

}

}

}

class ThreadPriorityDemo {

public static void main(String[] args) {

MyThreadNew t = new MyThreadNew();

System._out_.println(t.getPriority());

_// gives the default priority default 5 as main has priority 5_

t.setPriority(10); _// sets the priority 10_

t.start();

System._out_.println(t.getPriority());

for (int i = 0; i \< 10; i++) {

System._out_.println("main thread");

}

}

}

- If we comment,

t.setPriority(10);

- Then both main and child threads should have same priority of 5 and also we cant't expect exact execution order and exact output.
- With _**t.setPriority(10)**_ main thread has priority 5 and child thread has 10 priority, Therefore child thread will be executed first and then main thread

#### **9. Methods to prevent thread execution**

We can prevent thread from execution by using **yield(), join() , and sleep()** method.

#### **yield()**

- yield() method causes, to pause the current executing thread for giving the chance to remaining waiting threads of the same priority.
- If there are n waiting threads or all waiting threads have lower priority then the same thread will continue it's execution once again.

public static native void yield();

- The thread which is yielded, when it will get a chance once again execution is decided by the thread scheduler and we can't expect exactly.

class ThreadDemo extends Thread {

public void run() {

for (int i = 0; i \< 3; i++) {

Thread._yield_();

System._out_.println("child thread");

}

}

}

class ThreadYieldDemo {

public static void main(String[] args) {

_// instantiation of thread_

ThreadDemo threadDemo = new ThreadDemo();

_// starting of a thread_

threadDemo.start();

for (int i = 0; i \< 3; i++) {

System._out_.println("Main thread");

}

}

}

- If we comment Thread.yield(), then both threads will be executed simultaneously and we can't expect an exact execution order.
- With Thread.yield(), the chance of completing main thread first is high because child Thread always calls yield();

#### **join()**

If a thread wants to wait until completing some other thread then we can use join() method.

Let's assume there are three thread t1, t2, and t3.

If thread t1 executes t2.join() then t1 thread will enter into a waiting state until t2 completes, once t2 completes then t1 will continue its execution.

public final void join() throws InterruotedException

public final void join(long ms) throws InterruotedException

public final void join(long ms, int ns) throws InterruotedException

Join method is overloaded and every join() throws Interrupted Exception. So that we should handle Interrupted Exception for every use of join() either by try-catch or by throws, otherwise compile time error comes.

class MyThread1 extends Thread {

public void run() {

for (int i = 0; i \<= 10; i++) {

Thread._yield_();

System._out_.println("child thread");

try {

Thread._sleep_(5000);

} catch (InterruptedException e) {

e.printStackTrace();

}

}

}

}

class ThreadJoinDemo {

public static void main(String[] args) throws InterruptedException {

MyThread1 t = new MyThread1();

t.start();

t.join();

for (int i = 0; i \<= 10; i++) {

System._out_.println("main thread");

}

}

}

If we comment **t.join()** then both threads will be executed simultaneously and we can't expect exact execution order therefore we can't expect exact output order.

Main thread

Main thread

Main thread

child thread

child thread

child thread

child thread

child thread

child thread

child thread

child thread

child thread

child thread

child thread

If we use t.join() then the main thread will wait until completing childThread, and we can expect the output child thread followed by the main thread.

child thread

child thread

child thread

child thread

child thread

child thread

child thread

child thread

child thread

child thread

child thread

Main thread

Main thread

Main thread

**sleep()**

If a thread don't want to perform any operation for a particular amount of time

We can pause any thread for a small pause(particular amount of time) by using sleep();

Public static void sleep(long ms) throws InterruptedException

Public static void sleep(long ms, int ns) throws InterruptedException

We should handle Interrupted Exception for every use of sleep() method to avoid a compile-time error.

class ThreadSleepDemo {

public static void main(String[] args) throws InterruptedException {

System.out.println("main thread");

Thread.sleep(5000);

System.out.println("child thread");

Thread.sleep(5000);

System.out.println("again main method");

}

}

#### **Comparison table for yield(), join() , and sleep() method.**

| **Property** | **yield()** | **join()** | **sleep()** |
| --- | --- | --- | --- |
| **Purpose** | For a small pause to give the chance for the thread to have the same priority or more. | This method makes the thread wait until completing the other thread. | If we need to a thread waits for a user-defined time period |
| **static** | yes | No | Yes |
| **Is it overloaded** | No | Yes | Yes |
| **Is final** | No | Yes | No |
| **Is it throws interrupted Exception** | No | Yes | Yes |
| **Is it native method** | Yes | No | Native - sleep(long ms)Non-native - sleep(long ms, int ns) |

#### **10. Interruption of a thread**

A thread can interrupt another sleeping or waiting thread by using interrupt().

public void interrupt();

class MyThread extends Thread {

public void run() {

try {

for (int i = 0; i \<= 10; i++) {

System.out.println("lazy thread");

Thread.sleep(5000);

}

} catch (Exception e) {

e.printStackTrace();

System.out.println("got interrupted");

}

}

}

class ThreadInterruptedDemo {

public static void main(String[] args) {

MyThread t = new MyThread();

t.start();

t.interrupt();

System.out.println("end of main thread");

}

}

With **t.interrupt()**, main thread interrupts the child thread raises Interrupted Exception

Output will be (for this case)

End of main thread

End of main thread

End of main thread

lazy thread

got interrupted

java.lang.InterruptedException: sleep interrupted

at java.lang.Thread.sleep(Native Method)

at // some address here

If we comment **t.interrupt()** then main thread won't interrupt child thread and both threads will be executed until completion and output will be

End of main thread

End of main thread

End of main thread

lazy thread

lazy thread

lazy thread

lazy thread

lazy thread

lazy thread

lazy thread

lazy thread

lazy thread

lazy thread

lazy thread

One more Example

class ThreadDemo extends Thread {

public void run() {

try {

for (int i = 0; i \<= 10; i++) {

System.out.println("lazy thread");

Thread.sleep(1000);

}

} catch (Exception e) {

e.printStackTrace();

System.out.println("got interrupted");

}

}

}

class ThreadInterruptedDemo {

public static void main(String[] args) {

ThreadDemo threadDemo = new ThreadDemo(); // instantiation of thread

Thread.sleep(5000);

threadDemo.start(); // starting of a thread

threadDemo.interrupt();

for (int i = 0; i \< 3; i++) {

Thread.sleep(1000);

System.out.println("End of main thread");

}

}

}

Output:

java.lang.InterruptedException: sleep interrupted

at java.lang.Thread.sleep(Native Method)

at com.edigitalnepal.sms.controllers.ThreadDemo.run(MyThreadController.java:62)

lazy thread

got interrupted

End of main thread

End of main thread

End of main thread

We may not see the impact of interrupt calls immediately.

When we call **interrupt()** method, if the target thread is not in sleeping or waiting state then there is no impact immediately interrupt call will wait until thread enters into sleeping or waiting state. Once the target thread enters into sleeping or waiting state the interrupt call will impact the target thread.

#### **11.**  **Synchronization**

- Synchronized is the modifier applicable only for methods and blocks, we can't apply this for classes and variables.
- If a method or block is declared as synchronized then at a time only one thread is allowed to execute that method or block on the given object.
- The main advantage of synchronized keywords is we can resolve data inconsistency problems.

Inconsistency Problems

When multiple threads need access to the same shared resources, there is some loss of data, and is data inconsistency problem can be solved by synchronization.

more on **Memory Consistency Errors** : https://docs.oracle.com/javase/tutorial/essential/concurrency/memconsist.html

- The main limitation of synchronized keywords is it increases the waiting time of the threads and affects the performance of the system. Therefore if there is no specific requirement, it's never recommended to use synchronized keywords.
- Every object in java has a unique lock synchronization concept internally implemented by using this lock concept. Whenever we are using synchronization then only the synchronized method on the given object, first it has to get the lock of the object. Once a thread gets a lock then it is allowed to execute any synchronized method on that object.
- Once the synchronized method completes then automatically the lock will be released.
- While a thread executes any synchronized method on the given object the remaining threads are not allowed to execute any synchronized method on the given object simultaneously, and remaining threads are allowed to execute any non-synchronized methods simultaneously (lock concept is implemented based on an object only).

Example :

package com.company;

class Display {

public synchronized void wish(String name) {

for (int i = 0; i \< 5; i++) {

System.out.println("Good morning");

try {

Thread.sleep(3000);

} catch (InterruptedException e) {

e.printStackTrace();

System.out.println(name);

}

}

}

}

class MyThread extends Thread {

Display d;

String name;

MyThread(Display d, String name) {

this.d = d;

this.name = name;

}

public void run() {

d.wish(name);

}

}

class SynchronizedDemo {

public static void main(String[] args) {

Display d1 = new Display();

Display d2 = new Display();

MyThread t1 = new MyThread(d1, "sanju");

MyThread t2 = new MyThread(d2, "sanjay");

t1.start();

t2.start();

}

}

If we are not declaring wish() as synchronized then both threads will be executed simultaneously and we can't expect exact output we will get irregular output

Output :

Good morning

Good morning

Good morning

Good morning

Good morning

Good morning

Good morning

Good morning

Good morning

Good morning

Process finished with exit code 0

If we declare wish() as synchronized then threads will be executed one by one so that we will get regular output.

Output :

Good morning

Good morning

Good morning

Good morning

Good morning

Good morning

Good morning

Good morning

Good morning

Good morning

Process finished with exit code 0

Case Study :

Display d1 = new Display();

Display d2 = new Display();

MyThread t1 = new MyThread(d1, "sanju");

MyThread t2 = new MyThread(d2, "sanjay");

t1.start();

t2.start();

- Even Though wish() is synchronized we will get irregular output in this case, because the threads are operating different objects because -
- When multiple threads are operating on the same object then only synchronization plays the role. If multiple threads are operating on multiple objects then there is no impact of synchronization.

#### _ **Class Level lock** _

- Every class in Java has a unique lock.
- If a thread wants to execute a static synchronized method then it requires a class-level lock.
- While a thread executing a static synchronized method the remaining threads are not allowed to execute any static synchronized method of that class simultaneously but remaining threads are allowed to execute the following methods simultaneously.

Normal static methods

Normal instance methods

Synchronized instance methods

There is no link between the object-level lock and class-level lock both are independent of each other.

A class-level lock is different and an object-level lock is different.

#### _ **Synchronized block** _

- If very few lines of code require synchronization then it is never recommended to declare the entire method as synchronized, we have to declare those few lines of code inside the synchronized block.
- The main advantage of the synchronized block over the synchronized method is, that it reduces the waiting time of the threads and improves the performance of the system.

ex

- We can declare synchronized blocks to get the current object lock as follows.

synchronized (this){

…..

…..

}

- If the thread got a lock of the current object then only it is allowed to execute this block.

Ex2

- To get a lock of a particular object b we can declare a synchronized block as follows:

synchronized (b){

…..

…..

}

- If the thread gets a lock of 'b' then only it is allowed to execute that block.

Ex3

- To get class level lock we can declare synchronized block as follows:

synchronized (classname.class){

…..

…..

}

- If thread got class level lock of className(ex display) class then only it is allowed to execute that block.

Ex 4

- Synchronized block concept is applicable only for objects and classes but not for primitives otherwise we will get compile-time error.

Int x = 10;

synchronized(x){

}

C.E. unexpected type found int required reference

- Every object in java has a unique lock, but a thread can acquire more than one lock at a time (from different objects)

Ex

class x{

Syn m1(){

---

----

Y y = new Y();

y.m2();

}

}

class y{

Syn m2(){

---

---

}

}

#### **12. Inter thread communication**

- Two threads will communicate with each other by using wait(), notify(), notifyAll(). Thread which requires updating has to call wait(). The thread which is responsible to update it has to call notify().
- wait(), notify(), and notifyAll() are available in object class but not in thread class because threads are required to call these methods on any shared object.
- If a thread wants to call wait(), notify(), and notifyAll() compulsory the thread should be the owner of the object that is thread has to get lock of that object that is the thread should be in the synchronized area.
- Hence we can call wait(), notify(), notifyAll() only from synchronized, otherwise we will get runTimeException.
- If a thread calls wait() method it releases the lock immediately and enters into the waiting state. Thread releases the lock of only current objects but not all locks. After calling notify() and notifyAll(), thread releases the lock but may not immediately except these wait(), notify(), and notifyAll() there is no other case where thread releases the lock.

Public final void wait() throws IE

Public final native void wait(long ms) throws IE

Public final void wait(long ms, int ns) throws IE

Public final naive void notify()

Public final native void notifyAll()

package com.company;

class ThreadA {

public static void main(String[] args) throws InterruptedException {

ThreadB b = new ThreadB();

b.start();

Thread.sleep(1000);

synchronized (b) {

System.out.println("main thread is trying to call wait()");

//b.wait(); // b.wait(1000)

System.out.println("main thread got notification");

System.out.println(b.total);

}

}

}

class ThreadB extends Thread {

int total = 0;

public void run() {

synchronized (this) {

System.out.println("child thread starts notification");

for (int i = 0; i \< 100; i++) {

total = total + i;

}

System.out.println("child thread trying to give notification");

this.notify();

}

}

}

Output

child thread starts notification

child thread trying to give notification

main thread is trying to call wait()

main thread got notification

4950

notify() vs notifyAll

We can use notify() to notify only one waiting thread but which one we will not get exactly but notifyAll() will notify all waiting threads.

#### **13. Deadlock**

- If two threads are waiting for each other for ever, such type of situation is called deadlock
- There are no resolution techniques for deadlock but several prevention techniques are possible.

class A {

public synchronized void foo(B b){

System.out.println("Thread1 starts execution of foo() method");

try {

Thread.sleep(1000);

} catch (InterruptedException e) {

e.printStackTrace();

}

System.out.println("Thread1 trying to call b's last()");

B.last();

}

public synchronized void last(){

System.out.println("inside a this is last()");

}}

class B{

public synchronized void bar(A a){

System.out.println("Thread2 starts execution of bar() method");

try {

Thread.sleep(5000);

} catch (InterruptedException e) {

e.printStackTrace();

}

System.out.println("Thread2 trying to call a's last()");

a.last();

}

public static synchronized void last(){

System.out.println("inside B this is last");

}

}

class Deadlock extends Thread {

A a = new A();

B b = new B();

Deadlock() {

this.start();

a.foo(b); // executed by main thread

}

public void run() {

b.bar(a); // executed by child thread

}

public static void main(String[] args) {

new Deadlock();

}

}

Output :

Thread1 starts execution of foo() method

Thread2 starts execution of bar() method

Thread1 trying to call b's last()

inside B this is last

Thread2 trying to call a's last()

inside a this is last()

Process finished with exit code 0

Reason for deadlock: synchronized keyword is the only reason for deadlock

#### _ **Deadlock vs starvation** _

- In the case of deadlock waiting never ends
- A long waiting of a thread which ends at certain point of time is called starvation

#### **14. Daemon thread**

- The thread that is executing in the background are called daemon threads ex. garbage Collector
- The main objective of daemon threads is to provide support for non-daemon threads.
- After the completion task of the non-daemon thread all daemon threads automatically terminated.

Check daemon thread - isDaemon()

Public final boolean isDaemon()

We can change the Daemon nature of a thread by using setDaemon()

Public final void setDaemon(boolean b)

- We can change the Daemon nature of a thread before starting only. After starting gives runtime exception - IllegalThreadStateExceptionmain thread is always a non-daemon thread & it's not possible to change its Daemon nature.

#### _ **Default nature** _

- By default main thread is always non-daemon but all the remaining threads are Daemon in nature and will be inherited from parent to child
- When the last non-daemon thread terminates all the daemon threads will be terminated automatically.

Ex.

class MyThread extends Thread {

public void run() {

for (int i = 0; i \< 100; i++) {

System.out.println("lazy thread");

try {

Thread.sleep(2000);

} catch (InterruptedException e) {

e.printStackTrace();

}

}

}

}

class Test {

public static void main(String[] args) {

MyThread t = new MyThread();

t.setDaemon(true);

t.start();

System.out.println("end of main");

}

}

Output :

end of main

lazy thread

Process finished with exit code 0

- Without t.setDaemon(true) both threads are non-daemon and hence both will be executed until their completion.
- With t.setDaemon(true) the main thread is non-daemon and the child thread is daemon. Hence when the main thread terminates automatically child thread will be terminated.

#### _ **How to kill a thread** _

- A thread can stop or kill another thread by using the stop() method then automatically running the thread will be entered into a dead state. It is a deprecated method not recommended to use

**public void stop();**

#### _ **Suspending and resuming a thread** _

- A thread can be suspended another thread by using suspend()
- A thread can resume a suspended thread by using resume()
- Deprecated, not recommended to use.

#### **15. Java multi-threading concept implementation models:**

Green Thread model - Thread completely managed by only JVM, without taking OS support. Only SUN Solaris OS provides support for the green thread modal. Now, this modal is deprecated, and not recommended to use.

**Native OS model** - The thread managed by JVM with the help of underlying OS, is called the native OS model. All Windows-based OS provides support for native OS modal.

Thank you.