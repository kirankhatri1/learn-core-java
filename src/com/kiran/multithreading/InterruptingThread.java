package com.kiran.multithreading;

public class InterruptingThread {

// How a Thread can interrupt another thread ?
//If a Thread can interrupt a sleeping or waiting Thread by using interrupt()(break off)
//method of Thread class.
//public void interrupt();

//  If we are commenting line 1 then main Thread won't interrupt child Thread and
//hence child Thread will be continued until its completion.
// If we are not commenting line 1 then main Thread interrupts child Thread and
//hence child Thread won't be continued until its completion in this case the output is

// Note:
// Whenever we are calling interrupt() method we may not see the effect
//immediately, if the target Thread is in sleeping or waiting state it will be
//interrupted immediately.
// If the target Thread is not in sleeping or waiting state then interrupt call will
//wait until target Thread will enter into sleeping or waiting state. Once target
//Thread entered into sleeping or waiting state it will effect immediately.
// In its lifetime if the target Thread never entered into sleeping or waiting state
//then there is no impact of interrupt call simply interrupt call will be wasted.

}
