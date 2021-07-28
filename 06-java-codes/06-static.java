Static - share one copy of that variable with all instances of the class
    Static methods are associated with a class, not an object of the class. As a result, static methods have no this reference.
    
- Static methods and variables are associated with the class as a whole, not objects of the class.
- Static methods and variables are declared as static by using the static keyword upon declaration.
- Static methods cannot interact with non-static instance variables. This is due to static methods not having a this reference.
- Both static methods and non-static methods can interact with static variables.

//StaticTest.java
public class StaticTest {
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() { //nothinng to prevent static method to access non static field and methods in another class
        return numInstances;
    }

    public String getName() {
        return name;
    }
}


//Main.java
public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
//	      StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());  //1 with static, without static 1

//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances()); //2 with static, without static 1

//        StaticTest thirdInstance = new StaticTest("3rd instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());  //3 with static, without static 1

//we can use StaticTest.getNumInstances() because we initiated with static which means a starting point, without static, firstInstance.getNumInstances()
      
        // java com.company._static.Main
        int answer = multiply(6);
        System.out.println("The answer is " + answer);  //42; if without static, non static method can not be referenced from a static context
        System.out.println("Multiplier is " + multiplier);  //7; if without static, non static field can not be referenced from a static context
    }

    public static int multiply(int number) {  //static like an accessing point, enables other classes to access this class
        return number * multiplier;
    }
}
