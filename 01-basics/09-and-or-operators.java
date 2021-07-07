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
    }
}


//Summary of Operators
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
