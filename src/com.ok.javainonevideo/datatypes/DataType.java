package com.ok.javainonevideo;
public class DataType{
    static void main(String[] args) {
        System.out.println("Byte Range:");
        System.out.println("-----------");
        byte a = 127;
        System. out.println("Example byte value: " + a);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);  // -128 (8 bits)
        System. out.println("Maximum byte value: " + Byte.MAX_VALUE);  // 127
        System.out.println();

        System.out.println("Short Range:");
        System.out.println("-----------");
        short b = 2;
        System. out.println("Example short value: " + b) ;
        System.out.println("Minimum short value: " + Short.MIN_VALUE) ;  // -32,768 (16 bits)
        System. out. println("Maximum short value: " + Short.MAX_VALUE) ; //32,767
        System.out.println();

        System.out.println("Integer Range:");
        System.out.println("-----------");
        int c = 3;
        System. out.println("Example integer value: " + c) ;
        System.out.println("Minimum integer value: " + Integer.MIN_VALUE); // -2^31 (32 bits)
        System.out.println("Maximum integer value: "+ Integer.MAX_VALUE); // 2^31 - 1
        System.out.println();

        System.out.println("Long Range:");
        System.out.println("-----------");
        long d = 9223372036854775807l;
        System. out.println("Example long value: " + d);
        System. out.println("Minimum long value: " + Long.MIN_VALUE);  // -2^63 (64 bits)
        System. out. println("Maximum long value: " + Long.MAX_VALUE); // 2^63 - 1
        System.out.println();

        float e = 123.456789f; // ~7 significant digits
        System. out.println("Float Examples:");
        System.out.println("-----------");
        System.out.println("Original float value: " + e) ;
        System. out.println("Smallest positive float: " + Float.MIN_VALUE);
        System. out.println("Largest positive float: " + Float. MAX_VALUE);
        System.out.println("Largest negative float: -" + Float. MAX_VALUE);
        System. out.println("Smallest negative float: -" + Float.MIN_VALUE) ;
        System.out.println();

        double f = 123.456789012345678; // ~15 significant digits
        System.out.println("Double Examples:");
        System.out.println("-----------");
        System. out.println("Original double value: " + f) ;
        System. out.println("Smallest positive double: " + Double.MIN_VALUE) ;
        System. out.println("Largest positive double: " + Double. MAX_VALUE) ;
        System. out.println("Largest negative double: -" + Double.MAX_VALUE) ;
        System. out.println("Smallest negative double: -" + Double.MIN_VALUE) ;
        System.out.println();

        boolean isAdult = false;
        isAdult = true;

        char g = '!' ;
        System.out.println("Character Ranges:");
        System.out.println("-----------");
        System. out.println("Minimum value: " + (int) Character.MIN_VALUE); // 0
        System. out.println("Maximum value: " + (int) Character.MAX_VALUE); // 65535
        // Common ASCII examples (0-127 range)
        System.out.println((char) 10084);

    }
}