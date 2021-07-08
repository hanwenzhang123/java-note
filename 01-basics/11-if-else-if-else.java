if then else code blocks statement
code blocks defined by curly braces {}, one or multiple statements

if(condition){   //run based on a specific condition
    // if statement block
} else if {     //test multiple conditions
    // else if statement block
} else {     //run when the condition is false, else block will be executed
    else statement block
}

//Code
public class Main{
    public static void main (String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score >1000) {
//            System.out.println("This was was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);   //2300
        }

//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if(newGameOver) {
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        score = 10000;  //only change the value so we do not need to datatype
        levelCompleted = 8; //we need datatype int when we create the variable
        bonus = 200;    //here we just change the value from the code above

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);   //11600
        }
    }
}

 
