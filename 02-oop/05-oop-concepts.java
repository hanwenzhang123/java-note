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




Static vs Instance Variable
