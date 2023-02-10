package com.kiran.serialization;

import java.io.*;


class Animal implements Serializable
{
    static transient int i=10;
    final transient int j=20;
}

public class TransientKeyword {

    public static void main(String[] args)throws Exception {
        Animal d1 = new Animal();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Animal d2 = (Animal) ois.readObject();
        System.out.println(Animal.i + "................" + d2.j);
    }

    // 1. transient is the modifier applicable only for variables.
    // 2. While performing serialization if we don't want to save the value of a particular
    //variable to meet security constant such type of variable , then we should declare
    //that variable with "transient" keyword.
    //3. At the time of serialization JVM ignores the original value of transient variable
    //and save default value to the file .
    //4. That is transient means "not to serialize".

    // Static VsTransient
    // 1. static variable is not part of object state hence they won't participate in
    //serialization because of this declaring a static variable as transient there is no
    //use.

    //Transient Vs Final
    //  final variables will be participated into serialization directly by their values.
    //Hence declaring a final variable as transient there is no use.
    ////the compiler assign the value to final variable

    //We can serialize any no of objects to the file but in which order we serialized in the
    //same order only we have to deserialize.



}
