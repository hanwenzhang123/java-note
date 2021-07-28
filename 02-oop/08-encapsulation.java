encapsulation 
the mechanism that allows you restrict access to certain components in the objects that you are creating
you are able to protect the members of a class from external access to guard against unauthorized access
we can change variable names at anytimes without affecting any other code, we set a different name at the parameter
  we protect it from external access to the field directly
  
Encapsulation is a technique used to keep implementation details hidden from other classes. Its aim is to create small bundles of logic.
  
//Main.java
    public static void main(String[] args) {
//	      Player player = new Player();
//        player.name = "Tim";  //we are able to set the value because we set it as public in the Player class
////      player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());    //10
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health =  " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}


//EnhancedPlayer.java
public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100;  //default starting 100, we protect it from external access to the field directly
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) { //set health here and not to worry about the hitPoints in the field
        this.name = name;

        if(health >0 && health <= 100) {  //only set when its within the range; otherwise default value 100
            this.hitPoints = health;  //update it
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {  //getter for health
        return hitPoints;
    }
}


//Player.java (does not use encapsulation) - replaced with the enhance one
// public class Player {

//     public String fullName;
//     public int health;
//     public String weapon;

//     public void loseHealth(int damage) {
//         this.health = this.health - damage;
//         if(this.health <=0) {
//             System.out.println("Player knocked out");
//             // Reduce number of lives remaining for the player
//         }
//     }

//     public int healthRemaining() {
//         return this.health;
//     }
// }
