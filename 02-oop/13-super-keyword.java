The java super keyword is what you use if you want to use a method or variable from a parent class without having to make it. 
  Making an object can be annoying and can make code confusing, 
so we use the super keyword to refer to the superclass instead of making an object from that class.
 
//variable
class Vehicle {   //class is the blueprint, properties as variables
  int maxSpeed = 120;
  
}

class Car extends Vehicle { //using the extends, this class knows everything that the parent class has
  //using super to refer to the parent class Vehicle
  
  int maxSpeed = 100;
  
  public void display(){
    System.out.println(maxSpeed); //here is 100
//  System.out.println(super.maxSpeed); //120 due to super class
  }
}

class Main {
 public static void main(String [] agrs] {
   Car c = new Car();    //making a car object
   c.display(); //100
 }
}
                         

//methods   
// using method from the parent class by using super keyword
class Vehicle { 
  public void vroom(){
    System.out.println("Vroom Vroom"); 
  }
}

class Car extends Vehicle { 
  public void vroom(){
//  super.vroom();  //the parent method "Vroom Vroom"
    System.out.println("SKUUUURT"); 
  }
}
class Main {
 public static void main(String [] agrs] {
   Car c = new Car();    //making a car object
   c.vroom();   //"SKUUUURT" priortize its own method
 }
}
                         
                         
//constructor
class Vehicle { 
  int maxSpeed;
  vehicle() {   //constructor
    System.out.println("Vehicle constructor!"); 
  }
  vehicle(int maxSpeed){
    System.out.println("Vehicle constructor with speed!"); 
    this.maxSpeed = maxSpeed;   //this refers to the class its in while super refers to the parent
  }   //this maxspeed equals to the parameter maxspeed
}

class Car extends Vehicle { 
  car() {   //constructor
    super();  //above everything
    System.out.println("Car constructor!"); 
  }
}
                         
class Main {
 public static void main(String [] agrs] {
   Car c = new Car();    //making a car object, which run both
 }
}
           
