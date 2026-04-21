package firstPackage;

public class DataType {
    static void main() {  // main is shortcut
        System.out.println("hello world!");  //sout shortcut

//        -----  PRIMITIVE DATA TYPES -----
//        integral numbers - byte < short < int < long
//        decimal numbers - float < double
//        characters- char
//        booleans - boolean

//        inki capacity ke anusaar value store krte hain

        byte byteNum = 60;
        short shortNum = 130;
        int intNum = 32000;
        long longNum = 32000000000l; // by default integral number is integer, if value is written more than integer range, then l is written in the last to tell that integer is now long type number

        System.out.println("Byte number: " + byteNum);
        System.out.println("Short number: " + shortNum);
        System.out.println("Integer number: " + intNum);
        System.out.println("Long number: " + longNum);

        System.out.println("byte min value : " + Byte.MIN_VALUE);
        System.out.println("byte max value : " + Byte.MAX_VALUE);

        System.out.println("short min value : " + Short.MIN_VALUE);
        System.out.println("short max value : " + Short.MAX_VALUE);

        System.out.println("integer min value : " + Integer.MIN_VALUE);
        System.out.println("integer max value : " + Integer.MAX_VALUE);

        System.out.println("long min value : " + Long.MIN_VALUE);
        System.out.println("long max value : " + Long.MAX_VALUE);

//        DECIMAL NUMBERS
//       both float and double can give precised value, double give more precised value than float

        float mySalary = 1000.11223344556677f; //u have to write f in the last, by default decimal value is considered as double
        double yourSalary = 1000.11223344556677;

        System.out.println("My salary in float : " + mySalary); // precision upto approx 7 decimal places
        System.out.println("My salary in double : " + yourSalary); // precision upto approx 15 decimal places

//        see precision difference, scientific notation ke liye use kiye jate h, that's why pura number print nhi hota
        float firstPrecision =   123456789012345467.63252343235433434343435f;
        double secondPrecision = 123456789012345467.63252343235433434343435;

        System.out.println("precision in float : " + firstPrecision);
        System.out.println("precision in double : " + secondPrecision);

        System.out.println("float min value : " + Float.MIN_VALUE);
        System.out.println("float max value : " + Float.MAX_VALUE);

        System.out.println("double min value : " + Double.MIN_VALUE);
        System.out.println("double max value : " + Double.MAX_VALUE);

//        CHARACTER DATA TYPE ----
        char initial = 'z';
        System.out.println("character min value : " + Character.MIN_VALUE);
        System.out.println("character max value : " + Character.MAX_VALUE);
        System.out.println((char) 10084); // heart
        char hindiChar = 2309;
        System.out.println(hindiChar);

//        standarized tareeka
        char emoji = '\u2762'; // unicode representation in hexadecimal form (0-F)
        System.out.println(emoji);

//        ASCII values (0-127)
        for(int i=0; i<128; i++){
            System.out.println((char)i); // some symbols/harcaters aren't shown, u can search ASCII tables to see all of them
        }

//        BOOLEAN DATA TYPE ---- true and false are reserve keywords
         boolean isEligible = false;
        System.out.println(isEligible);

//       WIDENING(implicit/automatic)  AND NARROWING(explicit) CONVERSION
        byte byteValue = 10; // 1 byte = 8bits so 10 will be converted into 8 bits then stored in comp
        short shortValue = byteValue; // 2bytes
        int intValue = shortValue; // 4 bytes
        long longValue = intValue; // , no error shown because long's size (8 bytes) is bigger than int, so yes it can store int value
        float floatValue = longValue; // 4 bytes, float is used to represent scientific values so it can hold larger values (like long which has 8 bytes)
        float floatValue2 = intValue; // no error, because float and int are of same size
        double doubleValue = floatValue; // 8 bytes

        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("float: " + floatValue2);
        System.out.println("double: " + doubleValue) ;

        char charValue = 'A';
        int intValueChar = charValue; // widening conversion from char to int
        float floatValueChar = charValue;
        System.out.println("char to int " + intValueChar);
        System.out.println("char to float " + floatValueChar);

        float f = 1.7f;
//      int g = f; // error shown because of loss of data, although float and int are of same data type but decimal part of float will be lost after convert into int
        int g = (int) f; // if u still want conversion, then you have to explicitly convert
        System.out.println(g);

        double doubleValueExp = 123.456;
        float floatValueExp = (float) doubleValueExp;
        long longValueExp = (long) floatValue;
        int intValueExp = (int) longValueExp;

        System.out.println("double exp: " +doubleValueExp);
        System.out.println("float exp: " +floatValueExp);
        System.out.println("long exp: " +longValueExp);
        System.out.println("int exp: " +intValueExp);

        long a = Long.MAX_VALUE; // total 64 bits - 01111111....
        System.out.println(a);
        int b = (int) a; // after casting , total 32 bits are considered - 11111...
        System.out.println(b); // 111111...(total 32 bits) is -1 in int

//      Integer is class, inside there is method toBinaryString
        System.out.println(Integer.toBinaryString(120)); // convert any number into binary, return and print a string
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));


    }
}