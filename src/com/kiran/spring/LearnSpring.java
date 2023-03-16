package com.kiran.spring;

import java.lang.String.*;

public class LearnSpring {

    // an object that represents a number of character values

    public static void main(String[] args) {

/*        String str = "Name";
        char[] data = {'N', 'a', 'm', 'e'};

        String s = new String(data);
        System.out.println(s);
        System.out.println("----------------------------");
        System.out.println(str);*/

/*      String nameValue = "Kiran";
        nameValue.concat("Software");
        System.out.println(nameValue);*/

//        String name = new String ("hello");
//        name.concat("one");
//        System.out.println(name);

/*        StringBuffer sb = new StringBuffer("mesanjay");
        sb.append("software");
        System.out.println(sb);*/

/*        String s1 = new String("mesanjay");
        String s2 = new String("mesanjay");

        System.out.println(s1 == s2);  //
        System.out.println(s1.equals(s2)); // equals() comes from string class*/

/*        StringBuffer sb = new StringBuffer("kiran");
        StringBuffer sb1 = new StringBuffer("kiran");
        System.out.println(sb == sb1);  //
        System.out.println(sb.equals(sb1));  // equals() comes from object class*/

/*        StringBuffer sb = new StringBuffer("kiran");
        StringBuilder sbl = new StringBuilder("kiran");
        String s1 = new String("mesnjay");
        String s2 = new String("mesnjay");
        String s5 = new String(sb);
        String s6 = new String(sbl);

        String s3 = "mesanjay";
        String s4 = "mesanjay";*/

//        heap -> s1, s2;
//        scp -> s2, s3, s4;

        String s = "Kiran";
        String s1 = "kiran";
        System.out.println(s.charAt(3));
        s = s.concat("khatri"); // replace  s = s + “khatri”;  runtime method
        System.out.println(s);
        System.out.println(s.equals(s1));  //
        System.out.println(s.equalsIgnoreCase(s1));  //
        System.out.println(s.isEmpty());  //
        System.out.println(s.length());  //
        System.out.println(s.replace('K', 'M'));  //
        System.out.println(s.substring(3));  //  an
        System.out.println(s.substring(3, 4));  //  an
        System.out.println(s.indexOf('a'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim()); // removes blank space present at begging or end


    }

}
