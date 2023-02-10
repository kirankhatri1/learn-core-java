package com.kiran.oops;

public class Coupling {

//The degree of dependency between the components is called coupling.

static int i=B.j;

}
class B extends Coupling
{
static int j=C.methodOne();
}
class C extends B
{
public static int methodOne()
{
 return D.k;
}
}
class D extends C
{
static int k=10;
public static void main(String[] args)
{
 D d=new D();
}

//It is always recommended maintaining loosely coupling between the components
}

