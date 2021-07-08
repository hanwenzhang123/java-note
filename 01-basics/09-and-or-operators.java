&& - and
|| - or

public class Main{
    public static void main (String[] args) {
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        
        int newValue = 50;      //assign operator = 
        if (newValue == 50) {   //equal to operator ==
            System.out.println("This is true");
        }
        
        boolean isCar = false;
        if (!isCar) {   //not equal to / opposite to -> != or !  ||  if(isCar) == true -> if(isCar)
            System.out.println("This is not supposed to happen");
        }
        
        isCar = true;
        boolean wasCar = isCar ? true : false;  //ternary operator ? :
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}

public class Main{
    public static void main (String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("My Values Total = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The Remainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("Is No Remainder = " + isNoRemainder);
        if(!isNoRemaainder) {
            System.out.println("Got some remainder");
        }
    }
}

//Summary of Operators
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
