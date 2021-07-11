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
//using static you can update the variable but not apply to create new ones, it will just update the one exist


instance variables
