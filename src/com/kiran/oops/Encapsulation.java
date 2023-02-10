package com.kiran.oops;

public class Encapsulation {
// Binding of data and corresponding methods into a single unit is called Encapsulation .
// If any java class follows data hiding and abstraction such type of class is said to
//be encapsulated class.
// Encapsulation=Datahiding+Abstraction

// security, enhancement, maintain and modular, flexibility to user
// disadvantage -> increase code length

// Tightly encapsulated class -> if every variable of that class declared as private

private double balance;

public double getBalance() {
 // validate user
 return balance;
}

public void setBalance(double balance) {
 // validate user
 this.balance = balance;
}


}
