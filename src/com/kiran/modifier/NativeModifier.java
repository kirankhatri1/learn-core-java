package com.kiran.modifier;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class NativeModifier {

// applicable only for methods
// non java methods are native methods
// to improve performance
// to use legacy code
// to achieve machine level communication
// pseudocode to use native keyword

// synchronized
// for methods and blocks - only one thread is allow executing
// solve data inconsistency problem
//disadvantage is increases waiting time for thread
// no specific requirement -> not recommended

// transient  - ( meaning not to serialize )
// only for variable
// not use with final and static

// volatile modifier
// only for variable
// if value of variable keeps on changing -> declare variable as volatile
// after finalizing the value of variable -> final value will be updated in master copy
// advantage -> resolve data inconsistency
// outdated

// conclusions
//The Only Applicable Modifiers for Constructors are public, private, protected, and <default>.
//The Only Applicable Modifiers for Local Variable is final.
//The Only Modifier which is applicable for Classes but Not for Interfaces is final.
//The Modifiers which are Applicable for Classes but Not for enum are final and abstract.
//The Modifiers which are Applicable for Inner Classes but Not for Outer Classes are public, protected, and static.
//The Only Modifier which is Applicable for Methods is native.
//The Modifiers which are Applicable for Variables are transient and volatile.

// note
//The modifiers which are applicable for inner classes but not for outer classes are private, protected, static.
//The modifiers which are applicable only for methods native.
//The modifiers which are applicable only for variables transient and volatile.
//The modifiers which are applicable for constructor public, private, protected, default.
//The only applicable modifier for local variables is final.
//The modifiers which are applicable for classes but not for enums are final , abstract.
//The modifiers which are applicable for classes but not for interface are final.



public static void main(String[] args) throws NoSuchFieldException, SecurityException {
 Field field = SampleClass.class.getDeclaredField("sampleField");
 System.out.println(Modifier.isNative(field.getModifiers()));
}

}


class SampleClass {
private String sampleField;

public final String getSampleField() {
 return sampleField;
}

public void setSampleField(String sampleField) {
 this.sampleField = sampleField;
}
}