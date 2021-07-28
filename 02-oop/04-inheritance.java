OOP allows us to inherit commonly used standard behavior from other classes
Using the keyword "extends" like "public class Dog extends Animal"
Using the keyword "super" in the constructor to call the constructor that is for the class that we are extending from
  like super(name, brain, body, size, weight);
Using the keyword "@Override" to override from parent objects
    public void eat() {
        chew(); //call the one in dog class
        super.eat();  //call the parent class
    }
    
Parent class, superclass, and base class refer to the class that another class inherits from (like Shape).
Child class, subclass, and derived class refer to a class that inherits from another class (like Triangle).
class Shape {
  // Shape class members
 }
class Triangle extends Shape {
  // additional Triangle class members
}

Java will automatically (and secretly) call super() as the first line of your child class constructor.

//Animal.java
public class Animal {

    //create field for the Animal class
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    //constructors - used when we make a new animal passing in with corresponding parameters
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //all animal eats, we can create methods for this parent class
    public void eat() {
        System.out.println("Animal.eat() called");
    }
    
    //methods for animal class and public to other sub-classes like dog
    public void move(int speed) { //pass the parameter
        System.out.println("Animal.move() called.  Animal is moving at " +speed);

    }

    //Getters - allow us to access to it later
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}

//Dog.java
public class Dog extends Animal { //extends from Animal, so we will be able to get things like brain, body, size

  //fields for the Dog class, applies to dogs but not all animals
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
  
  //set the constructor
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) { //with based animal fields (the ones that are unique) plus dog fields
        super(name, 1, 1, size, weight);  //using super keyword, since we know all dogs have brains and bodies so we can just put a '1' and delete from the parameter
        this.eyes = eyes; //update all fields 
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

  //specific dog method, a private method not accessible
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override   //keyword to override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew(); //call the one in dog class
        super.eat();  //call the parent class
    }
    
    public void walk() {
        System.out.println("Dog.walk() called");  //local dog walk
        super.move(5);  //move method from super parent class
    }

    public void run() { //once run called
        System.out.println("Dog.run() called");
        move(10); //move called from the override method below
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");  //this print out once moveLegs method called
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");//This print once local move called
        moveLegs(speed);  //moveLegs method called 
        super.move(speed);  //super move
    }
}

//Main.java
public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5, 5); //create an animal

      Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");  //create a dog
      dog.eat();
      dog.walk();  //dog.walk - animal.move
      dog.run();  //dog.run - dog.move - dog.moveLegs - animal.move
    }
}

 
//Fish.java
public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {	//constructor
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {	//Fish.rest()
    }
    private void moveMuscles() {	//Fish.moveMuscles()
    }
    private void moveBackFin() {	//Fish.moveBackFin()
    }	
    private void swim(int speed) {	//Fish.swim({speed}), once it called, all below methods will be called
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
