//using methods in Java
public class Main {
    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);    //we can just use the value as long as matches 
        calculateScore(true, 1000, 8, 200);
    }
    public static void calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {   //a new method
                                //void means we do not need to return anything, if we do, just change to the datatypes
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}

//another way, same, also works
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        calculateScore(gameOver, score, levelCompleted, bonus); 

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);
    }
    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {   //a new method, return the information because the datatype int instead of void
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;  //send the data back to the method
        }  // we can put a else {return -1} or just return -1
        return -1;      //back to the code that was called at the first place
    }
}
 
in programming terms, -1 is conventionally used to indicate an error 
and
in searching algorithms -1 indicates an invalid value or a value not found
     
