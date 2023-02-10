package com.kiran;

public class Main {

// identifier - any name in java program, may be class, method, label
// allowed characters -> a- z, A - Z, 0-9, _, $
// start with characters -> a- z, A - Z
// case-sensitive
// no length limit -> recommended around 15 chars

// reserved words - 53
// keywords - 50
// used keywords - 48
// unused keywords - 2  goto, const
//reserved literals - 3 true, false, null

// data types
// primitive - 8  - numeric-integral byte-1, short-2, int-4, long-8 default value 0
// primitive - 8  - numeric-floating-point float-4, double-8 default value 0.0
// primitive - 8  - char datatype -char -2 -> no sign default value 0 or blank space
// primitive - 8  - boolean datatype -boolean - (no size) represent true and false state only  -> no sign default value false

// byte - 8 - bit
// max value -> +127
// min value -> -128
// range -> -128 to +127 [-2 power 7 to 2 power 7 ]
// 1+2+4+8+16+32+64 = 127 => 7 bit  remaining one bit is for sign

// literals - any content value

// escape characters  \n-new line, \t-horizontal-tab, \', \", \\-back space

// byte->short->int->long->float-> double
// why float has more precedence than long - due different storing mechanism
// char->int->long->float-> double
// boolean

// Array -> indexed collection of fixed no of homogeneous (same type only) data elements
// can represent multiple value with in same name
// fixed in size -> a problem with array can be resolved with collections

    public static void main(String[] args) {

        // declaration
//        int[] a;  // recommended
//        int[][] e;
//        int[][][] f;
    
    
        // array creation
//        int[] number = new int[-2];
//        System.out.println(number.length);
    
        // rule 1 -> at the time of creation size required, 0 is valid size
        // rule 2 -> 0 is valid
//        int[] zeroValue = new int[0];
//        System.out.println(number.length);
        // rule 3 -> no negative size (java.lang.NegativeArraySizeException)
        /*int[] number = new int[-2];
        System.out.println(number.length);*/
        // rule 4 -> allowed data types for size byte, short, char, int
//        int[] sizeOfArray = new int['a'];  // char
//        byte b = 10;
//        int[] sizeOfArray2 = new int[b];  // byte
//        short s = 20;
//        int[] sizeOfArray3 = new int[s];  // short
//        int[] sizeOfArray4 = new int[5];  // int
        // rule 5 -> max allowed size of array is int / 2147483647
//        int[] sizeOfArray5 = new int[2147483647];  // int
//        int[] sizeOfArray6 = new int[2147483648];  // invalid size
//        System.out.println(number.length);
        
        
//        int[][] multiDimenArray = new int[2][];
//        multiDimenArray[0] = new int[3];
//        multiDimenArray[1] = new int[2];
        
//        int[] defaultValueArray = new int[3];
//        defaultValueArray[0] = 10;
//        System.out.println(defaultValueArray);
//        System.out.println(defaultValueArray[0]);
//        System.out.println(defaultValueArray[1]);
//        System.out.println(defaultValueArray[2]);
        
        char[] charArray = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(charArray.length);
        System.out.println(charArray[4]);
        
        int[][] a = {{12, 24, 36}, {6, 12}};
        System.out.println(a[1][0]);
        
        // length vs length()
        // length -> final variable applicable only for arrays, represent size of array.
        // length()  -> final method applicable for string object, returns no of character in string
        
        String s = "sanjay";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println("============================");
        
        // multidimensional arrays length variable represents base size only but not total size
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1][0]);  //6
        
        
        // anonymous array/namelesss array -> array without name, we create it -> just for instant use
        // we can't specify name and size
        // new int[]{2,2,1,2,1,3,5};
    
        System.out.println("==================================");

        int[] sumThis = {10,20,30,40}; // this arrays creation is headache
        System.out.println(pleaseSum(sumThis));  // 100 -> nameless array or anonymous array
    
        System.out.println(pleaseSum(new int[]{10,20,30,40}));  // 100 -> nameless array or anonymous array
    
    
    }
    
    public static int pleaseSum(int[] x){
        int total = 0;
        for(int x1:x){
            total = total+x1;
        }
        return total;
    }
    
}
