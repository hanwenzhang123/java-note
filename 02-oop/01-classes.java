state - stores its sate in fields - variables
behavior - methods

class as a template or a blueprint for creating objects

public/private - access modifier
private - you can not access that variable outside of the code block
  //always go with private inside the class

public class Main {} - a statement which creates a new class in java


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



