package com.kiran.modifier;

public class StaticModifier {

// APPLICABLE FOR METHODS, VARIABLES, AND BLOCKS
// also allowed for inner classes but not for TOP level classes

// static methods
// case 1 -> overload concept is applicable
// case 1 -> inheritance concept is applicable

static int a = 10;
int b = 20;

public static void main(String[] args) {
 StaticModifier staticModifier = new StaticModifier();
 staticModifier.a= 100;
 staticModifier.b = 200;
 
 StaticModifier staticModifier2 = new StaticModifier();
 System.out.println(staticModifier2.a +" "+ staticModifier.b);
}


}
