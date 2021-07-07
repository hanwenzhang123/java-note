Execute a certain section of code only if a particular test evaluates to true.
  this is known as conditional logic.
Conditional logic checks a condition an dexecute certain code based on whether that condition (expression) is true or false
  
If-then rule - always use a code block
A code block allows more than one statement to be executed - a block of code

if(expression){
  //put one or more statements here
}

//code
public class Main{
    public static void main (String[] args) {
      
        boolean isAlien = false;    //assign operator, here set as false
        if (isAlien == false)   //equal operator, check/test if it is same
            System.out.println("It is not an alien!");  //print out
            System.out.println("And I am scared of aliens!");  //print out
      
        boolean isAlien = false;    
        if (isAlien == true) 
            System.out.println("It is not an alien!");  //not printing
            System.out.println("And I am scared of aliens!");  //print out
            
       boolean isAlien = false;    
        if (isAlien == true) {
            System.out.println("It is not an alien!");  //not printing
            System.out.println("And I am scared of aliens!");  //not printing
        } 
    }
}

//Ternary Operator
public class Main {

    public static void main(String[] args) {
    
        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true"); //it will print out when isCar = true
        }
    }
}
