package com.kiran.oops;

public class MethodHiding {

// All rules of method hiding are exactly same as overriding except the following differences.
// Both Parent and Child class methods should be static.
// Method resolution is always takes care by compiler based on reference type.
// Method hiding is also considered as compile time polymorphism (or) static polymorphism (or) early biding.


/*IIQ : In how many ways we can create an object ? (or) In
how many ways get an object in java ?
By using new Operator :
2. Test t = new Test();
By using newInstance() :(Reflection Mechanism)
4. Test t=(Test)Class.forName("Test").newInstance();
By using Clone() :
6. Test t1 = new Test();
7. Test t2 = (Test)t1.Clone();
By using Factory methods :
9. Runtime r = Runtime.getRuntime();
10. DateFormat df = DateFormat.getInstance();
By using Deserialization :
12. FileInputStream fis = new FileInputStream("abc.ser");
13. ObjectInputStream ois = new ObjectInputStream(fis);
14. Test t = (Test)ois.readObject();*/


}
