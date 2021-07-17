Consider the relationship - IS-A? HAS-A? CAN?

//Differences - Abstract Classes vs Interfaces
An interface, the entire interface is completely abstract and there is no implementation, no opportunity to enter fields.
  just specify the methods that were gonna be used for the interface
    a class that was implementing that particular interface has to fill in order to make it valid
      interface can have variables but all public static final variables (constant value with a static scope)
      You can not instantiate an interface, also can not have constructors.
      All the code has to actually written in the class that implements the particular interface
An abstract class, we can mix it up, add fields, add regular methods, constructos, can have any visibility
  we can also specify that certain methods are abstract
  it can have member variables that are inherited which can not be done in interface
  
//Summary
Abstract class
  - abstract class are similar to interfaces. you can not instantiate them, and they may contain a mix of methods declared with or without an implementation
  - you can declare fields that are not static and final, and define public protected and private concrete methods
  - an abstract class can extend only one parent class but it can implement multiple interfaces
  - when an abstract class is subclassed, the subclass usually provides implementation for all of the abstract methods in its parent class
  - however, if it does not, then the subclass must also be declared abstract

use an Abstract class when...
  - you want to share code among several closely related classes (animal - with fields name, age ...)
  - you expect classes that extend your abstract class to have many common methods or fields or required access modifier other than public
  - you want to declare non static or non final fields (for example name, age). 
    this enables you to define methods that can access and modify the state of an object (getName, setName)
  - when you have a requirement for your base class to provide a default implementation of certain methods but other methods should be open to being overridden by child classes
  summary: the purpose is to provide a common definition of a base class that multiple derived classes can share
  
Interfaces
  - An interface just the declaration of methods of an class, it is not the implementation
  - in an interface, we define what kind of operation an object can perform
    these operations are defined by the classes that implement the interface
  - interfaces form a contract between the class and the outside world, this contract is enforced at build time by the compiler
  - you can not instantiate them, and they may contain a mix of methods declared with or without an implementation
    all methods in interfaces are automatically public and abstract
  - an interface can extend another interface
  - interfaces are more flexible and can deal with a lot more stress on the design of your program than the implementation
  - by introducing interfaces into your program, you are really introduce points of variation at wchich you can plug in different implementation for that interface
    an interfaces primary purpose is abstraction, decoupling the what from the how
  - interfaces can contain default methods with implementation with default keyword can also contain private nethods
    
use an Interfaces when...
  - you expect that unrelated classes will implement your interface  
    the interfaces comparable and cloneable are implemented by many unrelated classes
  - you want to specify the behvior of a particular data type, but you are not concerned about who implements its behavior
  - you want to separate different behavior
  - The collection API, we have the link interface and implementation arraylist and linkedlist 
  - the JDBC API, almost only exist interfaces. the concrete implementations are provided as JDBC drivers. 
      this enables you to write all the JDBC code independent of the database vendor.
    
  
//CanFly.java
public interface CanFly {
    void fly();
}

//Bird.javaa
public abstract class Bird extends Animal implements CanFly
{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
