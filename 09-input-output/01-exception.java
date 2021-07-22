Dealing with exceptions
LBYL and EAFP
- look before you leap
- easy to ask for forgiveness than permission

//Stack Trace and Call Stack
exception - an event which occured during the execution of a program that disrupts the normal flow of the program instruction
we better to catch a specific exception ranther just generalizing

//2 types of exception
-checked exceptions
-unchecked exceptions
checked exceptions are checked at compile-time while unchecked exceptions are checked at runtime.


//Example.java
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        return s.nextInt();
    }
}


//Main.java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x, y)); //0
//        System.out.println(divideEAFP(x, y)); //0
//        System.out.println(divide(x, y)); //system crashed, 98/0 - not a number
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getInt() {       //not handle exception, system will crash if exception raised
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {   //for each if it is a number
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() {   //using exception, less code
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        try {                   //you can put as much code as you need within the try block
            return s.nextInt();
        } catch(InputMismatchException e) { //catch the error   //just catch(Exception e) works too but on a general side
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x / y;   
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch(ArithmeticException e) {    //catch the error, we would want to catch a specific exception than a general one
            return 0;
        }
    }

    private static int divide(int x, int y) {   //not handle exception, system will crash if exception raised
        return x / y;
    }
}
