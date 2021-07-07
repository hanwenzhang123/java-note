The string datatype is not a primitive type, it is actually a class
  A string is a sequence of characters.
  
String in Java are immutable

  //code
public class Main{
    public static void main (String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "this is a string";
        System.out.println("myString is equal to " + myString); //myString is equal to this is a string
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString); //myString is equal to this is a string, and this is more.
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString); //myString is equal to this is a string, and this is more. © 2019
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);   //250.5549.95   string
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);     //LastString is equal to 1050
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);     //LastString is equal to 1050120.47
    }
}
 
