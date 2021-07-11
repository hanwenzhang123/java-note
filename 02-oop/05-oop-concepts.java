reference vs object vs instance vs class
  
"class" - a blueprint for a house, using the blueprint(plans) we can build as many houses as we like based on those plan.
  each house you build (in other words "instantiate" using the "new" operator) is an "object" also known as an "instance".
  each house you build has an address (a physical location).
  in other words if you want to tell someone where you live, you give them your address(perhaps written on a piece of paper)
    this is known as a "reference".
  you can copy that "reference" as many times as you like but there is still just one house. 
    in other words, we are copying the paper that has addess on it not the house itself
  we can pass "reference" as "parameters" to "constructors" and "methods"
    
    
this vs super - this() and super()
    
The keyword "super" is used to access/call the parent class members (variable aand methods)
  "super" is commonly used with method overriding when we call a method with the same name from the parent class.
    in other words, it is calling the method with the same name from the parent class.
The keyword "this" is used to call the current class members (variable and methods)
  This is required when we have a parameter with the same name as an instance variable (field)
  "this" is commonly used with constructor and setters, and optional in getters
  must be the first statement to call in a constructor.
Note: we can use both anywhere in a class except static areas (the static block or a static method)


Method overloading vs overiding

method overloading means providing two or more separate methods in a class with the same name but different paraameters
  method return type may or may not be different and that allows us to reuse the same method name
overloading is very handy, it reduces duplicated code and we do not have to remember mutiple method names
overloading does not have anything to do with polymorphism, but java developers often refer to overloading as compile time polymorphism
  in other words, the compiler decides which methods to be called based on method name, return type and argument list
  we can overload static and instance methods
- methods must have the same method names
- methods must have different parameters

method overriding means defining method in a child class that already exists in the parent class with same signatures (same name and parameters)
  it is also known as runtime polymorphism and dynamic method dispatch, because the method is going to be called is decided at runtime by JVM
@Override immediate above the method definition
- must have the same names and arguments
- return types can be a subclass of the return type in the parent class
- it can not have a lower access modifier
Only inheritated methods can be overriden, only in child class
  constructor and private methods can not be overridden
  methods that are final can not be overriden
  a subclass can use super.methodName() to call the superclass version of an overridden method

  
Static vs Instance Methods

static methods are declared using static modifier
static methods can not access instance methods and variables directly
usually used for operations that do not require any data from an instance of the class
we do not and can not use this keyword
whenever you see a method does not use instance variable that method should be declared as a static method
for examplee, main is a static method and it is called by the JVM when it starts an application

public class Main {
  public static void main (String[] args){
  }
}

instance methods belong to an instance of a class.
to use an instance method, we have to instantiate the class first usually by using the new keyword.
instance methods can access instance methods and variables directly
instance methods aalso can access static methods and variables directly

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
every instance of that class shares the same static variable
if changes are made to that variable, all other instances will see the effect of the change
when reading user input using Scanner, we will declare scanner as aa static variables are
all static methods can access that scanner directly

class Dog {
  private static String name;
  public Dog (String name) {
    Dog.name = name;
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

instance variables
