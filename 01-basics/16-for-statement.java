for statement is often referred to as the for loop and the idea is that it repeatedly loop something until a condition is satisfied 
when I say repeatedly loops its processing a certain amount of code a code block 
in other words a given number of times or until a particular condition is satisfied

for(init; termination; increment) {
        
}

//Code
public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i))); //format it to the 2 decimal points after .
        }

        System.out.println("****************");

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        for(int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count = 0;      //declare initial starting number
        for(int i=10; i<50; i++) {      //for loop
            if(isPrime(i)) {    //check the method if it is a prime
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;      //break exists the for loop completely to stop it running
                }
            }
        }
    }

    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint:  Use the break; statement to exit

    public static boolean isPrime(int n) {  //method to check if it is prime number
        if(n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {    //method
        return(amount *(interestRate/100));
    }
}
