package com.kiran.oops;

public class Overloading {

//Two methods are said to be overload if and only if both having the same name
//but different argument types.

//  Conclusion : In overloading compiler is responsible to perform method
//resolution(decision) based on the reference type(but not based on run time
//object). Hence overloading is also considered as compile time polymorphism(or)
//static polymorphism (or)early biding.

public void getRequiredCurrentAccount(){
 System.out.println("le current account");
}

public void getRequiredCurrentAccount(String accountNumber){
 System.out.println("le current account");
}

public void getRequiredCurrentAccount(Integer accountNumber){
 System.out.println("le current account");
}


//case 1  In overloading if compiler is unable to find the method with exact match we
//won't get any compile time error immediately

//While resolving overloaded methods exact match will always get high priority,
//While resolving overloaded methods' child class will get the more priority than parent class

// In general var-arg method will get less priority that is if no other method matched then
// only var-arg method will get chance for execution it is almost same as default case inside switch.

// In overloading method resolution is always based on reference type and runtime object
//won't play any role in overloading.

}
