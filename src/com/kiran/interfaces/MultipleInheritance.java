package com.kiran.interfaces;

// Class cannot extend multiple classes but class can implement multiple interface
// java doesnot support muliple inheritance -> through class
// but it support multiple inheritance through interface
// cases
// If two interfaces contain a method with same signature and same return type in the
//implementation class only one method implementation is enough.

import java.io.Serializable;

public class MultipleInheritance implements NormalInterface2, NormalInterface, Serializable {
@Override
public void wheel() {

}

@Override
public Integer wheel(int number) {
 
 return NormalInterface.x;
}

@Override
public void vehicleNumber() {

}
}