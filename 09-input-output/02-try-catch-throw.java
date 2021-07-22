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
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Your index is out of bounds!");
		} catch(Exception e) {  //general exception
			System.out.println("Something else went wrong!");
		}
	}
}


//Example.java
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
        try {
            x = getInt();
            y = getInt();
        } catch(NoSuchElementException e) 
            throw new ArithmeticException("no suitable input");
        }
        System.out.println("x is " + x + ", y is " + y);
        try {
            return x / y;
        } catch(ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero");
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
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9 ");
            }
        }
    }
}


//Main.java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        try {
            return s.nextInt();
        } catch(InputMismatchException e) {
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
        } catch(ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
