package com.kiran.serialization;

import java.io.*;

public class SerializationIntro {

    // Serialization
    // 1. The process of saving (or) writing state of an object to a file is called serialization
    // 2. but strictly speaking it is the process of converting an object from java supported form to either network supported form (or) file supported form.
    // 3. By using FileOutputStream and ObjectOutputStream classes we can achieve serialization process.

   // De-Serialization:
   //  1. The process of reading state of an object from a file is called DeSerialization
    // 2. but strictly speaking it is the process of converting an object from file supported form (or) network supported form to java supported form.
    // 3. By using FileInputStream and ObjectInputStream classes we can achieve DeSerialization.
    public static void main(String args[])throws Exception{
        Dog d1=new Dog();
        System.out.println("Serialization started");
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        System.out.println("Serialization ended");
        System.out.println("Deserialization started");
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog)ois.readObject();
        System.out.println("Deserialization ended");
        System.out.println(d2.i+"................"+d2.j);
    }
}

class Dog implements Serializable
{
    int i=10;
    int j=20;

    // Note:
    //1. We can perform Serialization only for Serializable objects.
    //2. An object is said to be Serializable if and only if the corresponding class implements Serializable interface.
    //3. Serializable interface present in java.io package and does not contain any methods. It is marker interface. The required ability will be provided automatically by JVM.
    //4. We can add any no. Of objects to the file, and we can read all those objects from the file but in which order we wrote objects in the same order only the objects
    //will come back. That is order is important.
    //5. If we are trying to serialize a non-serializable object then we will get RuntimeException saying "NotSerializableException".
}
