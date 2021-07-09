//while loop syntax
while(condition) {
  //statement
}

//while loop example
int count = 1;    //init
while(count <= 5) {   //condition
  System.out.println("count= " + count);
  count++;  //increment
}

//for loop example, same as above
for(int i = 0; i <= 5; i++) {   //init; condition; increment
  System.out.println("i= " + i);
}  


//do while loop syntax
do {
  //statement
} while (condition); 


//code
public class Main {

    public static void main(String[] args) {
      
	    int count = 1;    //if count is 6, then never runs
      
       while(count != 6) {    //same as the for loop below
           System.out.println("Count value is " + count); //12345
           count++;   //if not increment, it will always run 1 and keep running not stopping
       }

       for(int count=1; count!= 6; count++) {   //same as the while loop above
           System.out.println("Count value is " + count);  //12345
       }
      
      
      count = 1;
      while(true) { //same as above, here is a while loop with a if statement and when count to 6, break the loop
        if(count == 6) {
          break;
        }
        System.out.println("Count value is " + count);
        count++;
      }
      
      
      //do while statement, do at the top then while at the last of the statement
      count = 1;
      do {   //do while execute at least once
           System.out.println("Count value was " + count);    //12345
           count++;
       } while (count != 6);
      

      //break at the 100 and starting from 7
      count = 6;
      do {
           System.out.println("Count value was " + count);
           count++;

           if(count >100) {
               break;
           }

       } while(count != 6);
      
      
      //testing using the method below
      int number = 4;
      int finishNumber = 20;
      
      while (number <= finishNumber) {    //condition first using while
        number++;                     //number increments
        if(!isEvenNumber(number)){    //run every code through the method below
          continue;   //a keyword, have the code keep going, loop continues
        }
        
        System.out.println("Even number " + number);  //print out, first 6 last 20
      }
      
      
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
      int number = 4;
      int finishNumber = 20;
      int evenNumbersFound = 0;   //start from 0
      
      while (number <= finishNumber) { 
        number++; 
        if(!isEvenNumber(number)){  
          continue; 
        }
                
        System.out.println("Even number " + number);  
        
        evenNumbersFound++;   //increase by 1 whenever we find an even number
        if(evenNumberFound >= 5){
          break;
        }
      }
      
      System.out.println("Total even numbers found = " + evenNumbersFound);
    }
  
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        if((number % 2)  == 0) {
            return true;
        } else {
            return false;
        }
    }
}
