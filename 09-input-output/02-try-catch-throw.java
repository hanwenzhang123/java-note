//Try Catch Java Tutorial - handle exception
//1
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int [] a = {1, 2, 3};
            System.out.println(a[3]);
        } catch(Exception e) {
            System.out.println("Exception");
        }
    }
}

//2
public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite Number?")
        try {
            int n = scan.nextInt();
            System.out.println(n);
        } catch(Exception e) {
            System.out.println("Sorry please enter an number");     // a friendly reminder
        }
    }
}

//3
public class TryCatchExamples {
	public static void main(String[] args) {
		try {
			int[] a = {4};
			System.out.println(a[1]);   //null pointer exception
		} catch(NullPointerException e) {       //different type of the exceptions
			System.out.println("Your array is null!");
		} catch(ArrayIndexOutOfBoundsException e) {	//more specific ones
			System.out.println("Your index is out of bounds!");
		} catch(Exception e) {  //general exception
			System.out.println("Something else went wrong!");
		}
	}
}


//Example.java
//throw: declare an exception which might get thrown by the function while executing the code
//allows the compiler to help you write code that handles this type of error, but it does not prevent the abnormal termination of the program
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x, y;
        try {	//try is block scope, so we declare x and y data type outside the try block
            x = getInt();
            y = getInt();
        } catch(NoSuchElementException e) 		//catch block should be as simple as possible
            throw new ArithmeticException("no suitable input");		//the message on the terminal
        }
        System.out.println("x is " + x + ", y is " + y);
        try {
            return x / y;
        } catch(ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero");	//throw the exception, red messages
        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while(true) {
            try {			
                return s.nextInt();
            } catch(InputMismatchException e) {
                // go round again.  Read past the end of line in the input first
                s.nextLine();	//read the next line
                System.out.println("Please enter a number using only the digits 0 to 9 ");
            }
        }
    }
}
  
