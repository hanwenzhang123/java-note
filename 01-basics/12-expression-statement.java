//keywords and expressions
//List of Java keywords - 50 reserved words - https://en.wikipedia.org/wiki/List_of_Java_keywords
//expression are built with values, variables, operators, and method calls

public class Main{
    public static void main (String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);   //everything else besides the datatype double is an expression
        int highScore = 50; //highScore = 50 - expression

        if(highScore == 50) {   //highScore == 50 - expression
            System.out.println("This is an expression.");   //This is an expression - expression
        }
        
        int score = 100;    //expression
        if (score > 99) {   //expression
            System.out.println("You got the high score!");  //You got the high score - expression
            score = 0;  //expression
        }

        //Statements, whitespace and indentation(code organization)
        //You can put on the same line or different lines
        //spaces do not matter in Java, Java ignores whitespace, and looks for ;
        //indentation is the flow of the code, you can reformat the code in IDLE
        int myVariable = 50;
        if (myVariable == 50) {
            System.out.println("Printed");
        }
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                        " another" +
                        " still more.");
    }
}
 
