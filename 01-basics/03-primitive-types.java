8 Primitive Types:
boolean, byte, char, short, int, long, float, double

Java Pakages - a way to organize your java projects

public class intro{
    public static void main (String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue); //-2147483648
        System.out.println("Integer Maximum Value = " + myMaxIntValue); //2147483648
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));
        int myMaxIntTest = 2_147_483_647;
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue); //-128
        System.out.println("Byte Maximum Value = " + myMaxByteValue); //127
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue); //-32768
        System.out.println("Short Maximum Value = " + myMaxShortValue); //32768
        
        long myLongValue = 100L;  //L at the end
        long myMinShortValue = Long.MIN_VALUE; 
        long myMaxShortValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue); //-9223372036854775808
        System.out.println("Long Maximum Value = " + myMaxLongValue); //9223372036854775808
        long bigLongLiteralValue = 2_147_483_647_234L;  //need the L at the end
        System.out.println(bigLongLiteralValue); //2147483648234
    }
}

A byte occupies 8 bits and has a width of 8.
A short occupies 16 bits and has a width of 16.
A int occupies 32 bits and has a width of 32.
A long occupies 64 bits and has a width of 64.
   
    
//Casting
Casting means to treat or convert a number from one type to another
int myTotal = (myMinIntValue / 2);
byte myNewByteValue = (byte) (myMinByteValue / 2);
short myNewShortValue = (short) (myMinShortValue / 2);
  
