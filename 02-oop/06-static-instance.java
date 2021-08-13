Static vs Instance Methods

static methods are declared using static modifier
static methods can not access instance methods and variables directly
usually used for operations that do not require any data from an instance of the class
we do not and can not use this keyword
whenever you see a method does not use instance variable that method should be declared as a static method
static methods have direct access from other objects
for example, main is a static method and it is called by the JVM when it starts an application

public class Main {
  public static void main (String[] args){
  }
}

instance methods belong to an instance of a class.
to use an instance method, we have to instantiate the class first usually by using the "new" keyword.
instance methods can access instance methods and variables directly
instance methods also can access static methods and variables directly

class Dog {
  public void bark(){
  }
}
public class Main {
  public static void main (String[] args){
    Dog rex = new Dog();  //create instance
    rex.bark(); //call instance method
  }
}


Static vs Instance Variable

static variables declared using the keyword static 
static variables are also known as static member variables
* every instance of that class shares the same static variable
* if changes are made to that variable, all other instances will see the effect of the change
when reading user input using Scanner, we will declare scanner as a static variables.
all static methods can access that scanner directly.

//example - static
class Dog {
  private static String name; //static keyword
  public Dog (String name) {
    Dog.name = name;  //not using this but the name of the claass
  }
  public void printName(){
    System.out.println("name= " + name);
  }
}
public class Main {
  public static void main (String[] args){
    Dog rex = new Dog("rex");  //create instance
    Dog fluffy = new Dog("fluffy"); //create instance
    rex.printName();  //fluffy
    fluffy.printName(); //fluffy
  }
} //static shares between instances, if we change the static then all instances will see that change we made
//using static you can update the variable but not apply to create new ones, it will just update the one exist
//static is used for shared variable


instance variables
they do not use the static keyword
instance variables are known as field or member variables
instance variables belong to an instance of a class
every instance has its own copy of an instance variable
every instance can have a different value (state)
instance variables represent the state of an instance of a class

  //example - instance
class Dog {
  private String name;  //just the regular, not static
  public Dog (String name) {
    this.name = name;
  }
  public void printName(){
    System.out.println("name= " + name);
  }
}
public class Main {
  public static void main (String[] args){
    Dog rex = new Dog("rex");  //create instance
    Dog fluffy = new Dog("fluffy"); //create instance
    rex.printName();  //rex
    fluffy.printName(); //fluffy
  }
}
 //when using instance, we create its own individual variables
