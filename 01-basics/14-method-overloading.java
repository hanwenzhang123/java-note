//Method overloading is a feature that allows us to have more than one method with the same name, as long as we use different parameters

public class Main{
    public static void main (String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);   //when type calculateScore will appear 2 methods
    //  calculateScore(100, 100);   //error, because what we created, the first one needs to be string
    //  calculateScore(100, 100);   //error, we never created the one with three int
        calculateScore(); 
    }
    public static int calculateScore(String playerName, int score){ //what is inside the parameter is important to distinguish overloading
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){ //overloading, same method name, change the parameter
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){ //nothing in the parameter
        System.out.println("No player name, no player score.");
        return 0;
    }
}

//we can use same name which will be easier to remember for a similar pattern of code
