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

//Ternary Operator ? :
a condition followed by a question mark ( ? ), 
then an expression to execute if the condition is truthy followed by a colon ( : ), 
and finally the expression to execute if the condition is falsy.   if-then-else
    
Syntax: variable = Expression1 ? Expression2: Expression3

//if statement
if(Expression1)
{
    variable = Expression2;
}
else
{
    variable = Expression3;
}

//example
num1 = 10;
num2 = 20;

res=(num1>num2) ? (num1+num2):(num1-num2)

Since num1<num2, 
the second operation is performed
res = num1-num2 = -10

//example
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

public class Main {

    public static void main(String[] args) {
      
      int ageOfClient = 20;
      boolean isEighteenOrOver = ageOfClient == 20 ? true : false;
    
    }
}

- ageOfClient == 20 is the condition we are checking, it needs to turn true or false
- true here is the value to assign to the variable isEighteenOrOver if the condition above is true
- false here is the value to assign to the variable isEighteenOrOver if the condition above is false
    
