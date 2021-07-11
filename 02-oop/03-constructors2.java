//VipPerson.java

public class VipPerson {
  //declare fields for this class
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson() {  //default one, empty parameters
        this("Default name", 50000.00, "default@email.com");
    }
  
    public VipPerson(String name, double creditLimit) { //3rd parameter default
        this(name, creditLimit, "unknown@email.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {  //main constructors, call all the values
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() { //getter
        return name;
    }

    public double getCreditLimit() {  //getter
        return creditLimit;
    }

    public String getEmailAddress() { //getter
        return emailAddress;
    }
}


//Main.java
public class Main {

    public static void main(String[] args) {
      
        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
      
    }
}
