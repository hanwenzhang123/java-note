This is object-oriented programming because programs are built around objects and their interactions. 
  An object contains state and behavior.
state - stores its sate in fields - variables
behavior - methods

class as a template or a blueprint for creating objects
give objects state through instance fields. 
An instance is the thing itself.

public/private - access modifier
private - you can not access that variable outside of the code block
  //always go with private inside the class
Local variables can only be used within the scope that they were defined in.

//this
The this keyword is a reference to the current object. 
Use this. when referring to an instance variable.
  The this keyword can be used to designate the difference between instance variables and local variables.
  The this keyword can be used to call methods when writing classes.

//main()
Java main method is the entry point of any java program. You must have a main method in each program as the accessing point.
  Its syntax is always public static void main(String[] args). 
  
public class Main {} - a statement which creates a new class in java.
  A class is the set of instructions that describe how an instance can behave and what information it contains.
 Each Java program must contain at least one class.
 The main() method is automatically run when thee .class file is executed.

//Car.java

public class Car {
  
    //template of a car (state - field), here are field
    //private means not to allow the variable access to it outside of this class, which public allows
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

  //create a public accessable method
  public void setModel(String model) {  //setter
    String validModel = model.toLowerCase();  //validate all cases
    if(validModel.equals("carrera") || validModel.equals("commodore")) {  //set the rule to update
        this.model = model; //using this keyword to refer to the specific field, then update with the contents of parameter that was paassed
    } else {
        this.model = "Unknown";
    }
  } 
  
  public getModel(String model) {  //getter
    return this.model; //no need that void since we return something back to the method
  }
}


//Main.java
//build an object based on the car blueprint

public class Main {

    public static void main(String[] args) {
      Car porsche = new Car();  //build an object based on the car blueprint template
      Car holden = new Car();  //use the Car class we created, need the new keyword for any new object
//    porsche.model = "Carrera";  //using method with a dot '.', model changed to public in Car class so we can access to it
      porsche.setModel("Carrera");    //we update using the public method instead of accessing to the field directly
      System.out.println("Model is " + porsche.getModel()); //the getter method
      porsche.setModel("911");
      System.out.println("Model is " + porsche.getModel()); //unknown 
    
    }
}



