package com.ok.javainonevideo;
public class Conversion{
    static void main(String[] args) {
        System.out.println("Widening conversion Example:");
        System.out.println("--------------");
        byte byteValue = 10; // 1 byte // cup
        short shortValue = byteValue; // 2 bytes // glass
        int intValue = shortValue; // 4 bytes // jug
        long LongValue = intValue; // 8 bytes // bucket
        float floatValue = longValue; // 4 bytes
        double doubleValue= floatValue; // 8 bytes
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System. out.println("float: " + floatValue);
        System. out.println("double: " + doubleValue) ;
        System.out.println();

        System.out.println("Narrowing conversion Example:");
        System.out.println("--------------");
        double doubleValue2 = 123.456;
        float floatValue2 = (float) doubleValue2; // Narrowing conversion from double to float
        long longValue2 = (long) floatValue2; // Narrowing conversion from float to long
        int intValue2 = (int) longValue2; // Narrowing conversion from long to int
        System. out.println("double: " + doubleValue2);
        System. out.println("float: " + floatValue2);
        System. out.println("long: " + longValue2);
        System.out.println("int: " + intValue2) ;|
        System.out.println();

    }
}