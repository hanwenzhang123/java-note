//Variable
variables are a way to store information in our computer
there are lots of different types of data we can define for our variable
e.g. int for integer

public class intro{
    public static void main (String[] args) {
        System.out.println("Hello World");

        int myFirstNumber = 5;
        System.out.println(myFirstNumber);
    }
}

$ javac intro.java
$ java intro


//Expressions
public class intro{
    public static void main (String[] args) {
        System.out.println("Hello World");

        int myFirstNumber = (10+5)+(2*10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
 
